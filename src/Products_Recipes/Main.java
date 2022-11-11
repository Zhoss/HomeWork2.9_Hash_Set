package Products_Recipes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product banan = new Product("Банан", 100, 1);
        Product cocos = new Product("Кокос", 250, 2);
        Product paper = new Product("Банан", 100, 3);
        Product apple = new Product("Яблоко", 230, 2);
        Product yogurt = new Product("Йогурт", 80, 4);

        Product potato = new Product("Картофель", 50, 4);
        Product egg = new Product("Яйцо", 120, 2);
        Product sausage = new Product("Колбаса", 600, 1);
        Product cucumber = new Product("Огурец", 180, 3);

        Set<Product> productsListForOlivier = new HashSet<>();
        addProduct(potato, productsListForOlivier);
        addProduct(egg, productsListForOlivier);
        addProduct(sausage, productsListForOlivier);
        addProduct(cucumber, productsListForOlivier);

        Set<Product> productsListForFruitSalad = new HashSet<>();
        addProduct(banan, productsListForFruitSalad);
        addProduct(cocos, productsListForFruitSalad);
//        addProduct(paper, productsListForFruitSalad);
        addProduct(apple, productsListForFruitSalad);
        addProduct(yogurt, productsListForFruitSalad);

        Set<Product> productsListForFruitMix = new HashSet<>();
        addProduct(banan, productsListForFruitMix);
        addProduct(cocos, productsListForFruitMix);
        addProduct(apple, productsListForFruitMix);
        addProduct(yogurt, productsListForFruitMix);

//        checkProduct(cocos, productsListForOlivier);
//        removeProduct(cucumber, productsListForOlivier);

        Recipe<Product> olivier = new Recipe<>("Оливье", productsListForOlivier);
        System.out.println(olivier.getRecipeProducts());
        System.out.println("Общая стоимость составляет " + olivier.getTotalCost());

        Recipe<Product> fruitSalad = new Recipe<>("Фруктовый салат", productsListForFruitSalad);
        System.out.println(fruitSalad.getRecipeProducts());
        System.out.println("Общая стоимость составляет " + fruitSalad.getTotalCost());

        Recipe<Product> fruitMix = new Recipe<>("Фруктовый микс", productsListForFruitMix);

        List<Recipe<Product>> cookingBook = new ArrayList<>();
        addRecipe(olivier, cookingBook);
        addRecipe(fruitSalad, cookingBook);
        addRecipe(fruitMix, cookingBook);
        System.out.println(cookingBook);
    }
    public static void addProduct(Product product, Set<Product> set) {
        if (!set.contains(product) && product != null) {
            set.add(product);
        } else {
            assert product != null;
            throw new IllegalArgumentException("Проверьте корзину на наличие продукта " + product.getName());
        }
    }

    public static void checkProduct(Product product, Set<Product> set) {
        if (set.contains(product) && product != null) {
            System.out.println("Продукт " + product.getName() + " куплен");
        }
    }

    public static void removeProduct (Product product, Set<Product> set) {
        if (set.contains(product) && product != null) {
            set.remove(product);
            System.out.println("Продукт " + product.getName() + " удален из корзины");
        }
    }

    public static void addRecipe(Recipe<Product> recipe, List<Recipe<Product>> set) {
        if (!set.contains(recipe)) {
            set.add(recipe);
        } else {
            throw new IllegalArgumentException("Рецепт " + recipe.getName() + " уже добавлен в кулинарную книгу");
        }
    }
}