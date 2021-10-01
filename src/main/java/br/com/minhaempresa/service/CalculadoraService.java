package br.com.minhaempresa.service;

public class CalculadoraService {

    public double calcular(double operandoA, double operandoB, int operacao){
        switch (operacao){
            case 0: {return somar(operandoA, operandoB);}
            case 1: {return subtrair(operandoA, operandoB);}
            case 2: {return multiplicar(operandoA, operandoB);}
            case 3: {return dividir(operandoA, operandoB);}
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
    private double dividir(double operandoA, double operandoB){
        return operandoA / operandoB;
    }

}
