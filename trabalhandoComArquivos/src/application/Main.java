package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String caminho = "C:\\Users\\Usuário\\Desktop\\itens.csv";
        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String line = br.readLine();

            while (line != null) {

                String[] parts = line.split(",");
                String nome = parts[0];
                double preco = Double.parseDouble(parts[1]);
                int quantidade = Integer.parseInt(parts[2]);
                list.add(new Product(nome, quantidade, preco));

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
