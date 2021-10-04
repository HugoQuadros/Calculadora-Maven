package br.com.minhaempresa.service;

import br.com.minhaempresa.domain.Operacao;

public class CalculadoraService {

    public double calcular(double operandoA, double operandoB, Operacao operacao){
        switch (operacao){
            case SOMA: {return somar(operandoA, operandoB);}
            case SUBTRACAO: {return subtrair(operandoA, operandoB);}
            case MULTIPLICACAO: {return multiplicar(operandoA, operandoB);}
            case DIVISAO: {return dividir(operandoA, operandoB);}
            default: {return 0;}
        }
    }

    private double somar(double operandoA, double operandoB){
        return operandoA + operandoB;
    }
    private double subtrair(double operandoA, double operandoB){
        return operandoA - operandoB;
    }
    private double multiplicar(double operandoA, double operandoB){
        return operandoA * operandoB;
    }
    private double dividir (double operandoA, double operandoB){
        if(operandoB == 0){
            throw new ArithmeticException();
        }
        return operandoA / operandoB;
    }

}
