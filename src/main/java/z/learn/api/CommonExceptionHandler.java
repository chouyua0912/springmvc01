package z.learn.api;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler
    public void handleException(Throwable throwable) {
        System.out.println(throwable);      // DispatcherServlet 通过分发结果处理调用到 这里来
    }
}
