package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.model.TodoEntity;
import org.example.model.TodoRequest;
import org.example.model.TodoResponse;
import org.example.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin  // CORS(Cross-origin resource sharing)
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자를 만듦
@RestController
@RequestMapping("/")  // 베이스 url 설정
public class TodoController {
  private final TodoService service;

  @PostMapping
  public ResponseEntity<TodoResponse> create(@RequestBody TodoRequest request) {
    System.out.println("CREATE");

    if (ObjectUtils.isEmpty(request.getTitle()))
      return ResponseEntity.badRequest().build();

    if (ObjectUtils.isEmpty(request.getOrder()))
      request.setOrder(0L); // default 값 입력

    if (ObjectUtils.isEmpty(request.getCompleted()))
      request.setCompleted(false);

    TodoEntity result = this.service.add(request);
    return ResponseEntity.ok(new TodoResponse(result));
  }
  @GetMapping("{id}") // localhost:8080/1 처럼 id를 입력해주어야함
  public ResponseEntity<TodoResponse> readOne(@PathVariable Long id){
    System.out.println("READ ONE");
    TodoEntity result = this.service.searchById(id);
    return ResponseEntity.ok(new TodoResponse(result));
  }
  @GetMapping
  public ResponseEntity<List<TodoResponse>> readAll(){
    System.out.println("READ ALL");
    List<TodoEntity> list = this.service.searchAll();
    List<TodoResponse> response = list.stream().map(TodoResponse::new).collect(Collectors.toList());
    return ResponseEntity.ok(response);
  }
  @PatchMapping("{id}") // localhost:8080/1 처럼 id를 입력해주어야함
  public ResponseEntity<TodoResponse> update(@PathVariable Long id, @RequestBody TodoRequest request){
    System.out.println("UPDATE");
    TodoEntity result = this.service.updateById(id, request);
    return ResponseEntity.ok(new TodoResponse(result));
  }
  @DeleteMapping("{id}")  // localhost:8080/1 처럼 id를 입력해주어야함
  public ResponseEntity<?> deleteOne(@PathVariable Long id){
    System.out.println("DELETE");
    this.service.deleteById(id);
    return ResponseEntity.ok().build(); // 리턴값이 없다.
  }
  @DeleteMapping
  public ResponseEntity<?> deleteAll(){
    System.out.println("DELETE ALL");
    this.service.deleteAll();
    return ResponseEntity.ok().build();
  }
}
