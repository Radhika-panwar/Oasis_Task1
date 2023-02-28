
package com.mycompany.atmmachine;

public class AtmoperationImpl implements AtmOperationInterf{
    ATM atm=new ATM();
     
    @Override
    public void viewBalance() {
        System.out.println("Available balance is :"+atm.getBalance());
    }

    @Override
    public void WithdrawAmount(double withdrawAmount) {
        if(withdrawAmount<=atm.getBalance()){
       System.out.println("Collect the Cash"+withdrawAmount);
       atm.setBalance(atm.getBalance()-withdrawAmount);
       viewBalance();
    }
        else{
            System.out.println("Insufficient balance");
        }}

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println("Deposited Successfully..!!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

  
    
}
