package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.model.TodoEntity;
import org.example.model.TodoRequest;
import org.example.model.TodoResponse;
import org.example.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@AllArgsConstructor
@Controller
public class PageController {
  private final TodoService service;

  @RequestMapping("/main")
  public String main(){
    return "main.html";
  }


  @PostMapping("/user")
  public ResponseEntity<TodoResponse> create(@RequestBody TodoRequest request) {

    if (ObjectUtils.isEmpty(request.getTitle()))
      return ResponseEntity.badRequest().build();

    if (ObjectUtils.isEmpty(request.getOrder()))
      request.setOrder(0L); // default 값 입력

    if (ObjectUtils.isEmpty(request.getCompleted()))
      request.setCompleted(false);

    TodoEntity result = this.service.add(request);
    return ResponseEntity.ok(new TodoResponse(result));
  }
}
