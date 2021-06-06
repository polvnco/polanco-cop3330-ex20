/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ex20
{
    public static void main( String[] args )
    {
        float tax = (float) 1.05;
        Locale usa = new Locale("en", "US");
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);

        System.out.print( "What is the order amount? " );
        Scanner orderAmount = new Scanner(System.in);
        float amount = orderAmount.nextFloat();

        System.out.print( "What is the state? " );
        Scanner state = new Scanner(System.in);
        String stateUSA = state.nextLine();

        System.out.print( "What county do you live in? " );
        Scanner county = new Scanner(System.in);
        String stateCounty = county.nextLine();

        float totalAmount;
        float countyTax = 0;
        float stateTax;
        float actualTax;

        if (stateUSA.equals("WI") || stateUSA.equals("wi") || stateUSA.equals("Wisconsin") || stateUSA.equals("WISCONSIN")){
            if (stateCounty.equals("Eau Claire") || stateCounty.equals("EAU CLAIRE") || stateCounty.equals("eau claire")){
                countyTax = (float) (tax + 0.05);
            }
            else if (stateCounty.equals("Dunn") || stateCounty.equals("DUNN") || stateCounty.equals("dunn")){
                countyTax = (float) (tax + 0.04);
            }
            tax = countyTax;
            totalAmount = amount * tax;
            actualTax = totalAmount - amount;
            System.out.println("The tax is " + dollarFormat.format(actualTax) + ".");
            System.out.println("The total is " + dollarFormat.format(totalAmount) + ".");
            return;
        }

        else if (stateUSA.equals("IL") || stateUSA.equals("il") || stateUSA.equals("Illinois") || stateUSA.equals("ILLINOIS")){
            stateTax = (float) 1.08;
            tax = stateTax;
            totalAmount = amount * tax;
            actualTax = totalAmount - amount;
            System.out.println("The tax is " + dollarFormat.format(actualTax) + ".");
            System.out.println("The total is " + dollarFormat.format(totalAmount) + ".");
            return;
        }
        System.out.println("The total is " + dollarFormat.format(amount) + ".");
    }
}
