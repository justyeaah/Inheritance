/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FTIMahaciswa;

/**
 *
 * @author user
 */
public class MatematikaCanggih extends Matematika {
    
    private int hasil;
    
    void setTambah (int a, int b){
        hasil = a + b;
    }
    
    void setPerkalian (int a, int b){
        hasil = a * b;
    }
    
    void setModulus (int a, int b){
        hasil = a % b;
    }

    int getHasil(){
        return hasil;
    }
}
