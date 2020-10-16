/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author abu
 */
public class Login {
    //Deklarasi
    private String username, password;
    
    //Costructor
    public Login(){
        username = "admin";
        password = "12345";
    }
    
    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    //Setter
    public void setUsename(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
    //Getter
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
}
