package listaexercicios.ProgramaCalculadora;
import java.util.Scanner;

public class CalculadoraMain {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        
        System.out.printf("Informe um numero: ");
        int num1 = teclado.nextInt();
        
        System.out.printf("Informe um segundo numero: ");
        int num2 = teclado.nextInt();
        int opcao;
        do{
            System.out.println("ESCOLHA UMA OPERACAO PARA A CALCULADORA");
            System.out.println("-----------------------------------------");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRACAO");
            System.out.println("3 - MULTIPLICACAO");
            System.out.println("4 - DIVISAO");
            System.out.println("5 - SAIR");
            System.out.println("-----------------------------------------");
            System.out.println("ESCOLHA: ");
            opcao = teclado.nextInt();
            switch (opcao){
                case 1:               
                    System.out.println("Resultado: " +  calc.soma(num1 , num2));
                    break;

                case 2:
                    System.out.println("Resultado: " +  calc.subtracao(num1 , num2));
                    break;

                case 3:
                    System.out.println("Resultado: " +  calc.multiplicacao(num1 , num2));
                    break;

                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + calc.divisao(num1, num2));
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida!");
                    }
                    break;
            
                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                    
                    
            }
        
        }while (opcao != 5);
        teclado.close();
    }
    
}
