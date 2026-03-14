package main.java.com.pantrypilot.model;

import java.util.ArrayList;

public class Meal {
    private String mealId;
    private String name;
    private ArrayList<String> ingredients;
    private int servings;
    private MealType type;

    // Constructor
    public Meal(String mealId, String name, ArrayList<String> ingredients, int servings, MealType type){
        if (servings < 0) {
            throw new IllegalArgumentException("Quantity can't be negative");
        }
        this.mealId = mealId;
        this.name = name;
        this.ingredients = ingredients;
        this.servings = servings;
        this.type = type;
    }

    // Getters
    public String getMealId(){
        return this.mealId;
    }

    public String getName(){
        return this.name;
    }
    
    public ArrayList<String> getIngredrients(){
        return this.ingredients;
    }

    public int getServings(){
        return this.servings;
    }

    public MealType getType(){
        return this.type;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setIngredients(ArrayList<String> ingredients){
        this.ingredients = ingredients;
    }

    public void setServings(int servings){
        this.servings = servings;
    }

    public void setType(MealType type){
        this.type = type;
    }

    // Add to ingredients
    public void addToIngredients(String ingredient){
        this.ingredients.add(ingredient);
    }

    // Get number of ingredients
    public int numOfIngredients(){
        return this.ingredients.size();
    }
}