/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotellab;

import java.sql.SQLException;
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
        
        dba.openConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost:2205/hotel","root","admin");
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
            h.setPostalCode(m.get("postal_code").toString());
            String s = "";
            try{
                s = m.get("notes").toString();
            }catch(NullPointerException npe){
                s = "";
            }
            h.setNotes(s);
            hotels.add(h);
        }
        return hotels;
    }
    
    @Override
    public int updateHotelRecord(int pk, String col, String value) {
        
        dba.openConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost:2205/hotel","root","admin");
        int updates = dba.updateRecord("hotel", "hotel_id", pk, col, value);
    
        return updates;
        
    }
    
    @Override
    public int insertHotelRecord(List<String> colNames, List values) {
        
        dba.openConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost:2205/hotel","root","admin");
        int updates = dba.insertRecord("hotel", colNames, values);
        
        return updates;
        
    }
    
    @Override
    public int deleteHotelRecord(int pk) {
        
        dba.openConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost:2205/hotel","root","admin");
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

     
}
