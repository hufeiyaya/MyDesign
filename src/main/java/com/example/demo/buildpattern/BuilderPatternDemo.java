package com.example.demo.buildpattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal=mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        meal.showItems();
        System.out.println("Cost"+meal.getCost());


        Meal meal2=mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        meal2.showItems();
        System.out.println("Cost"+meal2.getCost());
    }
}
