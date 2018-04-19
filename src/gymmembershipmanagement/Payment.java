/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmembershipmanagement;

/**
 * Abstract class of payment that creates an object that each tells the member how the member has made a payment.
 * @author Bonaventure Raj
 */
public abstract class Payment {
    //Fields
    private boolean Paid;
    
    //Constructor
    public Payment() {
    }    
 
    //Methods
    /**
     * Abstract method to make a payment which will be different for each class.
     * @return 
     */
    public abstract String makePayment();

    /**
     * Boolean to get if it is true or false.
     * @return 
     */
    public boolean getPaid() {
        //This method is supposed to see if the user has paid or not, so it returns a boolean true or false paid.
        return Paid;
    }

    /**
     * Boolean to set if it is true or false
     * @param Paid boolean to set if true or false of a member.
     */
    public void setPaid(boolean Paid) {
        //This sets whether a user has paid or not.
        this.Paid = Paid;
    }
    
    
    
}
