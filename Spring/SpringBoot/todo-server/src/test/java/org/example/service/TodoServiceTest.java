package org.example.service;

import org.example.model.TodoEntity;
import org.example.model.TodoRequest;
import org.example.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.AdditionalAnswers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class) // Mock 객체 사용
class TodoServiceTest {

  @Mock // 외부시스템에 의존하지않고 자체시스템을 사용하기위해 사용, 유닛테스트는 네트워크나 DB에 연결이 안된다고 실행이 불가능해지면 안되기때문에
        // 서비스에 사용되는 데이터가 함부로 변경되면 안되기때문에 test를 진행할때 실제 DB에 연결해서 사용하지않는다.
  private TodoRepository todoRepository;

  @InjectMocks  // Mock을 주입 받아서 사용할 todoService 필드에 생성
  private TodoService todoService;

  @Test
  void add() {
    when(this.todoRepository.save(any(TodoEntity.class))) // any()는 어떤 매개변수가 와도 상관없다란 의미
            .then(AdditionalAnswers.returnsFirstArg()); // 첫번째 인자를 반환한다

    TodoRequest expected = new TodoRequest();
    expected.setTitle("Test Title");

    TodoEntity actual = this.todoService.add(expected);

    assertEquals(expected.getTitle(), actual.getTitle());
  }

  @Test
  void searchById() {
    TodoEntity entity = new TodoEntity();
    entity.setId(123L);
    entity.setTitle("TITLE");
    entity.setOrder(0L);
    entity.setCompleted(false);
    Optional<TodoEntity> optional = Optional.of(entity);  // Optional - null값 유무 확인 및 대처

    given(this.todoRepository.findById(anyLong()))
            .willReturn(optional);

    TodoEntity actual = this.todoService.searchById(123L);

    TodoEntity expected = optional.get();

    assertEquals(expected.getId(), actual.getId());
    assertEquals(expected.getTitle(), actual.getTitle());
    assertEquals(expected.getOrder(), actual.getOrder());
    assertEquals(expected.getCompleted(), actual.getCompleted());
  }

  @Test
  public void searchByIdFailed(){
    given(this.todoRepository.findById(anyLong()))
            .willReturn(Optional.empty());  // willReturn - ()안에있는 객체를 무조건 리턴한다란 뜻
                                            // Optional.empty() - 빈 Optional객체 생성

    assertThrows(ResponseStatusException.class, () -> {
      this.todoService.searchById(123L);
    });
  }
}