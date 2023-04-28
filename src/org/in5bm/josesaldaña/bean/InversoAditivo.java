package org.in5bm.josesaldaña.bean;

/**
 * @author José Roberto Saldaña Arrazola
 * @date 21/03/2022

 * Codigo tecnico: IN5BM
 * Carné: 2021040
 * Grupo: 2 (lunes) 
 */

public class InversoAditivo {

    private float invertir;

    public InversoAditivo() {

    }

    public InversoAditivo(float invertir) {
        this.invertir = invertir;
    }

    public float invertir() {
        this.invertir = invertir * -1;
        return invertir;
    }

    public float invertir(float numero) {
        this.invertir = numero * -1;
        return invertir;
    }

    public float getInvertir() {
        return invertir;
    }

    public void setInvertir(float invertir) {
        this.invertir = invertir;
    }
}
