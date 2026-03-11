package main.java.com.pantrypilot.model;

public class Ingredient {
    private String id;
    private String name;
    private int quantity;
    private Unit unit;

    // Constructor
    public Ingredient(String id, String name, int quantity, Unit unit){
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
}