/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmembershipmanagement;

/**
 * Makes a monthly payment after extending the Abstract Payment class.
 * @author Bonaventure Raj
 */
public class MonthlyPayment extends Payment {

    //Constructor
    public MonthlyPayment() {
        super();
    }

    /**
     * Abstract method that makes the payment Monthly.
     * @return String saying that a monthly payment has been made.
     */
    @Override
    public String makePayment() {
        return "Monthly Payment has been made. You will be charged every month. Transaction complete.";
    }
    
    
    public void payAll(){
        //*******STUB****
        //this method should pay all of the users payments off if they had an overdue payment. This 
        //should clear the boolean false paid, and should set it it true.
    }
}
