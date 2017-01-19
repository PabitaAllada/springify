package io.projects.springify;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
	
public static void main(String[] args)
{
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
	
	Hello hello1=context.getBean(Hello.class);
	hello1.sayHello("This is my springify program!!");
	
	Hello hello2=context.getBean(Hello.class);
	System.out.println(hello1==hello2);
	context.close();
}
}
