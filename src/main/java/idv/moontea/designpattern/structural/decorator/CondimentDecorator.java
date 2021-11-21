package idv.moontea.designpattern.structural.decorator;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String addCondiment();
}

