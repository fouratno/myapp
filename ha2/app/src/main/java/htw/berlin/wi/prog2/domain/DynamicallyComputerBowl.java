package htw.berlin.wi.prog2.domain;

import htw.berlin.wi.prog2.service.ingredientsEmptyException;

import java.util.ArrayList;
import java.util.List;

public class DynamicallyComputedBurger implements Burger {
    // Private field to store the list of ingredients
    private List<Ingredient> ingredients;

    // Constructor to initialize the burger with a list of ingredients
    public DynamicallyComputedBurger(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public DynamicallyComputedBurger() {
        this.ingredients = new ArrayList<Ingredient>();
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public double calculatePrice() throws ingredientsEmptyException {
        if (ingredients.isEmpty()) {
            throw new ingredientsEmptyException("Ingredients list is empty");
        } else {
            double totalPrice = 0;
            // Iterates over each ingredient to sum up the total price
            for (Ingredient ingredientItem : ingredients) {
                totalPrice += ingredientItem.getPrice();
            }
            return totalPrice;
        }
    }

    @Override
    public int calculateCalories() throws ingredientsEmptyException {
        if (ingredients.isEmpty()) {
            throw new ingredientsEmptyException("Ingredients list is empty");
        } else {
            int totalCalories = 0;
            // Iterates over each ingredient to sum up the total calories
            for (Ingredient ingredientItem : ingredients) {
                totalCalories += ingredientItem.getCalories();
            }
            return totalCalories;
        }
    }

    @Override
    public List<String> getIngredientNames() throws ingredientsEmptyException {
        if (ingredients.isEmpty()) {
            throw new ingredientsEmptyException("Ingredients list is empty");
        } else {
            List<String> names = new ArrayList<>();
            // Iterates over each ingredient to collect their names into a list
            for (Ingredient ingredientItem : ingredients) {
                names.add(ingredientItem.getName());
            }
            return names;
        }
    }
}
