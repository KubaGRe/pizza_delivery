package dev.grela.jakub.pizza_delivery;

public class Consumer{
    /*W tej klasie wywoływana jest metoda orderPizza()
    * która zwraca nam obiekt Pizza utworzony w klasie PizzaBake*/
    private IPizzaOrder pizzaOrder;
    private String name;

/*public Consumer(IPizzaOrder pizzaorder, String name){
        this.pizzaOrder = pizzaorder;
        this.name = name;
    }

    public Consumer(){
        this.pizzaOrder = null;
        this.name = "";
    }*/

    public void setpizzaOrder(IPizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void run(){
        Pizza pizza = pizzaOrder.orderPizza();
        pizza.setOrderedBy(name);
        pizza.printOrderHistory();
    }
}
