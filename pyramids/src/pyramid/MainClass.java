/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mobicare
 */
package pyramid;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

/**
 *
 * @author elkamash
 */
public class MainClass {
  public static void main (String[] args) throws IOException{
    PyramidCSVDAO DAO=new PyramidCSVDAO();
    List<Pyramid> pyramids= DAO.readPyramidsfromCSv("C:\\Users\\mobicare\\Documents\\NetBeansProjects\\pyramids\\pyramids.csv");
 int i =0 ; 
 int j=0;
 //mapping
 
for(Pyramid p:pyramids){

System.out.println(""+ (i++) +p);
}  
      Collections.sort(pyramids, (Pyramid p1, Pyramid p2) -> ((Double)p1.getHeight()).compareTo(p2.getHeight())); // notice the cast to (Integer) to invoke compareTo
    
  System.out.println("Ordered list by height : ");
  for(Pyramid p:pyramids){

System.out.println(" " + (j++) + p+ "\n");
}  
  
  
        HashMap<String,Integer> m = new HashMap<>();
        for(Pyramid p : pyramids){
            String t = p.getSite();
            Integer c = m.putIfAbsent(t,1);
            if(c != null){
                m.put(t, c + 1);
            }
        }
        System.out.println(m);
        
    
  
  
  
  
  
  }
}