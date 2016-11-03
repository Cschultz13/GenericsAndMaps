/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author cschultz57
 */
public class StartUp {
    public static void main(String[] args) {
        Map favoriteCars = new HashMap();
        
        List favFords = new ArrayList();
        favFords.add("Ford GT");
        favFords.add("Shelby GT350");
        List favChevys = new ArrayList();
        favChevys.add("Corvette Stingray");
        favChevys.add("1967 Impala");
        
        favoriteCars.put("Ford", favFords);
        favoriteCars.put("Chevy", favChevys);
        favoriteCars.put("Dodge", "Viper");
        
        favoriteCars.put("Chevy", "Camaro");
        
        String favChevy = (String)favoriteCars.get("Chevy");
        List found = (List)favoriteCars.get("Ford");
        System.out.println(found);
        
    }
    
}
