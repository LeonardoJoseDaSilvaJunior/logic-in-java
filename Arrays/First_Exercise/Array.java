package First_Exercise;
//PORTUGUESE

/*Leia um vetor de 12 posições e em seguida 
ler também dois valores X e Y quaisquer correspondentes a 
duas posições no vetor. Ao final seu programa deverá escrever a 
soma dos valores encontrados nas respectivas posições X e Y.*/

//ENGLISH

/*Read an array of 12 positions and then
also read any two X and Y values ​​corresponding to
two positions in the vector. At the end your program should write the
sum of the values ​​found in the respective X and Y positions.*/

public class Array {
	
	public static void main(String[] args) {
		int array[] = new int[12];
		int x =1,y =2;
		array[2] = x;
		array[8] = y;
		System.out.println (array[2]+ array[8]);
	}
}
