/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmembershipmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main method to run the program and ask the user to enter a member. This will then save the member to an Array List and will 
 * Save it to a directory of the gym membership program.
 * @author Bonaventure Raj
 */
public class GymMembershipManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Count for each member type
        int TrialMemberships = 0;
        int ThreeMonthMemberships = 0;
        int annualMemberships = 0;

        //Save each member to an arraylist.
        ArrayList<Membership> memberz = new ArrayList<Membership>();
        //Initializes membership
        TrialMembership trialMembership = new TrialMembership("", "", Membership.PREFERENCES.KICKBOXING, new MonthlyPayment() );
        ThreeMonthMembership threeMonthMembership = new ThreeMonthMembership("", "", Membership.PREFERENCES.CYCLING, new FullPayment());
        AnnualMembership annualMembership = new AnnualMembership("", "", Membership.PREFERENCES.YOGA, new OverduePayment());
        
        //count for the do while statement
        int count = -1;
        
        do{
            
        //scanner for user input
        Scanner sc = new Scanner(System.in);
        String addMember;

        
        //asks whether the use would want to add a new member.
        System.out.println("Would you like to add a new member? Options: Yes or No");
        addMember = sc.next();

        
        //checks to see whether to add a new member or not. 
        if (addMember.equals("Yes") || addMember.equals("yes")){
            //checks to see what type of user
            System.out.println("What type of member would you like to add?: \t 1) Trial Member \t 2) Three Month Member \t 3) Annual Member");
            
            //Check what type of member to add.
            int choice = sc.nextInt();
            switch (choice){
                case 1: 
                    //adds a trial member.
                    trialMembership.addNewMembership();
                    //prints the membership information.
                    trialMembership.printMembers();
                    //prints membership type.
                    TrialMemberships++;
                    memberz.add(trialMembership);
                    break;
                    
                case 2: 
                    //adds a three month member.
                    threeMonthMembership.addNewMembership();
                    //prints the membership information.
                    threeMonthMembership.printMembers();
                    //Print membership type
                    System.out.println(threeMonthMembership.makePayment());
                    //Add to Three Month Member Count
                    ThreeMonthMemberships++;
                    memberz.add(threeMonthMembership);
                    break;
                    
                case 3:
                    //adds an annual member.
                    annualMembership.addNewMembership();
                    //prints the membership information.
                    annualMembership.printMembers();
                    //Prints membership type
                    System.out.println(annualMembership.makePayment());
                    //Add to Annual Members Count
                    annualMemberships++;
                    memberz.add(annualMembership);
                    break;
                
                default:
                    //The user did not input a correct output.
                    System.out.println("You did not pick the numbers 1, 2 , 3. System exiting");
                    System.exit(0);
                    break;      
            }   
        } else {
            //If the user types no to adding a new user.
            System.out.println("You have chose not to add a new member, you are complete!");
            count = 2;
            
        } 
        
    } while(count == -1);
        //Prints out each member and type in the system.
        for(Membership ship : memberz) {
            ship.printMembers();
        }
        
        //Prints out the amount of each members.
        System.out.println();
        System.out.println("Here are how many members of each exist: Trial Memberships - " + TrialMemberships + "\tThree Month Memberships - " + ThreeMonthMemberships + ""
                + "\tAnnual Memberships - " + annualMemberships);  
        
        
    }
}