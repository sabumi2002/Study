package com.example.restaurant.wishlist.repository;

import com.example.restaurant.wishlist.entity.WishListEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WishListRepositoryTest {
  @Autowired
  private WishListRepository wishListRepository;

  private WishListEntity create(){
    var wishList = new WishListEntity();
    wishList.setTitle("title");
    wishList.setCategory("category");
    wishList.setAddress("address");
    wishList.setReadAddress("readAddress");
    wishList.setHomePageLink("");
    wishList.setImageLink("");
    wishList.setVisit(false);
    wishList.setVisitCount(0);
    wishList.setLastVisitData(null);

    return wishList;
  }
  @Test
  public void saveTest() {
    var wishListEntity = create();
    var expected = wishListRepository.save(wishListEntity);

    Assertions.assertNotNull(expected);
    Assertions.assertEquals(1, expected.getIndex());

  }
  @Test
  public void findByIdTest() {
    var wishListEntity = create();
    wishListRepository.save(wishListEntity);

    var expected = wishListRepository.findById(1);

    Assertions.assertEquals(true, expected.isPresent());
    Assertions.assertEquals(1, expected.get().getIndex());
  }
  @Test
  public void deleteTest() {

  }
  @Test
  public void listAllTest() {

  }
}
