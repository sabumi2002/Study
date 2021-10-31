target의 kor 점수가 100 을 초과하면 Throw해서 에러를 알려줌

interface는 ThrowsAdvice
인터페이스에 메소드가 없어 직접 작성해야한다. method는 afterThrowing

public class LogAfterThrowingAdvice implements ThrowsAdvice {
public void afterThrowing(IllegalArgumentException e) throws Throwable {
System.out.println("예외가 발생하였습니다.: " + e.getMessage());
}
}
