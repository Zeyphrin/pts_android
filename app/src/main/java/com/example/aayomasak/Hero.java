package com.example.aayomasak;

public class Hero {
    private String name;
    private String description;
    private String ingredients;
    private String steps;
    private String rating;
    private String user;
    private int foodPoster;
    private int userPoster;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getFoodPoster() {
        return foodPoster;
    }

    public void setFoodPoster(int foodPoster) {
        this.foodPoster = foodPoster;
    }

    public int getUserPoster() {
        return userPoster;
    }

    public void setUserPoster(int userPoster) {
        this.userPoster = userPoster;
    }
}
