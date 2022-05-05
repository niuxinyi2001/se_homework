public abstract class HotpotStore {

	abstract Hotpot createHotpot(String item);

	public Hotpot orderHotpot(String type) {
		Hotpot hotpot = createHotpot(type);
		System.out.println("--- Making a " + hotpot.getName() + " ---");
		hotpot.prepare();
		hotpot.boil();
		hotpot.serve();
		return hotpot;
	}
}