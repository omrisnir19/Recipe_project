package com.example.recepieproject;

public class FishRecipe extends Recipe {
    private String fishType; // דוגמה: סלמון, אמנון, טונה

    public FishRecipe() {
        super();
    }

    public FishRecipe(String id, String title, String instructions, int prepTimeMinutes, int likesCount, int favoritesCount, String fishType) {
        super(id, title, instructions, prepTimeMinutes, likesCount, favoritesCount);
        this.fishType = fishType;
    }

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }
}
