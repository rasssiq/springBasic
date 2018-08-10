package javabrains;

import java.awt.Event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class MyEventListener implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(!event.getClass().getName().equals("org.springframework.context.event.ContextClosedEvent"))
		System.out.println(event.toString());
		//System.out.println(event.getClass().getName());
	}

}
