package uts.rpl;

public class Main {

   //class main agar program dapat di run
    public static void main(String[] args) {
        
        System.out.println("Masukkan panjang dan Lebar Bangun Segi Empat: ");
        Pola1 pola1 = new Pola1(); 
        pola1.segiempat(); //pemanggilan method segiempat pada class TemplateMethode
    }
    
}
