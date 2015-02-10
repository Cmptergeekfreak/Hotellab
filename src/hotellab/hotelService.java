/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotellab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Owner
 */
public class hotelService {
   private hotelDao dao;
    
    public hotelService(){
        dao = new hotelDaoStrategy();
    }
    
    public void displayAllHotels() {
        List<Hotel> hotels = dao.findAllHotels();
        for(Hotel h : hotels){
            System.out.println(h);
        }
    }
    
    public void updateHotelRecord() {

        dao.updateHotelRecord(1, "notes", "Nothing quite as dank.");
        System.out.println("Record Updated");
        
    }
    
    public void insertHotelRecord() {
        
        List<String> colNames = new ArrayList<>();
        List values = new ArrayList();
        
        colNames.add("hotel_name");
        colNames.add("street_address");
        colNames.add("city");
        colNames.add("state"); 
        
         values.add("TacoLand");
        values.add("535 Taco Way");
        values.add("Las Vegas");
        values.add("Nevada");
        values.add("57335");
        values.add("A place for tacos and taco lovers.");
        
        dao.insertHotelRecord(colNames, values);
        
    }
    
    public void deleteHotelRecord() { 
    
        dao.deleteHotelRecord(3);
        
    }
        
}

    