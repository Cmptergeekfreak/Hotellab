/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotellab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Owner
 */
public class HotelDataAccessFactory {
    
    public static String getDriver(){
        
        String s = null;
        Character sep = File.separatorChar;
        
        File file = new File("src" + sep + "cfg" + sep + "config.properties");
        
//        File file = new File("src/cfg/config.properties");
        Properties props = new Properties();
        FileInputStream in;
        
        try{
        
        in = new FileInputStream(file);
        props.load(in);
        in.close();
        s = props.getProperty("driver");
        
        }catch(FileNotFoundException fnfe){
            System.out.println("File not found.");
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        
        
        return s;
    } 
    
    public static String getUrl() {
        
        String s = null;
        Character sep = File.separatorChar;
        
        File file = new File("src" + sep + "cfg" + sep + "config.properties");
//        File file = new File("src/cfg/config.properties");
        Properties props = new Properties();
        FileInputStream in;
        
        try{
            
        in = new FileInputStream(file);
        props.load(in);
        in.close();
        
        s = props.getProperty("url");
        
        }catch(FileNotFoundException fnfe){
            System.out.println("File not found.");
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        
        return s;
    } 
    
    public static String getUsername() {
        
        String s = null;
        Character sep = File.separatorChar;
        
        File file = new File("src" + sep + "cfg" + sep + "config.properties");
//        File file = new File("src/cfg/config.properties");
        Properties props = new Properties();
        FileInputStream in;
        
        try{
        
        in = new FileInputStream(file);
        props.load(in);
        in.close();
        
        s = props.getProperty("username");
        
        }catch(FileNotFoundException fnfe){
            System.out.println("File not found.");
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        
        return s;
    } 
    
    public static String getPassword() {
        
        String s = null;
        Character sep = File.separatorChar;
        
        File file = new File("src" + sep + "cfg" + sep + "config.properties");
//        File file = new File("src/cfg/config.properties");
        Properties props = new Properties();
        FileInputStream in;
        
        try{
        
        in = new FileInputStream(file);
        props.load(in);
        in.close();
        
        s = props.getProperty("password");
        
        }catch(FileNotFoundException fnfe){
            System.out.println("File not found.");
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        
        return s;
    } 
    
}
