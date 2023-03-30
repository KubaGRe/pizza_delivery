package dev.grela.jakub.pizza_delivery;

public class PizzaDelivery implements IPizzaDelivery{
/*W tek klasie wywoływana jest metoda bakePizza() z klasy PizzaBake*/
    private PizzaBake pizzaBake;
    private String deliveredBy;

    public void setPizzaBake(PizzaBake pizzaBake) {
        this.pizzaBake = pizzaBake;
    }

    public void setDeliveredBy(String deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    @Override
    public Pizza deliverPizza() {
        Pizza pizza = pizzaBake.bakePizza();
        pizza.setDeliveredBy(deliveredBy);
        return pizza;
    }
}
