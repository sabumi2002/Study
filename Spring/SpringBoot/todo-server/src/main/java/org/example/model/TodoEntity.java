package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data //롬복 data @ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor
@Entity //jpa Endity
@NoArgsConstructor  // 파라미터가 없는 기본 생성자를 생성
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자를 만듦
public class TodoEntity {
  @Id // 해당 프로퍼티가 테이블의 주키역할을 한다는것을 나타낸다.
  @GeneratedValue(strategy = GenerationType.IDENTITY) // 주키생성전략= DB의 identity컬럼을 이용하겠다
  private Long id;
  @Column(nullable = false)
  private String title;
  @Column(name = "todoOrder", nullable = false)
  private Long order;
  @Column(nullable = false)
  private Boolean completed;
}
