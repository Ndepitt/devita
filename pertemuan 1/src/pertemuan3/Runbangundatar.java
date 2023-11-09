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
public class Runbangundatar {
    public static void main( String [] args) {
        
        masterruangdatar F = new masterruangdatar ();
        System.out.println(" \nHasil method prosedur dengan parameter");
        F.hitungLuasJajargenjang(4, 8);
        
        System.out.println("Hasil method fungsi dengan parameter");
        System.out.println("LuasJajargenjang = " + F.LuasJajargenjang(4, 8));
        
        System.out.println("Hasil method static prosedur");
        masterruangdatar.Jajargenjang1(4, 8);
        
        System.out.println("Hasil method static fungsi");
        masterruangdatar.Jajargenjang2(4, 8);
    }
}
