package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAfterAspect {
    @After("args(name)")
    public void logStringArguments(String name) {
        System.out.println("Running After Advice. String argument passed=" + name);
    }

    //We can use within in pointcut expression to apply advice to all the methods in the class
    @AfterThrowing("within(model.Employee)")
    public void logExceptions(JoinPoint joinPoint) {
        System.out.println("Exception thrown in Employee Method=" + joinPoint.toString());
    }

    //We can use @AfterReturning advice to get the object returned by the advised method.
    //returning specify name of returned variable
    @AfterReturning(pointcut = "execution(* getName())", returning = "returnString")
    public void getNameReturningAdvice(String returnString) {
        System.out.println("getNameReturningAdvice executed. Returned String=" + returnString);
    }
}
