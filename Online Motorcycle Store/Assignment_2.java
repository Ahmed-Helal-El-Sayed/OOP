/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Assignment_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Motorcycle Halawa = new Motorcycle("Yellow","Halaw",300,17000);
        Motorcycle Hogn = new Motorcycle("Red","Hogn",350,16000);
        Motorcycle Dion = new Motorcycle("White","Dion",400,18000);
        
        Halawa.setBirthdate(2010);
        Hogn.setBirthdate(2009);
        Dion.setBirthdate(2015);
        
        
        
        Scooter S = new Scooter("Green","Manual",100,1300,20);
        Truecycle T = new Truecycle("Red","Halaw",150,10000,3);
        Bike B = new Bike ("Black","Trinx",90,3575,25);
        S.setBirthdate(2005);
        T.setBirthdate(2008);
        B.setBirthdate(2001);
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("For Motorcycle press 1 : ");
        System.out.println("For Scooter press 2 : ");
        System.out.println("For Truecycle press 3 : ");
        System.out.println("For Bike press 4 : ");
        int number = input.nextInt();
        
        switch(number)
        {
            case 1 : 
            {
               System.out.println("For Halaw Press 1 ");
                System.out.println("For Hogn Press 2 ");
                System.out.println("For Dion Press 3 ");

                int choice = input.nextInt();

                switch(choice)
                {
                    case 1 : System.out.println("The Color is " + Halawa.getColor()+"\nThe Type is " + Halawa.getType()+"\nThe Speed is " + Halawa.getSpeed() + "\nThe Birthdate is " + Halawa.getBirthdate() + "\nThe age is "+Halawa.getAge(Halawa.getBirthdate())+"\nThe Price is "+ Halawa.getPrice() );
                        break;
                    case 2 : System.out.println("The Color is " + Hogn.getColor() +"\nThe Type is " + Hogn.getType()+"\nThe Speed is " + Hogn.getSpeed()+ "\nThe Birthdate is " + Hogn.getBirthdate() + "\nThe age is "+Hogn.getAge(Hogn.getBirthdate())+"\nThe Price is "+ Hogn.getPrice() );
                        break; 
                    case 3 : System.out.println("The Color is " + Dion.getColor() + "\nThe Type is " + Dion.getType()+"\nThe Speed is " + Dion.getSpeed()+"\nThe Birthdate is " + Dion.getBirthdate() + "\nThe age is "+Dion.getAge(Dion.getBirthdate())+"\nThe Price is "+ Dion.getPrice() );
                        break;

                    default :
                        System.out.println("Try agin!");
                } 
                break;
            }
            case 2 :
            {
                System.out.println("The Color is " + S.getColor()+"\nThe Type is " + S.getType()+"\nThe Speed is " + S.getSpeed() + "\nThe Birthdate is " + S.getBirthdate() + "\nThe age is "+S.getAge(S.getBirthdate())+"\nThe Price is "+ S.getPrice() + "\nthe size is " +S.getSize());
                
                break;
            }
            
            case 3 :
            {
                System.out.println("The Color is " + T.getColor() + "\nThe Birthdate is " +"\nThe Type is " + T.getType()+"\nThe Speed is " + T.getSpeed()+ T.getBirthdate() + "\nThe age is "+T.getAge(T.getBirthdate())+"\nThe Price is "+ T.getPrice() + "\nthe size is " +T.getWheel());
                
                break;
            }
            
            case 4 :
            {
                System.out.println("The Color is " + B.getColor() + "\nThe Type is " + B.getType()+"\nThe Speed is " + B.getSpeed()+"\nThe Birthdate is " + B.getBirthdate() + "\nThe age is "+B.getAge(T.getBirthdate())+"\nThe Price is "+ B.getPrice() + "\nthe size is " +B.getSize());
                
                break;
            }
        }
        
        
        
    }
    
}
