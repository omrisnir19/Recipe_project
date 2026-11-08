package com.example.recepieproject;

public abstract class Recipe implements RecipeInteractable {
    private String id;
    private String title;
    private String instructions;
    private int prepTimeMinutes;
    private int likesCount;
    private int favoritesCount;

    // בנאי ריק (שימושי לעבודה עם Firebase/Realtime Database)
    public Recipe() {
    }

    public Recipe(String id, String title, String instructions, int prepTimeMinutes, int likesCount, int favoritesCount) {
        this.id = id;
        this.title = title;
        this.instructions = instructions;
        this.prepTimeMinutes = prepTimeMinutes;
        this.likesCount = likesCount;
        this.favoritesCount = favoritesCount;
    }

    // Getters & Setters כלליים
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getPrepTimeMinutes() {
        return prepTimeMinutes;
    }

    public void setPrepTimeMinutes(int prepTimeMinutes) {
        this.prepTimeMinutes = prepTimeMinutes;
    }

    // מימוש מתודות ה-Interface
    @Override
    public int getLikesCount() {
        return likesCount;
    }

    @Override
    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    @Override
    public int getFavoritesCount() {
        return favoritesCount;
    }

    @Override
    public void setFavoritesCount(int favoritesCount) {
        this.favoritesCount = favoritesCount;
    }
}