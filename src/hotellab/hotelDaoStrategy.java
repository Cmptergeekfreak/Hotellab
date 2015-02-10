/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotellab;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Owner
 */
public class hotelDaoStrategy implements hotelDao {
    
    private DBAccess dba;
    private String driver;
    private String url;
    private String username;
    private String password;
    
    
    public hotelDaoStrategy(){
        dba = new DBMySQLStrategy();
        driver = hotelDataAccessFactory.getDriver();
        url = hotelDataAccessFactory.getUrl();
        username = hotelDataAccessFactory.getUsername();
        password = hotelDataAccessFactory.getPassword();
    }
    
    @Override
    public List<hotel> findAllHotels() {
                      
        dba.openConnection(driver, url, username, password);
        List<Map<String, Object>> records = dba.findAllRecords("hotel");
        List<hotel> hotels = new ArrayList<>();
        hotel h = null;
        for(Map m : records){
            h = new hotel();
            h.setHotelId(Integer.valueOf(m.get("hotel_id").toString()));
            h.setHotelName(m.get("hotel_name").toString());
            h.setAddress(m.get("street_address").toString());
            h.setCity(m.get("city").toString());
            h.setState(m.get("state").toString());
            
            String s = "";
            try{
                s = m.get("notes").toString();
            }catch(NullPointerException npe){
                s = "";
            }
            
            hotels.add(h);
        }
        return hotels;
    }
    
    @Override
    public int updatehotelrecord(int pk, String col, String value) {
        
        dba.openConnection(driver, url, username, password);
        int updates = dba.updateRecord("hotel", "hotel_id", pk, col, value);
    
        return updates;
        
    }
    
    @Override
    public int inserthotelrecord(List<String> colNames, List values) {
       dba.openConnection(driver, url, username, password);
        int updates = dba.insertRecord("hotel", colNames, values);
        
        return updates;
    }
    
    @Override
    public int deletehotelrecord(int pk) {
        dba.openConnection(driver, url, username, password);
        int updates = dba.deleteRecord("hotel", "hotel_id", pk);
        
        return updates;
    }
   
    
    
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        HotelDAO db = new HotelDAOStrategy();
//        List<Hotel> hotels = db.findAllHotels();
//        for(Hotel h : hotels){
//            System.out.println(h);
//        }
//    }

    @Override
    public List<hotel> findallhotels() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

   

    

    
    
}
