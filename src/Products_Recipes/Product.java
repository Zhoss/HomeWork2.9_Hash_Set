package Products_Recipes;

import java.util.Objects;

public class Product {
    private String name;
    private int cost;
    private int amount;

    public Product(String name, int cost, int amount) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара " + getName() + " полностью");
        }

        setCost(cost);
        setAmount(amount);
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setCost(int cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара " + getName() + " полностью");
        }
    }

    public void setAmount(int amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара " + getName() + " полностью");
        }
    }

    @Override
    public String toString() {
        return name + ", стоимость " + cost + " руб." + ", количество " + amount + " кг.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        if (name.equals(product.name)) {
            throw new IllegalArgumentException("Проверьте корзину на наличие продукта " + getName());
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
