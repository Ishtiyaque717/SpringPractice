package com.naziyalodge.Model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CustomerEntryWork implements Work {

	public void doWork() {
		System.out.println("Customer Entry done");
	}

}
