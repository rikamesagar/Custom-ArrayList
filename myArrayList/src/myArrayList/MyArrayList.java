package myArrayList;

import java.util.Arrays;

public class MyArrayList {
	
	int  i = 0;
	int n = 50;
	static int ElementCount = 0;
	private int[] arr = new int[n];
	
	public void insertSorted(int newValue) {
		//if(ElementCount > n) {
		//	n = n*(2);
//		int i = 0;
//		arr[i] = newValue;
//		if(arr.length > 0) {
//			if(arr[ElementCount-1] >= newValue) {
//				arr[ElementCount] = newValue;
//			}
//			else if() {
//				
//			}
//			
//		}
//	      for(int i=0;i<ElementCount;i++){
//	        if(arr[i]>newValue)
//	          break;
//	      }
//	      for(int k=ElementCount-2; k>=i; k--){
//	        arr[k+1]=arr[k];            
//	      }
//	      arr[i]=newValue;
//	     System.out.println(Arrays.toString(arr));
		
		 int i;
	        for (i=ElementCount-1; (i >= 0 && arr[i] > newValue); i--)
	           arr[i+1] = arr[i];
	      
	        arr[i+1] = newValue;
	
		ElementCount++;
	}
	

	public void displayArr() {
		for(int j =0 ; j < ElementCount ; j++)
			System.out.println(arr[j]);
	}
	
	
	public void removeValue(int value) {
		
	}
	
	public int indexOf(int value) {
	
		return 1;
	}
	
	public int size() {
		return 1;
	}
	
	public int sum() {	
		return 1;
	}
}