/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

/**
 *
 * @author Estudiante
 */
public class Triangulo extends Figura_Geometrica {

    private Double altura;
    private Double base;
    private Double ladoA;
    private Double ladoB;
    private Double ladoC;

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public void setLadoA(Double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(Double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(Double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public Double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public Double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

}
