package co.urbanraw.ApplicationContextApp;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

	@Autowired
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
