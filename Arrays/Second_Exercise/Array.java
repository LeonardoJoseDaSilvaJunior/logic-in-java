package Second_Exercise;
//Portuguese

/*Declare um vetor de 10 posições e o preencha com os
10 primeiros números impares e o escreva.*/

//English

/*Declare an array of 10 positions and fill it with the
First 10 odd numbers and write it.*/

public class Array {
	
	public static void main(String[] args) {
		int array[] = new int[10];
		int position = 0;
		
		for(int i = 0; i <=23; i++) {
			if (i%2 !=0) {
				System.out.println(array[position] = i);
			}	
		}
	}
}
