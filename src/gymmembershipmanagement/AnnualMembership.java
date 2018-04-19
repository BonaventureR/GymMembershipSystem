/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmembershipmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Makes an annual member after extending the parent abstract Membership Class.
 * @author Bonaventure Raj
 */
public class AnnualMembership extends Membership {
    //Fields
    private ArrayList<Membership> members = new ArrayList<Membership>();

    
    //Constructor
    public AnnualMembership(String lastName, String firstName, PREFERENCES preference, Payment pay) {
        super(lastName, firstName, preference, pay);
    }

    
    /**
     * Prints the membership status of the user.
     * @return String with the membership information.
     */
    @Override
    public String printMembershipStatus() {
     return "You have purchased an annual membership, you have access to everything in this establishment!";
    }
    
    /**
     * Prints all annual members currently in the system.
     */
    @Override
    public void printMembers() {
        //Prints the membership for each member.
        //This method should print all the members in the members array list.
        //This method is important because it will show the membeship status
        //and the user information of the user.
        
        for(Membership membership : members) {
            System.out.println(membership.toString());
            System.out.println(membership.printMembershipStatus());
        }
    }
    
    /**
     * Adds the member to the members system Array List.
     * @param member : The members Array List
     */
    @Override
    public void addMember(Membership member) {
        //This method should add a member to an array list so that each member can be accessed later.
        members.add(member);
    }
    
     
    /**
     * Directory to add a New Annual Member to the list of people management.
     */
    @Override
    public void addNewMembership(){
        //Add A New Annual Member to the list of people management.
        //This method should invoke the scanner class to get user input and enter new user information.
        //Adds a new member to an array list at the end fo the method.
        
        //Import a scanner
        Scanner sc = new Scanner(System.in);
        
        //Ask if the user would like to add a member
        System.out.println("Would you like to add a new annual month member? Please Type Yes or No");
        
        //If yes then ask for user information
        String check = sc.nextLine();
        if(check.equals("Yes") || check.equals("yes")){
            
            //Intialized variables to first set up a member.
            String lastName;
            String firstName;
            String Preferences = "KARATE";
            int payment;
            Scanner personInformation = new Scanner(System.in);
            
            //Ask for user input on new user information. Set the information for the new user
            System.out.println("Please type the following information:");
            System.out.println("What is the members last name?");
            lastName = personInformation.nextLine();
            System.out.println("What is the members first name?");
            firstName = personInformation.nextLine();
            System.out.println("What is the members preference activity? Choose from (please enter all caps): \t KICKBOXING \t KARATE \t YOGA \t CYCLING \t STRETCHING \t or ZUMBA");
            Preferences = sc.nextLine();
            PREFERENCES.valueOf(Preferences);
            System.out.println("How would you like to pay? 1: Full Payment      2: Monthly Payment    3: Wait to pay (Overdue Payment)");
            payment = personInformation.nextInt();
            
           
            //Sets the information above as a new Annual Member.
            AnnualMembership annualMember = new AnnualMembership(lastName, firstName, PREFERENCES.valueOf(Preferences), new FullPayment());
            //adds the member using the addMember method to the arrayLsit
            addMember(annualMember);
        }
    } 


       
}
