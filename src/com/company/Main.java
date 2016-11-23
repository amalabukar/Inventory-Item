package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


        // write your code here

       public static  ArrayList<Inventory> items = new ArrayList<>();

    public static Inventory createItem (String name, int quantity, String category) {
        if (category.equalsIgnoreCase("Shirt")) {
            Shirt shirt = new Shirt(name, quantity);
            return shirt;
        } else if (category.equalsIgnoreCase("Blazer")) {
            Blazer blazer = new Blazer(name, quantity);
            return blazer;
        } else if (category.equalsIgnoreCase("Hat")) {
            Hat hat = new Hat(name, quantity);
            return hat;
        } else if (category.equalsIgnoreCase("Shoe")) {
            Shoe shoe = new Shoe(name, quantity);
            return shoe;
        } else if (category.equalsIgnoreCase("Coat")) {
            Coat coat = new Coat(name, quantity);
            return coat;
        }
        return null;


    }





    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//
        while (true) {
            int i = 1;
            for (Inventory item : items) {
                String checkbox = "[" + item.quantity + "]";
//
                System.out.printf("%d. %s %s %s\n", i, item.name, item.category, checkbox);
//
                i++;
            }

            System.out.println("Options");
            System.out.println("1.Create item");
            System.out.println("2.Remove Item");
            System.out.println("3.Update Item Quantity");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Enter your item");
                String text = scanner.nextLine();
                System.out.println("Enter Quantity");
                int quantity = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter category [Shirt/Blazer/Hat/Shoe/Coat]");
                String category = scanner.nextLine();

                items.add(createItem(text, quantity, category));

            } else if (option.equals("3")) {
                System.out.println("What item do you want to update?");
                int itemNum = Integer.parseInt(scanner.nextLine());

                System.out.println("How much do you want to update ?");
                int number = Integer.parseInt(scanner.nextLine());
//
                Inventory item = items.get(itemNum - 1);
                item.quantity = number;


            } else if (option.equals("2")) {
                System.out.println("What item do you want to remove");
                int itemNum = Integer.parseInt(scanner.nextLine());
                items.remove(itemNum-1);
                System.out.println("Item Removed");
            }
        }
    }
    }

