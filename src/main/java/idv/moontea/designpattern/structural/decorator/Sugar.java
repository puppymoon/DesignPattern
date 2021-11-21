package idv.moontea.designpattern.structural.decorator;

public class Sugar extends CondimentDecorator {

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return addCondiment() + beverage.getDescription();
    }

    public double cost() {
        return 0 + beverage.cost();
    }

    @Override
    public String addCondiment() {
        return "加糖";
    }
}
