package atvd08;

import java.util.Scanner;

public class CarrinhoDeCompras {
    private String [] sacola;
    private int tamanho;

    public void remover(String[] sacola){
         Scanner sc = new Scanner(System.in);
            int i;
            for (i = 0; i <= sacola.length-1; i++){
                System.out.println(i+1 + " " + sacola[i]);
    }

    System.out.println("Qual o indice do produto a ser removido?");
    int del = sc.nextInt();
    del -= 1;
    sacola[del] = null;
}
    public void adicionar(String[] carro){
        Scanner in = new Scanner(System.in);
        int i;
        for (i = 0; i <= carro.length-1; i++){
            if (carro[i] == null){
                System.out.println("Nome do produto: ");
                carro[i] = in.nextLine();
            }
        }
    }
        public void exibir(String[] carro){
            int i;
            for (i = 0; i <= carro.length-1; i++){
                System.out.println(i + " " + carro[i]);
            }
    }
}