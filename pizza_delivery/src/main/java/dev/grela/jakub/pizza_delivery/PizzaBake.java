package dev.grela.jakub.pizza_delivery;

public class PizzaBake implements IPizzaBake{
/*W tej klasie tworzymy obiekt Pizza oraz go zwracamy.
* Nie wiem czy teraz dobrze mi się wydaje czy nie, ale jeśli
* to wszystko jest dobrze to chyba powinienem wstrzykiwać już
* konkretne zależności przy pomocy bean.xml*/
    private String bakedBy;
    private String pizzaType;

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public void setBakedBy(String bakedBy) {
        this.bakedBy = bakedBy;
    }

    @Override
    public Pizza bakePizza() {
        Pizza newPizza = new Pizza();
        newPizza.setBakedBy(bakedBy);
        newPizza.setName(pizzaType);
        return newPizza;
    }
}
