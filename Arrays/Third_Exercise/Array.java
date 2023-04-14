package Third_Exercise;

public class Array {
	public static void main(String[] args) {
		int array[] = new int [16];
		
		int last = 8;
		int a,b;
		for(int i = 0; i < array.length;i++) {
			array[i] = i;
		}
		for(int i = 0; i< 8;i++) {
			
			a = array[i];
			b = array[last];
			array[i] =b;
			array[last] = a;
			last++;
		}
		for(int i = 0; i< array.length;i++) {
			System.out.println(array[i]);
		}

	}

}
