package myArrayList;

public class MyArrayList {
	
	int n = 50;
	static int ElementCount = 0;
	private int[] arr = new int[n];
	
	public void insertSorted(int newValue) {
		if(ElementCount > n) {
			n = (int) (n * 1.5);
			int [] arrTemp = new int[n];
			for (int i=0; i<ElementCount-1; i++) {
	            arrTemp[i] = arr[i];
			}
			arr = arrTemp;
		}

		int i;
		if(ElementCount > 0 && ElementCount < n) {
			for (i=ElementCount-1; (i >= 0 && arr[i] > newValue); i--)
		    	arr[i+1] = arr[i];
		    arr[i+1] = newValue;
		}
		else {
			i=0;
			arr[i] = newValue;
		}
		ElementCount++;
	}

	public void displayArr() {
		for(int j =0 ; j < ElementCount ; j++)
			System.out.println(arr[j]);
//		n = (int) (n * 2);
//		int [] arrTemp = new int[n];
//		arr = arrTemp;
//		System.out.println(arr.length);
	}
	
	
	public void removeValue(int value) {
		
	}
	
	public int indexOf(int value) {
	
		return 1;
	}
	
	public int size() {
		return ElementCount;
	}
	
	public int sum() {
		int sum = 0;
		for(int k = 0; k < ElementCount; k++)
			sum = sum + arr[k]; 
		return sum;
	}
}