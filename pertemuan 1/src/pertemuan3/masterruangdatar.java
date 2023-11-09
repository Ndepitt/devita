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
public class masterruangdatar {
    void hitungLuasJajargenjang(int alas, int tinggi){
        int luas = alas*tinggi;
        System.out.println("alas = " + alas);
        System.out.println("tinggi = " + tinggi);
        System.out.println("luas = " + luas);
    }
    
    int LuasJajargenjang(int alas, int tinggi){
        int luas = alas * tinggi;
        System.out.println("alas = " + alas);
        System.out.println("tinggi = " + tinggi);
        return luas;
    }
    
    static void Jajargenjang1(int alas, int tinggi){
        int luas = alas * tinggi;
        System.out.println("alas = " + alas);
        System.out.println("tinggi = " + tinggi);
        System.out.println("luas = " + luas);
    }
    
    static int Jajargenjang2(int alas, int tinggi){
        int luas = alas * tinggi;
        System.out.println("alas = " + alas);
        System.out.println("tinggi = " + tinggi);
        return luas;
    }
}