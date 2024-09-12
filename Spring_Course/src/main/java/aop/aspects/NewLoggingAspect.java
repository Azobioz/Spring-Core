package aop.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed(); // кидает Throwable
        }
        catch(Exception ex) {
            System.out.println("aroundReturnBookLoggingAdvice: было поймано исключение " + ex);
            targetMethodResult = "Неизвестное название книги"; //Делаю т.к. иначе будет просто null
        }

//        targetMethodResult = "Золотая рыба"; // Можно менять результат метода
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу");

        return targetMethodResult;

    }

}
