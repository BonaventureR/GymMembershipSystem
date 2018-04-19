/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmembershipmanagement;

/**
 * Makes an overdue payment after extending the Abstract Payment class.
 * @author Bonaventure
 */
public class OverduePayment extends Payment{

    //contructor
    public OverduePayment() {    
        super();
    }

    /**
     * Abstract method that makes the payment Overdue for the user.
     * @return String saying that an overdue payment is charged.
     */
    @Override
    public String makePayment() {
        return "Overdue Payment. You have outstanding charges, transaction incomplete.";
    }
    
    
    public void payAll(){
        //*******STUB****
        //this method should pay all of the users payments off if they had an overdue payment. This 
        //should clear the boolean false paid, and should set it it true.
    }
}
