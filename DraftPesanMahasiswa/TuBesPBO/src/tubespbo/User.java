/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author acer
 */
public class User {
    public String nama;
    public String Email;
    public String Password;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    public String getEmail(){
        return Email;
    }
    public void setPassword(String Password){
        this.Password = Password;
    }
    public String getPassword(){
        return Password;
    }
}
