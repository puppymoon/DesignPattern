package idv.moontea.designpattern.structural.decorator;

public class Coffee extends Beverage {
    public Coffee() {
        description = "咖啡";
    }

    public double cost() {
        return 50;
    }
}
