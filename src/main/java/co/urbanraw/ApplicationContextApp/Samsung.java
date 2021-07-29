package co.urbanraw.ApplicationContextApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	@Autowired
	@Qualifier("mediaTek")//We can call Qualifier if we dont use Primary in MediaTek or in Snapdragon
	MobileProccesor cpu;
	
	public MobileProccesor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProccesor cpu) {
		this.cpu = cpu;
	}

	public void config()
	{
		System.out.println("12MB Camera 2GB ram Snapdragon..");
		cpu.process();
	}
	
}
