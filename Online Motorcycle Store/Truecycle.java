/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2;

/**
 *
 * @author HP
 */
public class Truecycle extends Motorcycle {
    
    
    int wheel ;
    
    public  Truecycle(String c,String t,double s,double p,int w)
    {
       this.color = c;
       this.type = t;
       this.speed = s;
       this.price = p;
       this.wheel = w;
    }
    
    
    int getWheel()
    {
        return wheel;
        
    }
    
}
