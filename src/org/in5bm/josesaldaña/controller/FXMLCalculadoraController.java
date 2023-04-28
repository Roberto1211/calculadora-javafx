package org.in5bm.josesaldaña.controller;

import org.in5bm.josesaldaña.bean.Suma;
import org.in5bm.josesaldaña.bean.Resta;
import org.in5bm.josesaldaña.bean.Multiplicacion;
import org.in5bm.josesaldaña.bean.Division;
import org.in5bm.josesaldaña.bean.Porcentaje;
import org.in5bm.josesaldaña.bean.InversoAditivo;
import org.in5bm.josesaldaña.bean.Operacion;
import org.in5bm.josesaldaña.bean.Reciproco;
import org.in5bm.josesaldaña.bean.RaizCuadrada;
import org.in5bm.josesaldaña.bean.Potencia;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

/**
 * @author José Roberto Saldaña Arrazola
 * @date 21/03/2022

 * Codigo tecnico: IN5BM
 * Carné: 2021040
 * Grupo: 2 (lunes) 
 */

public class FXMLCalculadoraController implements Initializable {

    private String operadorAnterior;
    private float resultado;
    private float numero;
    private int contadorOperadores;
    private boolean ingresoNuevo = false;
    int contador = 1;

    @FXML
    private Label lblPantalla;

    @FXML
    private Label lblOperacion;

    @FXML
    private Button btnPunto;

    @FXML
    private Button btnIgual;

    @FXML
    private Button btnSuma;

    @FXML
    private Button btnResta;

    @FXML
    private Button btnMultiplicacion;

    @FXML
    private Button btnDivision;

    @FXML
    private Button btnPorcentaje;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnDel;

    @FXML
    private Button btnCambiarSigno;

    @FXML
    private Button btnReciproco;

    @FXML
    private Button btnPotencia;

    @FXML
    private Button btnRaizCuadrada;

    @FXML
    private Button btnCero;

    @FXML
    private Button btnUno;

    @FXML
    private Button btnDos;

    @FXML
    private Button btnTres;

    @FXML
    private Button btnCuatro;

    @FXML
    private Button btnCinco;

    @FXML
    private Button btnSeis;

    @FXML
    private Button btnSiete;

    @FXML
    private Button btnOcho;

    @FXML
    private Button btnNueve;

    @FXML
    private AnchorPane backgroundPane;

    @FXML
    private MenuItem Tema1;

    @FXML
    private MenuItem Tema2;

    @FXML
    private MenuItem Tema3;

    @FXML
    private MenuItem Tema4;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void clicTema1() {
        backgroundPane.setStyle("-fx-background-color:#f4f4f4;");
        lblPantalla.setStyle("-fx-background-color: #e6bf74");
        lblOperacion.setStyle("-fx-text-fill: #000000;");
    }

    @FXML
    private void clicTema2() {
        backgroundPane.setStyle("-fx-background-color:#333333;");
        lblPantalla.setStyle("-fx-background-color:#FFFFFF;");
        lblOperacion.setStyle("-fx-text-fill: #000000;");
    }

    @FXML

    private void clicTema3() {
        backgroundPane.setStyle("-fx-background-color: #33949e;");
        lblPantalla.setStyle("-fx-background-color: #f6ebd7;");
    }

    @FXML
    private void clicTema4() {
        backgroundPane.setStyle("-fx-background-color: #043553;");
        lblPantalla.setStyle("-fx-background-color: #ff885c;");
    }

    @FXML
    private void clicTema5() {
        backgroundPane.setStyle("-fx-background-color: #2d3e50;");
        lblPantalla.setStyle("-fx-background-color: #1bbc9b;");
        lblOperacion.setStyle("-fx-text-fill: #000000;");
    }

    @FXML
    private void clicSuma() {

        if (this.contador == 1) {
            lblOperacion.setText(lblPantalla.getText() + "+");
            calcular("+");
            this.contador++;
        } else if (this.contador == 2) {
            calcular("+");
            lblOperacion.setText(lblPantalla.getText() + "+");
        }
    }

    @FXML
    private void clicResta() {

        if (this.contador == 1) {
            lblOperacion.setText(lblPantalla.getText() + "-");
            calcular("-");
            this.contador++;
        } else if (this.contador == 2) {
            calcular("-");
            lblOperacion.setText(lblPantalla.getText() + "-");
        }
    }

    @FXML
    private void clicMultiplicacion() {

        if (this.contador == 1) {
            lblOperacion.setText(lblPantalla.getText() + "×");
            calcular("*");
            this.contador++;
        } else if (this.contador == 2) {
            calcular("*");
            lblOperacion.setText(lblPantalla.getText() + "×");
        }
    }

    @FXML
    private void clicDivision() {

        if (this.contador == 1) {
            lblOperacion.setText(lblPantalla.getText() + "÷");
            calcular("/");
            this.contador++;
        } else if (this.contador == 2) {
            calcular("/");
            lblOperacion.setText(lblPantalla.getText() + "÷");
        }
    }

    @FXML
    private void clicPorcentaje() {

        if (this.contador == 1) {
            lblOperacion.setText(lblPantalla.getText() + "%");
            calcular("%");
            this.contador++;
        } else if (this.contador == 2) {
            calcular("%");
            lblOperacion.setText(lblPantalla.getText() + "%");
        }
    }

    @FXML
    private void clicInvertir() {
        invertir();
    }

    @FXML
    private void clicReciproco() {
        contadorOperadores++;
        resultado = 1;
        operadorAnterior = "1/x";
        calcular("1/x");
    }

