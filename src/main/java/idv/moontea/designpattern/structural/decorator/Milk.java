package idv.moontea.designpattern.structural.decorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return addCondiment() + beverage.getDescription();
    }

    public double cost() {
        return 20 + beverage.cost();
    }

    @Override
    public String addCondiment() {
        return "牛奶";
    }
}
