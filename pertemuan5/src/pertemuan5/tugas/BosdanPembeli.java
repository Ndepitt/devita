/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5.tugas;

/**
 *
 * @author WINDOWS
 */
public class BosdanPembeli extends Toko {

    String toko;
    @Override
    public void menampilkan (){
        System.out.println("namatoko:" + namatoko);
        System.out.println("namapemiliktoko :" + namapemiliktoko);
        System.out.println("nomorpembeli:" + nomorpembeli);
        System.out.println("kodebarang :" + kodebarang);
    }
    public void barang(){
        System.out.println("barang : kode33 shampoo zink");
    }
}
