package com.naziyalodge.Model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naziyalodge.config.NaziyaLodgeConfig2;

public class UtillClass {
	public static void main(String[] args) {
		/*
		 * Employee e1= new Employee(); e1.name= "mudabbir"; e1.salary=500; Work obj1=
		 * new RoomCleaningWork(); e1.work=obj1; e1.employeeWork(); Work obj2= new
		 * CustomerEntryWork(); e1.work=obj2; e1.employeeWork();
		 */
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		ctx.register(NaziyaLodgeConfig2.class);
		ctx.refresh();
	//	Employee o1 = ctx.getBean(Employee.class);
		Employee o2 =ctx.getBean(Employee.class);
		
		o2.employeeWork();

		System.out.println("hello");
	}
}
