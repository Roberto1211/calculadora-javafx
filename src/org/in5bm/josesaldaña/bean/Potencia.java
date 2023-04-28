package org.in5bm.josesaldaña.bean;

/**
 * @author José Roberto Saldaña Arrazola
 * @date 21/03/2022

 * Codigo tecnico: IN5BM
 * Carné: 2021040
 * Grupo: 2 (lunes) 
 */

public class Potencia {
    
    private float potenciar;

    public Potencia(){

    }

    public Potencia(float potenciar){
    this.potenciar = potenciar;
    }
    
    public float potenciar(){
    this.potenciar = (float)Math.pow(potenciar, 2);
    return potenciar;
    }
    
    public float potenciar(float numero){
    this.potenciar = (float)Math.pow(numero, 2);
    return potenciar;
    }

    public float getPotenciar() {
    return potenciar;
    }

    public void setPotenciar(float potenciar) {
    this.potenciar = potenciar;
    }
}
