package multa;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        int  velvia, velcar, resto;
                
        System.out.println("Digite a velocidade permitida na via:");
        velvia = grava.nextInt();
        
        System.out.println("Digite a velocidade do carro:");
        velcar = grava.nextInt();
        
        
        resto = velcar - velvia;
        
        if(resto <0) {
        System.out.println("Você está na velocidade certa.");
        }
        else if(resto <=10){
            System.out.println("Você tem uma multa de R$80,00.");
        }
        else if(resto <39){
            System.out.println("Você tem uma multa de R$120,00.");
        }
        else if(resto >=40){
            System.out.println("Você tem uma multa de R$200,00.");
        }
        else;
    }
    
}
