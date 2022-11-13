package com.naziyalodge.Model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@Configuration
public class NaziyaLodgeConfig {
	@Bean
	RoomCleaningWork roomCleaningobj() {
		RoomCleaningWork obj1 = new RoomCleaningWork();

		return obj1;
	}
	@Primary
	@Bean
	CustomerEntryWork customerEntryobj() {
		CustomerEntryWork obj2 = new CustomerEntryWork();
		return obj2;
	}
	@Bean
	Employee employeeObj(Work args1) {
		Employee obj3= new Employee();
		obj3.setName("Mudabbir");
		obj3.setSalary(500);
		obj3.setWork(args1);
				
		return obj3;
	}
	
}
