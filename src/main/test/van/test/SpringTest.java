package van.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SpringTest {
    @Test
    public void testSpring(){
//        获取上下文
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
//        获取SpringTest类
        SpringTest springTest = (SpringTest) applicationContext.getBean("springTest");
        springTest.helloSpring();
    }
    public void helloSpring(){
        System.out.println("hello Spring!");
    }
}
