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
public class MatematikaCanggihBerkasi {
    public static void main(String[] args) {
        MatematikaCanggih math = new MatematikaCanggih();
        
        math.setAngka1(8);
        math.setAngka2(3);
        
        math.setTambah(math.getAngka1(), math.getAngka2());
        System.out.println("Hasil pertambahan dari " + math.getAngka1() + " + " + math.getAngka2() + " = " + math.getHasil());
        
        math.setPerkalian(math.getAngka1(), math.getAngka2());
        System.out.println("Hasil perkalian dari " + math.getAngka1() + " x " + math.getAngka2() + " = " + math.getHasil());
        
        math.setModulus(math.getAngka1(), math.getAngka2());
        System.out.println("Hasil modulus dari " + math.getAngka1() + " % " + math.getAngka2() + " = " + math.getHasil());
    }
    
}
