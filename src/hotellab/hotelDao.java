/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotellab;

import java.util.List;

/**
 *
 * @author Owner
 */
public interface hotelDao {
    
    public abstract List<hotel> findAllHotels();
    public abstract int updateHotelRecord(int pk, String col, String value);
    public abstract int deleteHotelRecord(int pk);
    public abstract int insertHotelRecord(List<String> colNames, List values);
    
    
    
}
