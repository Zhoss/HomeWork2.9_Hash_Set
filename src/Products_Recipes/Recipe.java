package Products_Recipes;

import java.util.HashMap;
import java.util.Objects;

public class Recipe {
    private String name;
    private HashMap<Product, Integer> recipeProducts = new HashMap<>();
    private int totalCost;

    public Recipe(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public HashMap<Product, Integer> getRecipeProducts() {
        return recipeProducts;
    }

    public int getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "Рецепт " + "\"" + name + "\"";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        if (name.equals(recipe.name)) {
            throw new IllegalArgumentException("Рецепт " + getName() + " уже добавлен в кулинарную книгу");
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, recipeProducts);
    }

    public void addProductToRecipe(Product product) {
        if (product != null && product.getAmount() >= 1) {
            getRecipeProducts().put(product, product.getAmount());
        } else {
            getRecipeProducts().put(product, 1);
        }
    }

    public void calculateRecipeTotalCost() {
        int totalCost = 0;
        for (Product product : getRecipeProducts().keySet()) {
            totalCost += product.getCost() * product.getAmount();
        }
        this.totalCost = totalCost;
    }
}
