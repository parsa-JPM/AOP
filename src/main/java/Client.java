import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.EmployeeService;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        EmployeeService service = context.getBean(EmployeeService.class);

        service.getEmployee().setName("test");
        System.out.println(service.getEmployee().getName());
        //it's throw real exception ( with this caption -> Dummy exception)
//        service.getEmployee().throwException();
    }
}
