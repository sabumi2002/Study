package org.example.repository;

import org.example.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// 제네릭으로<데이터베이스 테이블과 연결될 객체와 해당객체의 id 필드타입>을 넣어준다.
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
}
