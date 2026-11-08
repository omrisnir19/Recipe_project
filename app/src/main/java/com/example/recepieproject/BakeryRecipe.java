package com.example.recepieproject;

public class BakeryRecipe extends Recipe {
    private int bakingTemperature; // טמפרטורת אפייה במעלות צלזיוס

    public BakeryRecipe() {
        super();
    }

    public BakeryRecipe(String id, String title, String instructions, int prepTimeMinutes, int likesCount, int favoritesCount, int bakingTemperature) {
        super(id, title, instructions, prepTimeMinutes, likesCount, favoritesCount);
        this.bakingTemperature = bakingTemperature;
    }

    public int getBakingTemperature() {
        return bakingTemperature;
    }

    public void setBakingTemperature(int bakingTemperature) {
        this.bakingTemperature = bakingTemperature;
    }
}
