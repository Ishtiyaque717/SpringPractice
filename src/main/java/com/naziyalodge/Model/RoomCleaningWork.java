package com.naziyalodge.Model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class RoomCleaningWork implements Work {

	public void doWork() {
		
		System.out.println("All rooms cleaned");
	}

}
