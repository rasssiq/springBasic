package javabrains;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) {
//		Triangle triangle= new Triangle();
	
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape shape=(Shape) context.getBean("circle");
		shape.draw();
		//System.out.println(context.getMessage("greeting",null, "Default Greeting",null));
		
		
	}

}
