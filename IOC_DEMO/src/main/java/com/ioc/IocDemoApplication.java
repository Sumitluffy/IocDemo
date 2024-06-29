package com.ioc;

import org.ioc.MyDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ioc,org.ioc")
public class IocDemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext cac	=SpringApplication.run(IocDemoApplication.class, args);
		/*Demo d=new Demo();
		System.out.println(d.hashCode());
		d.setMsg("Hello world!!!");		
		System.out.println(d.getMsg());
		
		
		Demo d1=new Demo();
		System.out.println(d1.hashCode());
		
	Demo d=	cac.getBean(Demo.class);
	System.out.println(d.hashCode());
	d.setMsg("Hello world!!!");		
	System.out.println(d.getMsg());
	
	
	Demo d1=	cac.getBean(Demo.class);
	System.out.println(d1.hashCode());
	d.setMsg("Hello world!!! again");		
	System.out.println(d.getMsg());
	
	
	
		
	MyDemo md=cac.getBean(MyDemo.class);
	md.setMessage("hello mydemo");
	System.out.println(md.getMessage());*/

//	Product p=cac.getBean(Product.class);
//	p.setPid(1);
//	p.setPname("ponds");
//	p.setPrice(15);
//	System.out.println(p);
//	
//	Order o= cac.getBean(Order.class); 
//	o.setOid(1);
//	//o.setProduct(p);	
//	System.out.println(o);
	
	Demo d=cac.getBean(Demo.class);
	d.getMyInterface().getMessage();
	
	System.out.println("*********************");
	
	MyDemo md=	cac.getBean(MyDemo.class);
	md.getMyInterface().getMessage();
	}

}
