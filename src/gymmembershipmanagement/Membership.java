/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmembershipmanagement;

import java.util.ArrayList;

/**
 * An abstract class of membership that creates a new member object that will store user information with
 * this class, each object will be able to be applied. 
 * @author Bonaventure Raj
 */
public abstract class Membership {
    //Fields    
    private String lastName;
    private String firstName;
    private PREFERENCES preference;
    public enum PREFERENCES {KICKBOXING, KARATE , YOGA, CYCLING, STRETCHING, ZUMBA}
    private Payment pay;
    
    //Constructor    
    public Membership(String lastName, String firstName, PREFERENCES preference, Payment pay){
        this.lastName = lastName;
        this.firstName = firstName;
        this.preference = preference;
        this.pay = pay;
    }
        
    /**
     * Gets the last name of a member.
     * @return the last name of the member object.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Makes a payment on a member object to 
     * @return String saying that the payment transaction has been made.
     */
    public String makePayment(){
        return "You have made a payment";
    }
    
    /**
     * Sets the last name of a member.
     * @param lastName sets the last name of a member.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * Gets the first name of a member. 
     * @return first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of a Member.
     * @param firstName: 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
   
    /**
     * Get the preference of a member's activity.
     * @return the preferences of the user.
     */
    public PREFERENCES getPreference() {
        return preference;
    }

    /**
     * Sets the preference of a member's activity.
     * @param preference ENUM that is used.
     */
    public void setPreference(PREFERENCES preference) {
        this.preference = preference;
    }
    
    /**
     * Abstract method to print membership status of each member. Explained in the sub classes.
     * @return String with membership information.
     */
    public abstract String printMembershipStatus();
    
    /**
     * Abstract method to print members of the designated class. Explained in the sub classes.
     */
    public abstract void printMembers();
    
    /**
     * Abstract method to add a new membership.
     */
    public abstract void addNewMembership();
        
    /**
     * Abstract method to add the member to a member Array List. Explained in the sub classes.
     * @param member of the member object
     */
    public abstract void addMember(Membership member);
    
    /**
     * Print out the user information of a member. This toString is to be used on member objects.
     * @return String to print out user Information
     */
    @Override
    public String toString() {
        return "Member: " + lastName + " , " + firstName + "\tPreference = " + preference + "" + "\tPayment type = " + pay;
    }
         
}
