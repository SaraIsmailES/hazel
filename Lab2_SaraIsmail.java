package com.example.JavaUV;

import java.util.Scanner;


public class App {
    
    public static void main(String[] args)
    {
        
        Scanner MyScanner = new Scanner(System.in);
        String HolderName = "";
        double AccountBalance = 100 ;
        double DepositAmount = 0;
        
        
        System.out.println("Please enter account holder's name");
        HolderName = MyScanner.nextLine();
        
        
        System.out.println("Please enter account balance");
        AccountBalance = MyScanner.nextDouble();
        
       // print name and balance 
       System.out.println("Account holder's name is : " + HolderName);
       System.out.println("Account balance is : " + AccountBalance);
       
       
       System.out.println("Please enter deposit amount");
       DepositAmount = MyScanner.nextDouble();
       
       
       System.out.println("Balance after deposit amount is : " +(DepositAmount + AccountBalance) );
       
        
        MyScanner.close();
    }
}