    @FXML
    private void clicRaizCuadrada() {
        contadorOperadores++;
        resultado = 1;
        operadorAnterior = "√";
        if (this.contador == 1) {
            lblOperacion.setText("√" + lblPantalla.getText());
            calcular("√");
        } else if (this.contador == 2) {
            calcular("*");
            lblOperacion.setText(lblPantalla.getText() + "√");
        }
    }

    @FXML
    private void clicPotencia() {
        if (this.contador == 1) {
            lblOperacion.setText(lblPantalla.getText() + "²");
            this.contador++;
        } else if (this.contador == 2) {
            lblOperacion.setText(lblPantalla.getText() + "²");
        }
        contadorOperadores++;
        resultado = 1;
        operadorAnterior = "²";
        calcular("²");
    }

    @FXML
    private void clicIgual() {
        if (!(lblOperacion.getText().contains("="))) {
            lblOperacion.setText(lblOperacion.getText() + lblPantalla.getText() + "=");
            calcular(this.operadorAnterior);
        }

        lblPantalla.setText(String.valueOf(this.resultado));
    }

    @FXML
    private void clicPunto() {
        agregarPunto();
    }

    @FXML
    private void clicLimpiar() {
        limpiar();
    }

    @FXML
    private void clicDel() {
        if ((!(lblPantalla.getText().equals("")))) {
            String cadena = lblPantalla.getText();
            lblPantalla.setText(lblPantalla.getText().substring(0, cadena.length() - 1));
        }
    }

    @FXML
    private void clicCero() {
        agregarCero();
    }

    @FXML
    private void clicUno() {
        actualizarPantalla("1");
    }

    @FXML
    private void clicDos() {
        actualizarPantalla("2");
    }

    @FXML
    private void clicTres() {
        actualizarPantalla("3");
    }

    @FXML
    private void clicCuatro() {
        actualizarPantalla("4");
    }

    @FXML
    private void clicCinco() {
        actualizarPantalla("5");
    }

    @FXML
    private void clicSeis() {
        actualizarPantalla("6");
    }

    @FXML
    private void clicSiete() {
        actualizarPantalla("7");
    }

    @FXML
    private void clicOcho() {
        actualizarPantalla("8");
    }

    @FXML
    private void clicNueve() {
        actualizarPantalla("9");
    }

    public void limpiar() {
        lblPantalla.setText("");
        lblOperacion.setText("");
        resultado = 0;
        numero = 0;
        contadorOperadores = 0;
        operadorAnterior = "";
        ingresoNuevo = false;
        contador = 1;
    }

    public void agregarCero() {
        String cadena = lblPantalla.getText();

        if (cadena.length() >= 2) {
            lblPantalla.setText(lblPantalla.getText() + "0");
        } else if (!(lblPantalla.getText().contains("0"))) {
            lblPantalla.setText(lblPantalla.getText() + "0");
        }
    }

    public void agregarPunto() {

        if (ingresoNuevo) {
            lblPantalla.setText("");
        }

        String cadena = lblPantalla.getText();

        if (cadena.length() <= 0) {
            lblPantalla.setText("0.");
            ingresoNuevo = false;
        } else if (!(lblPantalla.getText().contains("."))) {
            lblPantalla.setText(lblPantalla.getText() + ".");
        }
    }

    public void actualizarPantalla(String digito) {
        if (ingresoNuevo) {
            lblPantalla.setText("");
        }

        if (lblPantalla.getText().contains("0.")) {

        } else if (lblPantalla.getText().contains(".0")) {
            lblPantalla.setText(lblPantalla.getText());
        }

        lblPantalla.setText(lblPantalla.getText().concat(digito));
        ingresoNuevo = false;
    }

    private void invertir() {
        if (!(lblPantalla.getText().equals(""))) {
            InversoAditivo ia = new InversoAditivo();
            float temporal;
            ia.setInvertir(Float.valueOf(lblPantalla.getText()));
            temporal = ia.invertir(ia.getInvertir());
            lblPantalla.setText(String.valueOf(temporal));
        }
    }

    private void calcular(String operador) {
        if (!(lblPantalla.getText().equals(""))) {

            String strPantlla = lblPantalla.getText();

            if (ingresoNuevo == false) {
                this.numero = Float.valueOf(strPantlla);
                contadorOperadores++;

                if (contadorOperadores == 1) {
                    this.resultado = numero;
                } else if (contadorOperadores >= 2) {

                    Operacion calc = null;

                    switch (this.operadorAnterior) {
                        case "+":
                            calc = new Suma();
                            resultado = calc.operar(resultado, numero);
                            break;
                        case "-":
                            calc = new Resta();
                            resultado = calc.operar(resultado, numero);
                            break;
                        case "*":
                            calc = new Multiplicacion();
                            resultado = calc.operar(resultado, numero);
                            break;
                        case "/":
                            calc = new Division();
                            resultado = calc.operar(resultado, numero);
                            break;
                        case "%":
                            calc = new Porcentaje();
                            resultado = calc.operar(resultado, numero);
                            break;
                        case "1/x":
                            calc = new Reciproco();
                            resultado = calc.operar(1, numero);
                            break;
                        case "√":
                            calc = new RaizCuadrada();
                            resultado = calc.operar(1, numero);
                            break;
                        case "²":
                            if (!(lblPantalla.getText().equals(""))) {
                                Potencia p = new Potencia();
                                p.setPotenciar(Float.valueOf(lblPantalla.getText()));
                                resultado = p.potenciar(p.getPotenciar());
                                lblPantalla.setText(String.valueOf(resultado));
                            }
                            break;
                    }
                    lblPantalla.setText(String.valueOf(this.resultado));
                }
            }

            this.operadorAnterior = operador;
        }

        ingresoNuevo = true;
    }
}
