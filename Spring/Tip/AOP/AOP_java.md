import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
    // write your code here
        Exam exam = new NewlecExam(1, 1, 1, 1);
        Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(),
                new Class[]{Exam.class},
                new InvocationHandler() {

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        long start = System.currentTimeMillis();
                        Object result = method.invoke(exam, args);  // 원래 객체 메소드
                        long end = System.currentTimeMillis();
                        String message = (end-start)+"ms 시간이 걸렸습니다.";
                        System.out.println(message);
                        return result;
                    }
                }
        );
    }

}

exam을 proxy로 복제한다.
proxy 인스턴스를 생성한다.
// Proxy.newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)

public Object invoke() 앞뒤로 corss-cutting 한다.

result를 반환한다
