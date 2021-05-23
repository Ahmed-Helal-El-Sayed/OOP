/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Motorcycle
{
    private int birthdate;
    String color;
    String type;
    double speed;
    double price;
    
    public Motorcycle(){};   
    
    public  Motorcycle(String c,String t,double s,double p)
    {
       this.color = c;
       this.type = t;
       this.speed = s;
       this.price = p;
    }
    
    Date d = new Date();
    int Year = d.getYear()+1900;
    
    String getColor()
    {
        return color;
        
    }
    
    String getType()
    {
        return type;
        
    }
    
    int getBirthdate()
    {
        return birthdate;
        
    }
    
    public void setBirthdate(int Birthdate)
    {
        this.birthdate = Birthdate;
    }
    
    int getAge(int birthdate)
    {
        return Year - getBirthdate() ;
        
    }
    
    double getSpeed()
    {
        return speed;
        
    }
    
    double getPrice()
    {
        return price;
        
    }
}
