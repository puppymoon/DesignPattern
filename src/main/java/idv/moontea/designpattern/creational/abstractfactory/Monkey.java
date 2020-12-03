package idv.moontea.designpattern.creational.abstractfactory;

public abstract class Monkey {

	protected String status;

	public void speak() {
		System.out.println("我是" + status + "猴猴");
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
