package myArrayList;

public class MyArrayList {
	
	private int[] arr;
	static int ElementCount;
	int n;
	
	public MyArrayList(){
		n = 50;
		ElementCount = 0;
		arr = new int[n];
	}
	
		
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
	}
	
	
	static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;
        int mid = (low + high)/2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid -1), key);
    }
	
	
	public void removeValue(int value) {
		do {
		int pos = binarySearch(arr, 0, ElementCount-1, value);
	      
        if (pos==-1)
        {
            System.out.println("Element not found");
        }
        int i;
        for (i=pos; i<n-1; i++)
            arr[i] = arr[i+1];
        ElementCount--;
		}
		while(binarySearch(arr, 0, ElementCount-1, value) != -1);
	}
	
	public int indexOf(int value) {
		int pos = binarySearch(arr, 0, ElementCount-1, value);
	      
        if (pos==-1)
        {
            System.out.println("Error Occured: Element "+value+" not found");
            return 0;
        }
		return pos;
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