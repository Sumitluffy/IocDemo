package com.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//@Scope("prototype")
@Component
public class Demo {
	@Qualifier("sampleimpl")
	@Autowired
	MyInterface MyInterface;

	public MyInterface getMyInterface() {
		return MyInterface;
	}

	public void setMyInterface(MyInterface myInterface) {
		MyInterface = myInterface;
	}
	
	
	
}
