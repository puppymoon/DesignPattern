package idv.moontea.designpattern.creational.singleton;

public class Test {

	public static void main(String[] args) {

		Singleton singleton1 = Singleton.getInstance();
		System.out.println("singleton1.toString(): " + singleton1.toString());
		System.out.println("singleton1.hashCode(): " + singleton1.hashCode());

		Singleton singleton2 = Singleton.getInstance();
		System.out.println("singleton2.toString(): " + singleton2.toString());
		System.out.println("singleton2.hashCode(): " + singleton2.hashCode());

		System.out.println("singleton1.equals(singleton2): " + singleton1.equals(singleton2));

	}
}
