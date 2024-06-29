package org.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.ioc.MyInterface;

@Component
public class MyDemo {
private String message;
@Autowired
private MyInterface myInterface;
public MyInterface getMyInterface() {
	return myInterface;
}

public void setMyInterface(MyInterface myInterface) {
	this.myInterface = myInterface;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

}
