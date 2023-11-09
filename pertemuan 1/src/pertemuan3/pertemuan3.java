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
public class pertemuan3 {
    int alas =4;
    int tinggi =8;
    
void hitungLuasJajargenjang () {
    int luas = alas * tinggi ;
    System.out.println("alas = " + alas);
    System.out.println("tinggi = " + tinggi);
    System.out.println("luas = " + luas);      
}
   
public static void main(String[] args) {
    pertemuan3 P = new pertemuan3();
    P.hitungLuasJajargenjang();
}
}
