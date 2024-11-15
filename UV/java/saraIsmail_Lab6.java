package com.mycompany.testexercises;

import java.util.Scanner;

public class TestExercises {

    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter number of items ");
       
       int size = input.nextInt();
       
       double [] pricesArray = new double [size];
       
       setItemsPrice( pricesArray , input);
       
       double total = calculateTotalPrice(pricesArray);
       System.out.println("The total price of all items inside the chart is : " + total);
       
       double maxprice = findMaxPrice (pricesArray);
       System.out.println("The maximum item price is : " + maxprice);
               
    }
   
    public static void setItemsPrice(double [] arr , Scanner input)
    {
        for (int i = 0; i < arr.length ; i++)
        { 
            System.out.println("Enter price of item # " + ( i + 1) );
            arr[i] = input.nextDouble();
        }
    }
    
    public static double calculateTotalPrice(double [] arr)
    {
        double total = 0;
        for (int i = 0 ; i < arr.length ; i++)
        {
            total += arr[i];
        }
        return total;
    }
     
    public static double findMaxPrice(double [] arr)
    {
        double max = 0;
        for (int i =0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
 

