package org.in5bm.josesaldaña.bean;

/**
 * @author José Roberto Saldaña Arrazola
 * @date 21/03/2022

 * Codigo tecnico: IN5BM
 * Carné: 2021040
 * Grupo: 2 (lunes) 
 */

public abstract class Operacion {

    private float numero1;
    private float numero2;
    private float resultado;
    private char operador;

    public Operacion() {

    }

    public Operacion(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return this.numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return this.numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado() {
        return this.resultado;
    }

    protected void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public char getOperador() {
        return this.operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public abstract float operar();

    public abstract float operar(float numero1, float numero2);
}
