package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

    @Before("execution(public String getName())")
    public void getNameAdvice() {
        System.out.println("Execute Advice on getName()");
    }


    @Before("execution(* service.*.get*())")
    public void getAllAdvice() {
        System.out.println("Service method getter called");
    }
}
