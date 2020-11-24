package idv.moontea.designpattern.creational.simplefactory;

public class SimpleFactor {

	//透過靜態方法傳來參數，而回傳不同類別，這些類別都實作同一個介面
	public static CubEmp callEmp(String type) {
		switch (type) {
		case "monkey": {
			System.out.println("call monkey");
			return new Monkey();
		}
		case "seal": {
			System.out.println("call seal");
			return new Seal();
		}
		default:
			System.out.println("call emp type error");
			return null;
		}
	}

}
