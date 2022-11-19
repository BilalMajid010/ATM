package com.atm;

import java.util.Scanner;
class Start extends Thread {
    public void run(){
        System.out.println("********Welcome To Atm Machine**********");
        try{
        this.sleep(5000);
        System.out.print("Enter Atm Number : ");
        }
        catch(InterruptedException ex){
            System.out.println(ex);
        }
    }

    

}
public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterf op=new AtmOperationImpl();
        int atmnumber=12345;
        int atmpin=123;
        Start S= new Start();
        S.start();
        Scanner in=new Scanner(System.in);
       // System.out.println("Welcome to ATM Machine !!!");
    // Start S= new Start();
     //S.start();
        //System.out.println("Enter Atm Numnber : ");
        int atmNumber=in.nextInt();
        System.out.print("Enter Pin: ");
        int pin=in.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin)){
            while(true){
                System.out.println("\n\n1.View Available Balance");
                System.out.println("2.Withdraw Amount");
                System.out.println("3.Deposit Amount");
                System.out.println("4.Exit");
                System.out.println("Enter Choice : ");
                int ch=in.nextInt();
                if(ch==1){
                    op.viewBalance();
                    //Thread.sleep(5000);
                    try {
                        Thread.sleep(5000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else if(ch==2){
                    System.out.println("Enter amount to withdraw :");
                    double withdrawAmount=in.nextDouble();
                    if(withdrawAmount<0){
                    System.out.println("\n\t\tInvalid Amount");
                    }
                    else{
                        op.withdrawAmount(withdrawAmount);
                    }

                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount=in.nextDouble();
                    if(depositAmount<0){
                        System.out.println("\n\t\tInvalid Amount");
                    }
                    else{
                        op.depositAmount(depositAmount);
                    }
                    


                }
                
                else if(ch==4){
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm Number or pin");
            Scanner n=new Scanner(System.in);
            System.out.print("Enter New Pin: ");
            int newpin=in.nextInt();
            AtmOperationInterf op=new AtmOperationImpl();
        int atmnumber=12345;
        int atmpin=123;
        Start S= new Start();
        S.start();
        Scanner in=new Scanner(System.in);
       // System.out.println("Welcome to ATM Machine !!!");
    // Start S= new Start();
     //S.start();
        //System.out.println("Enter Atm Numnber : ");
        int atmNumber=in.nextInt();
        System.out.print("Enter Pin: ");
        int pin=in.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==newpin)){
            while(true){
                System.out.println("\n\n1.View Available Balance");
                System.out.println("2.Withdraw Amount");
                System.out.println("3.Deposit Amount");
                System.out.println("4.Exit");
                System.out.println("Enter Choice : ");
                int ch=in.nextInt();
                if(ch==1){
                    op.viewBalance();
                    //Thread.sleep(5000);
                    try {
                        Thread.sleep(5000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else if(ch==2){
                    System.out.println("Enter amount to withdraw :");
                    double withdrawAmount=in.nextDouble();
                    if(withdrawAmount<0){
                    System.out.println("\n\t\tInvalid Amount");
                    }
                    else{
                        op.withdrawAmount(withdrawAmount);
                    }

                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount=in.nextDouble();
                    if(depositAmount<0){
                        System.out.println("\n\t\tInvalid Amount");
                    }
                    else{
                        op.depositAmount(depositAmount);
                    }
                    


                }
                
                else if(ch==4){
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                }
            System.exit(0);
        }


    }
}