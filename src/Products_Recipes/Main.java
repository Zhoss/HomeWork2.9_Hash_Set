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
        productsListForOlivier.add(potato);
        productsListForOlivier.add(egg);
        productsListForOlivier.add(sausage);
        productsListForOlivier.add(cucumber);

        Set<Product> productsListForFruitSalad = new HashSet<>();
        productsListForFruitSalad.add(banan);
        productsListForFruitSalad.add(cocos);
        productsListForFruitSalad.add(apple);
        productsListForFruitSalad.add(yogurt);
//        productsListForFruitSalad.add(paper);

        for (Product product : productsListForFruitSalad) {
            System.out.println(product);
        }

        Set<Product> productsListForFruitMix = new HashSet<>();
        productsListForFruitMix.add(banan);
        productsListForFruitMix.add(cocos);
        productsListForFruitMix.add(apple);
        productsListForFruitMix.add(yogurt);

//        checkProduct(cocos, productsListForOlivier);
//        removeProduct(cucumber, productsListForOlivier);

        Recipe<Product> olivier = new Recipe<>("Оливье", productsListForOlivier);
//        System.out.println(olivier.getRecipeProducts());
//        System.out.println("Общая стоимость составляет " + olivier.getTotalCost());

        Recipe<Product> fruitSalad = new Recipe<>("Фруктовый салат", productsListForFruitSalad);
//        System.out.println(fruitSalad.getRecipeProducts());
//        System.out.println("Общая стоимость составляет " + fruitSalad.getTotalCost());

        Recipe<Product> fruitMix = new Recipe<>("Фруктовый микс", productsListForFruitMix);

        Set<Recipe<Product>> cookingBook = new HashSet<>();
        cookingBook.add(olivier);
        cookingBook.add(fruitSalad);
        cookingBook.add(fruitMix);
        System.out.println(cookingBook);
    }

    public static void checkProduct(Product product, Set<Product> productSet) {
        if (productSet.contains(product) && product != null) {
            System.out.println("Продукт " + product.getName() + " куплен");
        }
    }

    public static void removeProduct (Product product, Set<Product> productSet) {
        if (productSet.contains(product) && product != null) {
            productSet.remove(product);
            System.out.println("Продукт " + product.getName() + " удален из корзины");
        }
    }
}