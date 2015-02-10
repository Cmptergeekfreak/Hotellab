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
    public abstract List<hotel> findallhotels();
    public abstract int updatehotelrecord(int pk, String col, String value);
    public abstract int deletehotelrecord(int pk);
    public abstract int inserthotelrecord(List<String> colNames, List values);

    public List<hotel> findAllHotels();

    public void updateHotelRecord(int i, String notes, String nothing_quite_as_dank);
    
    
    
}
