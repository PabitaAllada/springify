package io.projects.springify;

import org.springframework.stereotype.Component;

@Component 
public class Hello {

	public void sayHello(String str) {
		// TODO Auto-generated method stub
		System.out.println("Hello!" +str);
	}
}
