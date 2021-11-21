package idv.moontea.designpattern.structural.decorator;

public class Test {

    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        System.out.println(coffee);
        coffee = new Milk(coffee);
        System.out.println(coffee);
        coffee = new Sugar(coffee);
        System.out.println(coffee);

        Beverage blacktea = new Blacktea();
        System.out.println(blacktea);
        blacktea = new Milk(blacktea);
        System.out.println(blacktea);
        blacktea = new Milk(blacktea);
        System.out.println(blacktea);
        blacktea = new Sugar(blacktea);
        System.out.println(blacktea);

    }
}
