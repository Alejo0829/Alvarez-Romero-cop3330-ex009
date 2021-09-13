package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter Width: ");
        double width = sc.nextDouble();
        final double squarefeetpergallon = 350;
        double squarefeet = length * width;
        int gallon = (int) Math.ceil(squarefeet/squarefeetpergallon);
        System.out.println("You will need to purchase "+ gallon + " gallons to cover "+ squarefeet + " square feet");
    }
}
