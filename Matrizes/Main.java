/*

Faça um programa que peça ao usuário para
informar as dimensões de duas matrizes e depois
fazer o input dos dados de cada uma delas. O
programa deverá exibir uma terceira matriz com o
resultado do produto das outras duas.

*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int linha_Primeira_Matriz;
		int coluna_Primeira_Matriz;
		int linha_Segunda_Matriz;
		int coluna_Segunda_Matriz;
		double numero;
		int Linha = 0;
		int Coluna = 0;
		
		
		System.out.print("Insira a primeira dimensão da primeira matriz: ");
		linha_Primeira_Matriz = input.nextInt();
		System.out.print("Insira a segunda dimensão da primeira matriz: ");
		coluna_Primeira_Matriz = input.nextInt();
		System.out.print("Insira a primeira dimensão da segunda matriz: ");
		linha_Segunda_Matriz = input.nextInt();
		System.out.print("Insira a segunda dimensão da segunda matriz: ");
		coluna_Segunda_Matriz = input.nextInt();
		
		Double primeira_Matriz [][] = new Double [linha_Primeira_Matriz][coluna_Primeira_Matriz];
		Double segunda_Matriz  [][] = new Double [linha_Segunda_Matriz] [coluna_Segunda_Matriz];
		
		for (int linha = 0 ; linha< linha_Primeira_Matriz; linha++){
		    for (int coluna = 0;coluna< coluna_Primeira_Matriz; coluna++){
		         System.out.printf("Insira o número presente na linha %d e coluna %d da Primeira Matriz: ",linha+1,coluna+1);
		         
		         numero = input.nextDouble();
		         primeira_Matriz [linha] [coluna] = numero;
		    }
		}
		for (int linha = 0 ; linha< linha_Segunda_Matriz; linha++){
		    for (int coluna = 0;coluna< coluna_Segunda_Matriz; coluna++){
		         System.out.printf("Insira o número presente na linha %d e coluna %d da segunda Matriz : ",linha+1,coluna+1);
		         
		         numero = input.nextDouble();
		         segunda_Matriz [linha] [coluna] = numero;
		    }
		}
		
		for(int i = 0; i < linha_Primeira_Matriz; i++){
		    for(int j = 0; j < coluna_Primeira_Matriz; j++){
		        System.out.print(primeira_Matriz [i] [j] + " ");
		    }
		    System.out.println();
		}
		for(int i = 0; i < linha_Segunda_Matriz; i++){
		    for(int j = 0; j < coluna_Segunda_Matriz; j++){
		        System.out.print(segunda_Matriz [i] [j] + " ");
		    }
		    System.out.println();
		}
		System.out.println("\n TERCEIRA MATRIZ \n");
		
    	if (coluna_Primeira_Matriz == linha_Segunda_Matriz) {
            double[][] terceira_Matriz = new double[linha_Primeira_Matriz][coluna_Segunda_Matriz];
            for (int i = 0; i < linha_Primeira_Matriz; i++) {
                for (int j = 0; j < coluna_Segunda_Matriz; j++) {
                    double soma = 0;
                    for (int k = 0; k < coluna_Primeira_Matriz; k++) {
                        soma += primeira_Matriz[i][k] * segunda_Matriz[k][j];
                    }
                    terceira_Matriz[i][j] = soma;
                }
            }
        
            for (int i = 0; i < linha_Primeira_Matriz; i++) {
                for (int j = 0; j < coluna_Segunda_Matriz; j++) {
                    System.out.print(terceira_Matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
             System.out.print("Não é possível fazer a multiplicação");
       }
    	
	}
}
