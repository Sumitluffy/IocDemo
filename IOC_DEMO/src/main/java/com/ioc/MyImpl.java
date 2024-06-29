package com.ioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component(value = "myimpl")
public class MyImpl implements MyInterface {

	@Override
	public void getMessage() {
		System.out.println("This is from MyImpl which implement MyInterface");

	}

}
