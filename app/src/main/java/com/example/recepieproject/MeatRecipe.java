package com.example.recepieproject;

public class MeatRecipe extends Recipe {
    private String meatType; // דוגמה: בקר, עוף, הודו

    public MeatRecipe() {
        super();
    }

    public MeatRecipe(String id, String title, String instructions, int prepTimeMinutes, int likesCount, int favoritesCount, String meatType) {
        super(id, title, instructions, prepTimeMinutes, likesCount, favoritesCount);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }
}
