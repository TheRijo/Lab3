package com.company;

public class testVector2D {

    public static void main(String[] args) {
        Vector2D pierwszy = new Vector2D(4,5);
        Vector2D drugi = new Vector2D(7,7);

        Vector2D suma = pierwszy.suma(drugi);
        Vector2D roznica = pierwszy.roznica(drugi);
        Vector2D wersor1 = pierwszy.normalizacja();
        Vector2D wersor2 = drugi.normalizacja();

        double dlugosc1 = pierwszy.getDlugosc();
        double dlugosc2 = drugi.getDlugosc();
        double dlugosc3 = wersor1.getDlugosc();
        double dlugosc4 = wersor2.getDlugosc();
        double dlugosc5 = suma.getDlugosc();
        double dlugosc6 = roznica.getDlugosc();

        Vector2D iloczyn = pierwszy.iloczyn_stala(14);
        System.out.println("X pierwszego: "+pierwszy.X);
        System.out.println("Y pierwszego: "+pierwszy.Y);
        System.out.println("Długość pierwszego: "+pierwszy.getDlugosc());
        System.out.println("X drugiego: "+drugi.X);
        System.out.println("Y drugiego: "+drugi.Y);
        System.out.println("Długość drugiego: "+drugi.getDlugosc());
        System.out.println("X sumy: "+suma.X);
        System.out.println("Y suma: "+suma.Y);
        System.out.println("Długość sumy: "+suma.getDlugosc());
        System.out.println("X różnicy: "+roznica.X);
        System.out.println("Y różnicy: "+roznica.Y);
        System.out.println("Długość różnicy: "+roznica.getDlugosc());
        System.out.println("X wersora1: "+wersor1.X);
        System.out.println("Y wersora1: "+wersor1.Y);
        System.out.println("Długość wersora1: "+wersor1.getDlugosc());
        System.out.println("X wersora2: "+wersor2.X);
        System.out.println("Y wersora2: "+wersor2.Y);
        System.out.println("Długość wersora2: "+wersor2.getDlugosc());
        System.out.println("X iloczynu: "+iloczyn.X);
        System.out.println("Y iloczynu: "+iloczyn.Y);
        System.out.println("Długość iloczynu: "+iloczyn.getDlugosc());
        SpringApplet nowy = new SpringApplet();
        nowy.init();
    }


}
