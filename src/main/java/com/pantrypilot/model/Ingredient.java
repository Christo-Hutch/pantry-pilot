package main.java.com.pantrypilot.model;

public class Ingredient {
    private final String id;
    private String name;
    private int quantity;
    private Unit unit;

    // Constructor
    public Ingredient(String id, String name, int quantity, Unit unit){
        if (quantity < 0){
            throw new IllegalArgumentException("Quantity can't be negative");
        }
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    // Getters
    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public Unit getUnit(){
        return this.unit;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setUnit(Unit unit){
        this.unit = unit;
    }

    // Add to ingredient quantity
    public void addToQuantity(int quantity){
        this.quantity += quantity;
    }
}