package co.urbanraw.ApplicationContextApp;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	public void drive()
    {
    	System.out.println("Car Driving...");
    }
}
