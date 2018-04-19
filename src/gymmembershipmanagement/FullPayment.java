/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmembershipmanagement;

/**
 * Makes a full payment after extending the Abstract Payment class.
 * @author Bonaventure Raj
 */
public class FullPayment extends Payment {

    //constructor
    public FullPayment() {
        super();
    }

    /**
     * Abstract method that makes the payment Full.
     * @return String that makes the payment say it is paid fully.
     */
    @Override
    public String makePayment() {
        return "Full Payment has been made, transaction complete.";
    }
    
    public void payAll(){
        //*******STUB****
        //this method should pay all of the users payments off if they had an overdue payment. This 
        //should clear the boolean false paid, and should set it it true.
    }
    
}
