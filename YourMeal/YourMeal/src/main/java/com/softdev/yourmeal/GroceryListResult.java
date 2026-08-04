package com.softdev.yourmeal;

import java.util.List;

public record GroceryListResult(List<String> ingredients, String statusMessage) {
    public boolean hasIngredients() {
        return !ingredients.isEmpty();
    }
}
