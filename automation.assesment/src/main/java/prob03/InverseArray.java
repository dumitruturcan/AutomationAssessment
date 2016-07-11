package prob03;

public class InverseArray {

	public static Object inverseArray(Object[] array) {

		Object left;
		Object right;
		
		for (int i = 0; i < array.length / 2; i++) {
			
			left = array[i];
			right = array[array.length-i-1];
			
			array[i] = right;
			array[array.length-i-1]=left;
		}
		
		return array;
	}

}
