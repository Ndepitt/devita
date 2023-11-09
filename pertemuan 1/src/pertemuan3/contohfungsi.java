/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author WINDOWS
 */
public class contohfungsi {
    int alas = 4;
    int tinggi = 8;
    
    int hitungLuasJajargenjang (){
        int Luas = alas*tinggi;
        System.out.println("alas = " + tinggi);
        return Luas;
    
}
    public static void main(String [] args){
        contohfungsi F = new contohfungsi();
        System.out.println("LuasJajargenjang = " + F.hitungLuasJajargenjang());
    }
}