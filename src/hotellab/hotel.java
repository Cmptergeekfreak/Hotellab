/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotellab;

/**
 *
 * @author Owner
 */
public class hotel {
    
    private int hotelId;
    private String hotelName;
    private String address;
    private String city;
    private String state;
    

    public hotel(){
        
    }
    
    public hotel(int hotelId, String hotelName, String address, String city, String state) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.address = address;
        this.city = city;
        this.state = state;
        
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.hotelId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final hotel other = (hotel) obj;
        if (this.hotelId != other.hotelId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hotel{" + "hotelId=" + hotelId + ", hotelName=" + hotelName + ", address=" + address + ", city=" + city + ", state=" + state + '}';
    }
    
    
    
}
