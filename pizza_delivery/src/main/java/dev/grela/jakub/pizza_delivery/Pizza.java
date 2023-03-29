package dev.grela.jakub.pizza_delivery;

public class Pizza {
    private String name;
    private String bakedBy;
    private String deliveredBy;
    private String orderedBy;
    private String orderedHow;

    public void setName(String name) {
        this.name = name;
    }

    public void setBakedBy(String bakedBy) {
        this.bakedBy = bakedBy;
    }

    public void setDeliveredBy(String deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    public void setOrderedBy(String orderedBy) {
        this.orderedBy = orderedBy;
    }

    public void setOrderedHow(String orderedHow) {
        this.orderedHow = orderedHow;
    }

    public void printOrderHistory(){
        System.out.println("Pizza: " + this.name);
        System.out.println("Baked by: " + this.bakedBy);
        System.out.println("Delivered by: " + this.deliveredBy);
        System.out.println("Ordered by: " + this.orderedBy);
        System.out.println("Order type: " + this.orderedHow);
    }

}
