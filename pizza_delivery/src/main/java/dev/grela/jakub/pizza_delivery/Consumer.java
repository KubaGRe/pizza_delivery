package dev.grela.jakub.pizza_delivery;

public class Consumer{
    /*W tej klasie wywoływana jest metoda orderPizza()
    * która zwraca nam obiekt Pizza utworzony w klasie PizzaBake*/
    private IPizzaOrder pizzOrder;
    private String name;

    /*public Consumer(IPizzaOrder pizzaorder, String name){
        this.pizzOrder = pizzaorder;
        this.name = name;
    }

    public Consumer(){
        this.pizzOrder = null;
        this.name = "";
    }*/

    public void setPizzOrder(IPizzaOrder pizzOrder) {
        this.pizzOrder = pizzOrder;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){
        Pizza pizza = pizzOrder.orderPizza();
        pizza.printOrderHistory();
    }
}
