package com.example.recepieproject;

public class DairyRecipe extends Recipe {
    private boolean containsLactose; // האם מכיל לקטוז

    public DairyRecipe() {
        super();
    }

    public DairyRecipe(String id, String title, String instructions, int prepTimeMinutes, int likesCount, int favoritesCount, boolean containsLactose) {
        super(id, title, instructions, prepTimeMinutes, likesCount, favoritesCount);
        this.containsLactose = containsLactose;
    }

    public boolean isContainsLactose() {
        return containsLactose;
    }

    public void setContainsLactose(boolean containsLactose) {
        this.containsLactose = containsLactose;
    }
}