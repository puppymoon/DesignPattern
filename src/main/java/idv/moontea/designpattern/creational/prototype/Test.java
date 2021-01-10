package idv.moontea.designpattern.creational.prototype;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		Seal seal = new Seal();
		seal.setFlavor("salt");
		seal.setOilType("greasy");
		Seal newSeal = new SealCopy().copySeal(seal);

		System.out.println("seal.toString: " + seal.toString());
		System.out.println("seal.flavor: " + seal.flavor);
		System.out.println("seal.oilType: " + seal.oilType);
		System.out.println("newSeal.toString: " + newSeal.toString());
		System.out.println("newSeal.flavor: " + newSeal.flavor);
		System.out.println("newSeal.oilType: " + newSeal.oilType);

	}

}
