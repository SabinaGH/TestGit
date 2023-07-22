package GitTest;

import java.util.Scanner;

public class CofeeShopOrderUsingSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Menu:");
        System.out.println("1. Espresso"); //10$
        System.out.println("2. Latte"); //15$
        System.out.println("3. Cappuccino"); //5$
        System.out.println("4. Americano"); //18$
        System.out.print("Enter the number of your desired coffee: ");

        int coffeeNumber = scanner.nextInt();
        int totalPriceOfCoffee = 0;

        switch(coffeeNumber)
        {
            case 1:
                totalPriceOfCoffee = totalPriceOfCoffee+10;
                break;
            case 2:
                totalPriceOfCoffee = totalPriceOfCoffee+15;
                break;
            case 3:
                totalPriceOfCoffee = totalPriceOfCoffee+5;
                break;
            case 4:
                totalPriceOfCoffee = totalPriceOfCoffee+18;
                break;
            default:
                System.out.println("Please select valid coffee number");

        }
        // output as total price you have to pay to shopkeeper
        System.out.println("Total price is = "+totalPriceOfCoffee);

        scanner.close();
    }
}
