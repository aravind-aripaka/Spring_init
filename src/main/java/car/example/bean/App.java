package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationBeanContext.xml");
        // from context we requested the bean
        MyBean myBean = (MyBean) context.getBean("myBean");
        //myBean.setMessage("Hello i am the bean");
        System.out.println(myBean);
    }
}


