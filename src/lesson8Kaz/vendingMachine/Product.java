package lesson8Kaz.vendingMachine;

import java.util.Scanner;

public class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;


    public Product(String name, double price, int quantity) {
        this.productName = name;
        this.productPrice = price;
        this.productQuantity = quantity;
    }


    public Product(String name) {
        this.productName = name;
    }

    public String getProductName() {
        return productName;
    }


    public void setProductName(String name) {
        this.productName = name;
    }


    public double getProductPrice() {
        return productPrice;
    }


    public void setProductPrice(double price) {
        this.productPrice = price;
    }


    public int getProductQuantity() {
        return productQuantity;
    }


    public void setProductQuantity(int quantity) {
        this.productQuantity = quantity;
    }

    public void sellProduct() {
        if (this.productQuantity == 0) {
            System.out.println("ПРОДУКТ ЗАКОНЧИЛСЯ");
        } else {
            this.productQuantity -= 1;
        }
    }

    public void addProduct() {
        System.out.println("НАПИШИТЕ КОЛИЧЕСТВО, КОТОРОЕ ХОТИТЕ ДОБАВИТЬ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if (Integer.parseInt(choice) != 0) {
            productQuantity = getProductQuantity() + Integer.parseInt(choice);
        } else {
            System.out.println("НАПИШИТЕ КОЛИЧЕСТВО, КОТОРОЕ ХОТИТЕ ДОБАВИТЬ");
        }
    }


}
