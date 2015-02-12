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
public class Hotel {
    
    private int hotelId;
    private String hotelName;
    private String address;
    private String city;
    private String state;
    private String postcode;
    private String notes;
    

    public Hotel(){
        
    }
    
    public Hotel(int hotelId, String hotelName, String address, String city, String state, String postcode, String notes ) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.notes = notes;
        
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
        final Hotel other = (Hotel) obj;
        if (this.hotelId != other.hotelId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hotel{" + "hotelId=" + hotelId + ", hotelName=" + hotelName + ", address=" + address + ", city=" + city + ", state=" + state + ", postcode=" + postcode + ", notes=" + notes + '}';
    }

    
    
    
    
}
