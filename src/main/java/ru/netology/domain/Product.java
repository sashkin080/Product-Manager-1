package ru.netology.domain;

import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;

public class Product {

    private int id;
    private String name;
    private int cost;

    public Product() {
    }

    public Product(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean matches(String search) {
        return name.contains(search);
    }

    ProductRepository repo = new ProductRepository();

    ProductManager Manager = new ProductManager(repo);
}
