package com.company;

public class Vector2D {
    public double X;
    public double Y;
    protected double dlugosc;
    public Vector2D(){
        this.X = 0;
        this.Y = 0;
    }
    //konstuktor domyślny
    public Vector2D(double x, double y){
        X = x;
        Y = y;
    }
    //konstruktor z parametrami
    public Vector2D suma(Vector2D abc){
        double X1 = this.X + abc.X;
        double Y1 = Y = abc.Y;
        Vector2D Suma = new Vector2D(X1,Y1);
        return Suma;
    }
    //wektor sumy
    public Vector2D roznica(Vector2D abc){
        double X1 = X - abc.X;
        double Y1 = Y - abc.Y;
        Vector2D Roznica = new Vector2D(X1,Y1);
        return Roznica;
    }
    //wektor roznicy
    public Vector2D iloczyn_stala(double k){
        Vector2D iloczynStala = new Vector2D(k*X,k*Y);
        return iloczynStala;
    }
    //wektor iloczynu ze stałą
    public double getDlugosc(){
        dlugosc = Math.sqrt(X*X+Y*Y);
        return dlugosc;
    }
    //obliczanie dlugosci
    public Vector2D normalizacja(){
        this.getDlugosc();
        double x = X/dlugosc;
        double y = Y/dlugosc;
        Vector2D wersor = new Vector2D(x,y);
        return wersor;
    }
    //normalizacja wektora
}
