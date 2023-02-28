
package com.mycompany.atmmachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationInterf op=new AtmoperationImpl();
        int atmnumber=12345;
        int atmpin=123;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to Atm machine..!!!");
        System.out.println("Enter atm number :");
        int atmNumber=in.nextInt();
        System.out.println("Enter Pin :");
        int pin=in.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin)){
            while(true){
            System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
            System.out.println("Enter your choice :");
            int ch=in.nextInt();
            if(ch==1){
            op.viewBalance();
            }
            else if(ch==2){
            System.out.println("Enter amount to withdraw :");
            double withdrawAmount=in.nextDouble();
            op.WithdrawAmount(withdrawAmount);
            }
            else if(ch==3){
            System.out.println("Enter amount to deposit :");
            double depositAmount=in.nextDouble();//5000
            op.depositAmount(depositAmount);
            
            }
            else if(ch==4){
            System.out.println("Collect your atm card\n Thank you for using atm");
            }
            else
            {
            System.out.println("Please enter cvorrect choice");
            }
            }
        }
        else{
            System.out.println("Incorrect Atm number or pin");
            
        }
        
    }
    
}
