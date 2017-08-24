/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.investir;

/**
 *
 * @author aluno
 */
public class Contamaster {

    /**
     * @return the SaldoInvestimento
     */
    public float getSaldoInvestimento() {
        return SaldoInvestimento;
    }

    /**
     * @param SaldoInvestimento the SaldoInvestimento to set
     */
    public void setSaldoInvestimento(float SaldoInvestimento) {
        this.SaldoInvestimento = SaldoInvestimento;
    }

    /**
     * @return the limiteExtra
     */
    public float getLimiteExtra() {
        return limiteExtra;
    }

    /**
     * @param limiteExtra the limiteExtra to set
     */
    public void setLimiteExtra(float limiteExtra) {
        this.limiteExtra = limiteExtra;
    }
    public Contamaster () {}
        
        private float SaldoInvestimento;
        private float limiteExtra;
    }

