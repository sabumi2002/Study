package com.example.restaurant.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// implements- 상속받겠다
// 제네릭타입 T에 와일드카드로 MemoryDbEntity를 상속받은 제네릭타입이 필요하다
abstract public class MemoryDbRepostoryAbstract<T extends MemoryDbEntity> implements MemoryDbRepositoryIfs<T>{

    private final List<T> db= new ArrayList<>();
    private int index= 0;

    @Override
    public Optional<T> findById(int index) {
//        findFirst()는 filter 조건에 일치하는 element 1개를 Optional로 리턴한다. 조건에 일치하는 요소가 없다면 empty가 리턴된다.
        return db.stream().filter(it -> it.getIndex() == index).findFirst();
    }

    @Override
    public T save(T entity) {
        var optionalEntity = db.stream().filter(it -> it.getIndex() == entity.getIndex()).findFirst();
        if(optionalEntity.isEmpty()) {
//          db에 데이터가 없는 경우
            index++;
            entity.setIndex(index);
            db.add(entity);
            return entity;
        }else{
//            db에 이미 데이터가 있는 경우
//            이미 있는 index를 가져와서 새로운 데이터에 setIndex를 이용해서 세팅해준다.
            var preIndex = optionalEntity.get().getIndex();
            entity.setIndex(preIndex);
//            기존에 있는 데이터를 지운다
            deleteById(preIndex);
//            새로받은 entity를 넣어준다
            db.add(entity);
            return entity;
        }
    }

    @Override
    public void deleteById(int index) {
        var optionalEntity = db.stream().filter(it -> it.getIndex() == index).findFirst();
        if(optionalEntity.isPresent()){
            db.remove(optionalEntity.get());
        }
    }

    @Override
    public List<T> listAll() {
        return db;
    }
}
