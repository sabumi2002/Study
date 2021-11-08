package org.example.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.TodoEntity;
import org.example.model.TodoRequest;
import org.example.service.TodoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TodoController.class)
class TodoControllerTest {

  @MockBean
  TodoService todoService;

  @Autowired
  MockMvc mvc;

  private TodoEntity expected;

  @BeforeEach
  void setup( ) {  // 각 테스트 메소드가 실행되기전마다 expected의 값을 초기화시킨다
    this.expected = new TodoEntity();
    this.expected.setId(123L);
    this.expected.setTitle("TEST TITLE");
    this.expected.setOrder(0L);
    this.expected.setCompleted(false);
  }

  @Test
  void create() throws Exception {
    when(this.todoService.add(any(TodoRequest.class)))  // TodoRequest를 받으면
            .then((i) -> {  // 받은 request를 기반으로
              TodoRequest request = i.getArgument(0, TodoRequest.class);
              // 받은 request 기반으로 new TodoEntity 생성
              return new TodoEntity(this.expected.getId(),
                                    request.getTitle(),
                                    this.expected.getOrder(),
                                    this.expected.getCompleted());
            });
    TodoRequest request = new TodoRequest();
    request.setTitle("ANY TITLE");

    // request를 body로 넣어야하는데 오브젝트타입자체로 넣을수없기떄문에 objectMapper를 써서 body에 넣어줌
    ObjectMapper mapper = new ObjectMapper();
    // request를 String형태로 바꿈
    String content = mapper.writeValueAsString(request);

    this.mvc.perform(post("/")
            .contentType(MediaType.APPLICATION_JSON)
            .content(content))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.title").value("ANY TITLE"));
  }

  @Test
  void readOne() {
  }
}