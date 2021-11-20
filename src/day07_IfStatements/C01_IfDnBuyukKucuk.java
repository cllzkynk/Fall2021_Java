package day07_IfStatements;

import javax.swing.JOptionPane;

public class C01_IfDnBuyukKucuk {
    public static void main(String[] args) {
        int a=5;
        int b=20;
        
        if (a>5) {
            System.out.println("a sayisi besden buyuk");
        }
        
        if (a>b) {
            System.out.println("a sayisi b den buyuk");
        }
        
        if (b>100) {
            System.out.println("b sayisi 100'den buyuk");
        }
        JOptionPane.showMessageDialog(null, "a sayisi"+a);
        
        
        
        
        
        
        // basit if cumleleri bagimsiz calisir
        // her bir if cumlesi kendi sartina bakar, sart true ise body calisir, 
        //      sart false ise body calismaz
    }
}