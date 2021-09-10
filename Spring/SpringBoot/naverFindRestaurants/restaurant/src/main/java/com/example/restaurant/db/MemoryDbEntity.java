package com.example.restaurant.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
/*DB가 써야할 entity를 모아둔곳
모든 DB를 가진애들은 메모리엔티티를 상속받을거다*/
public class MemoryDbEntity {
   protected int index;
}
