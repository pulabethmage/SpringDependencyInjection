package co.urbanraw.ApplicationContextApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary ( we can use either Primary in here or we can add Qualifier in the Samsung class
public class MediaTek implements MobileProccesor {

	public void process() {
		
		System.out.println("Second Best processor MediaTek..!");

	}

}
