package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoResponse {
  private Long id; // Entity의 모든값을 내려줄수있어야하니 Long타입으로 만듦
  private String title;
  private Long order;
  private Boolean completed;
  private String url;

  public TodoResponse(TodoEntity todoEntity) {
    this.id = todoEntity.getId();
    this.title = todoEntity.getTitle();
    this.order = todoEntity.getOrder();
    this.completed = todoEntity.getCompleted();

    this.url = "http://localhost:8080/" + this.id;
  }
}
