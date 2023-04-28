package org.in5bm.josesaldaña.bean;

/**
 * @author José Roberto Saldaña Arrazola
 * @date 21/03/2022

 * Codigo tecnico: IN5BM
 * Carné: 2021040
 * Grupo: 2 (lunes) 
 */

public class RaizCuadrada extends Operacion {

    @Override
    public float operar() {
        setResultado((float) Math.sqrt(getNumero2()));
        return getResultado();
    }

    @Override
    public float operar(float numero1, float numero2) {
        setNumero1(numero1);
        setNumero2(numero2);
        setResultado((float) Math.sqrt(getNumero2()));
        return this.getResultado();
    }
}
