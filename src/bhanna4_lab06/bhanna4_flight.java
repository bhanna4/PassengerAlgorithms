/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhanna4_lab06;

/**
 *
 * @author baile_000
 */
import static java.util.Collections.list;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class bhanna4_flight {
    
    String fNumber;
    
    LinkedList passengersOF = new LinkedList();
    
    
    public void addPassenger(bhanna4_passenger P)
    {
        passengersOF.add(P);
     
        
    }
    public String printPassengers()
    {
        bhanna4_passenger temp;
        String send = "";
        if(passengersOF.size()>0)
        {
            for(int i = 0; i < passengersOF.size(); i++)
            {
                temp = (bhanna4_passenger) passengersOF.get(i);
                send += "<html>" + temp.name+ "        " + temp.ID +"<BR>";
                
            }
        }
           
        else
            System.out.println("No passengers on board.");
        
        return send;
    }
    public void shufflePassengers()
    {
        java.util.Collections.shuffle(passengersOF);
        System.out.print(passengersOF.size());
    }
    public void sortPassengers()
    {
        System.out.print(passengersOF.size());
        int pivot;
        pivot = passengersOF.size()/2;
        
        while (pivot>0)
                {
                   for(int j = 0; j <8; j++){
                       
                       for(int i=pivot;i<passengersOF.size();i+=pivot)
                       {
                           
                           bhanna4_passenger name1, name2;
                           name1 = (bhanna4_passenger) passengersOF.get(i-pivot);
                           name2 = (bhanna4_passenger) passengersOF.get(i);
                           if(name1.name.compareTo(name2.name)>0)
                           {
                               
                               
                               passengersOF.set(i, name1);
                               passengersOF.set(i-pivot, name2);
                               
                           }
                           else if(name1.name.compareTo(name2.name)<0)
                           {
                               
                           }
                           else if(name1.name.compareTo(name2.name)==0)
                           {
                               if(name1.ID>name2.ID)
                               {
                                   
                               }
                               else if(name1.ID<name2.ID)
                               {
                                    passengersOF.set(i, name1);
                                    passengersOF.set(i-pivot, name2);
                               }
                               
                           }
                           
                       }
                       
                   }
                   pivot = pivot/2;
                }
        
        
        
        //Needs more work. Doesn't compare all of them :/
    }
    public void reversePassengers()
    {
        bhanna4_passenger temp1;
        int size = passengersOF.size();
        
        
        LinkedList temp = new LinkedList();
        for(int i =size-1; i>=0; i--)
        {
            temp1 = (bhanna4_passenger) passengersOF.get(i);
            temp.add(temp1);
        }
        passengersOF.clear();
        for(int i = 0; i<size;i++)
        {
            passengersOF.add(temp.get(i));
        }
    }
    
}
