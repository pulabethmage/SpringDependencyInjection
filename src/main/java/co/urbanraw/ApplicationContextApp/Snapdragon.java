package co.urbanraw.ApplicationContextApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary ( we can use either Primary in here or we can add Qualifier in the Samsung class
public class Snapdragon implements MobileProccesor{

	public void process() {
		
	System.out.println("Best processor in the town Snapdragon..!");
		
	}
	
}
