package com.ioc;

import org.springframework.stereotype.Component;

@Component(value="sampleimpl")
public class SampleImpl implements MyInterface {

	@Override
	public void getMessage() {
		System.out.println("SampleImpl another implementation class of MyInterface");

	}

}
