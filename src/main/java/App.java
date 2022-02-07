import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        boolean comparison = bean == bean2;
        System.out.println(comparison);

        System.out.println("***********************************");

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getId());

        Cat beanCat2 = (Cat) applicationContext.getBean("cat");

        boolean comparisonCat = beanCat == beanCat2;
        System.out.println(comparisonCat);
    }
}