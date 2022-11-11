package Products_Recipes;

import java.util.Objects;
import java.util.Set;

public class Recipe<T extends Product> {
    private String name;
    private Set<T> recipeProducts;
    private int totalCost;

    public Recipe(String name, Set<T> recipeProducts) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }

        this.recipeProducts = recipeProducts;

        int totalCost = 0;
        for (T product : recipeProducts) {
            totalCost += product.getCost() * product.getAmount();
        }
        this.totalCost = totalCost;
    }

    public String getName() {
        return name;
    }

    public Set<T> getRecipeProducts() {
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
        Recipe<?> recipe = (Recipe<?>) o;
        return name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
