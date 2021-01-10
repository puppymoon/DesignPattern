package idv.moontea.designpattern.creational.prototype;

public class SealCopy {

	public Seal copySeal() {
		return new Seal();
	}

	public Seal copySeal(Seal seal) throws CloneNotSupportedException {
		return (Seal) seal.clone();
	}

}
