package atvd08;

import java.util.Scanner;

public class Carro {
    private String marca;
    private String modelo;
    private String anoFabricacao;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, String anoFabricacao, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidadeAtual = 0;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getAnoFabricacao() {
        return anoFabricacao;
    }
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    public void desacelerar(int velocidade){
        velocidadeAtual -= velocidade;
        if(velocidade < 0){
            velocidadeAtual = 0; 
        }
    }
        public void acelerar(int velocidade){
            if(velocidade >= 0)
            velocidadeAtual += velocidade;
        }
    }


