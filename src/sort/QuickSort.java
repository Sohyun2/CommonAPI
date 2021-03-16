package sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] {5, 3, 8, 4, 9, 1, 6, 2, 7};
		
		int pivot = arr[0];
		int low = -1;
		int high = -1;
		int tmp = 0;
		
		// 1회전
		for(int i=1; i<arr.length; i++) {			
			if(i > arr.length-i) {
				tmp = pivot;
				arr[0] = arr[arr.length-i];
				arr[arr.length-i] = tmp;
				break;
			}
			low = arr[i];
			high = arr[arr.length-i];
			
			if(low > high) {
				tmp = arr[i];
				arr[i] = arr[arr.length-i];
				arr[arr.length-i] = tmp;
			}

		}
		for(int j=0; j<arr.length-1; j++) {
			if(j != arr.length-1) System.out.print(arr[j] + ", ");
			else System.out.print(arr[j]);
		}
		System.out.println();
	}
	
	public void sort() {
		
	}

}