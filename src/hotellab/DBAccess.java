/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotellab;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Owner
 */
public interface DBAccess {
    
    public abstract void openConnection(String driverName, String url, String userName, String password);
    public abstract void closeConnection();
    
    public abstract List<Map<String, Object>> findAllRecords(String tableName);
    public abstract int deleteRecord(String tableName, String pkKey, int pk);  
    public abstract int insertRecord(String tableName, List<String> colNames, List values); 
    public abstract int updateRecord(String tableName, String pkKey, int pk, String colName, Object value);
    
}
