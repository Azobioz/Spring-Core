package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;

public class MyPointcuts {

    @Pointcut("execution(* abc*(..))")
    public void allAddMethods() {}



}
