package idv.moontea.designpattern.structural.decorator;

public class Blacktea extends Beverage {
    public Blacktea() {
        description = "紅茶";
    }

    public double cost() {
        return 30;
    }
}
