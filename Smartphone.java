public class Smartphone {
	Battery battery;
	String name;

	public Smartphone(Battery battery) {
		this.battery = battery;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean open() {
		if(battery.getPercent() > 0) {
			System.out.println("Welcome\n" + name + "\n" + "Battery : " +battery.getPercent());
			return true;
		}
		System.out.println("Battery Low");
		return false;
	}
}
