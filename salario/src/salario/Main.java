package salario;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
       Scanner grava = new Scanner(System.in);
         
        double salario,transp,ref,rend,imposto;
                
        System.out.println("Digite o valor do seu salario:");
        salario = grava.nextDouble();
        
        transp = salario * 0.02;
        salario = salario - transp;
        
        ref = salario * 0.06;
        salario = salario - ref;
        
        rend = salario * 0.07;
        salario = salario - rend;
        
               
        if (salario > 1200){
            
        imposto = salario * 0.15;
        salario = salario - imposto;
        System.out.println("Você foi taxado em R$" + imposto );
        }
        
        System.out.println("foi descontado do vale-transport " + transp );
        System.out.println("foi descontado do vale-refeição " + ref );
        System.out.println("foi descontado do imposto de renda " + rend );
        System.out.println("Seu salario liquido é de " + salario );
}           
}
