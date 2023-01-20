public class Main {
	public static void main(String[] args) {
		Battery battery = new Battery(27);
		Smartphone phone = new Smartphone(battery);
		phone.setName("Xiaomi");
		phone.open();
	}
}
