package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> listProducts = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int numProducts = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numProducts; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.println("Common, used or imported (c/u/i)?");
            char ch = sc.next().charAt(0);

            System.out.println("Name:");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Price:");
            double price = sc.nextDouble();

            if (ch == 'i') {
                System.out.println("Customs fee:");
                double customsFee = sc.nextDouble();
                listProducts.add(new ImportedProduct(name, price, customsFee));
            } else if (ch == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY):");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                listProducts.add(new UsedProduct(name, price, date));
            } else {
                listProducts.add(new Product(name, price));
            }
        }
        System.out.println("PRICE TAGS:");
        for (Product product :
                listProducts) {
            System.out.println(product.priceTag());
        }
        sc.close();


    }
}