/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elkamash
 */
public class PyramidCSVDAO {

    public PyramidCSVDAO() {
    }
    public List<Pyramid> readPyramidsfromCSv(String filename) throws FileNotFoundException, IOException{
        List<Pyramid> pyramids= new ArrayList<>();
        BufferedReader bf = new BufferedReader(new FileReader(filename));
        String line = bf.readLine();
        if (line != null)
            line=bf.readLine();
        while (line!=null){
            String[] attributes=line.split(",");
            Pyramid pyr=createPyramid(attributes);
            pyramids.add(pyr);
            line = bf.readLine();
        
        
        }
        return pyramids;
        
    
    }

    private Pyramid createPyramid(String[] data) {
        String pharaoh=data[0];
        String modern_name=data[2];
        String site=data[4];
        double height=0;
        if(data[7]!= null && data[7].length()>0)
        height= Double.parseDouble(data[7]);
        return new Pyramid(pharaoh,modern_name,site,height);
        
            
        
        
    }
    
    
    

}
