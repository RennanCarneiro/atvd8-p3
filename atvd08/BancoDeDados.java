package atvd08;

import java.util.Scanner;

public class BancoDeDados {
     //declara
        private String dados[];
        private int tam;

        //construtores

        //metodos
        public void adicionar(String[] dados){
            Scanner sc = new Scanner(System.in);
            int i;
            for (i = 0; i <= dados.length-1; i++){
                if (dados[i] == null){
                    System.out.println("Nome do produto: ");
                    dados[i] = sc.nextLine();
                }
            }
        }

        public void atualizar(String[] dados){
            Scanner sc = new Scanner(System.in);
            int i;
            for (i = 0; i <= dados.length-1; i++){
                System.out.println(i+1 + " " + dados[i]);
            }

            System.out.println("Qual o indice do produto a ser sobrescrito?");
            int del = sc.nextInt();
            del -= 1;
            System.out.println("Insira novo dado: ");
            dados[del] = sc.nextLine();
        }

        public void remover(String[] dados){
            Scanner in = new Scanner(System.in);
            int i;
            for (i = 0; i <= dados.length-1; i++){
                System.out.println(i+1 + " " + dados[i]);
            }

            System.out.println("Qual o indice do produto a ser removido?");
            int del = in.nextInt();
            del -= 1;
            dados[del] = null;
        }
    }//class end
