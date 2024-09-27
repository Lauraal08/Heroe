package com.mycompany.heroe;

public class Heroe {

    private String nombre;
    private int vida;
    private int x;
    private boolean saltando;

    public Heroe(String nombre) {
        this.nombre = nombre;
        this.vida = 3;
        this.x = 0;
        this.saltando = false;
    }

    public int getVida() {
        return vida;
    }

    public int getX() {
        return x;
    }
    
    public void setAvanzar() {
        this.x++;
        System.out.println(nombre + " avanza al paso " + this.x);

        if (this.x % 10 == 0) {
            Obstaculo();
        }
    }

    public void Saltar() {
        this.saltando = true;
        System.out.println(nombre + " salta el obstáculo.");
        this.saltando = false;
    }

    public void Obstaculo() {
        System.out.println("Ay un obstaculo en el camino en " + this.x  );
        if (this.saltando) {
            System.out.println(nombre + " ha saltado el obstáculo.");
        } else {
            this.vida--;
            System.out.println(nombre + " no ha saltado y pierde una vida.");
            System.out.println("Vidas restantes: " + this.vida); 
        }

        if (this.vida <= 0) {
            System.out.println(nombre + " ha perdido todas las vidas. ¡Juego terminado!");
        }
    }

   
}
