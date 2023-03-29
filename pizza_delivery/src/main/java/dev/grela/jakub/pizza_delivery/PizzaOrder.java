package dev.grela.jakub.pizza_delivery;

public class PizzaOrder implements IPizzaOrder{
    /*W tej klasie wywoływana jest metoda deliverPizza() z klasy PizzaDelivery*/
    public PizzaDelivery pizzaDelivery;
    private String pizzaOrder;

    public void setPizzaDelivery(PizzaDelivery pizzaDelivery) {
        this.pizzaDelivery = pizzaDelivery;
    }

    public void setPizzaOrder(String pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public Pizza orderPizza() {
        return pizzaDelivery.deliverPizza();
    }
}
