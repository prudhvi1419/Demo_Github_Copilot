package org.example.demo.github.copilot.example;

// InventoryManagement class with add, remove, get, update products

public class InventoryManagement {

    private Product[] products;
    private int size;

    public InventoryManagement(int capacity) {
        products = new Product[capacity];
        size = 0;
    }

    public boolean addProduct(Product product) {
    if (product == null) {
        throw new IllegalArgumentException("Product cannot be null");
    }
    if (size >= products.length) {
        return false;
    }
    products[size++] = product;
    return true;
}

    public void removeProduct(int id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId() == id) {
                products[i] = products[size - 1];
                products[size - 1] = null;
                size--;
                break;
            }
        }
    }

    public Product getProduct(int id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId() == id) {
                return products[i];
            }
        }
        return null;
    }

    // Update product method get id and update the quantity
    public void updateProduct(int id, int quantity) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId() == id) {
                products[i].setQuantity(quantity);
                break;
            }
        }


    }
}
