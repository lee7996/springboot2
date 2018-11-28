package pw.javbus.demo;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr={6,3,8,2,9,1};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					arr[j] = arr[j]^arr[j+1];
					arr[j+1] = arr[j]^arr[j+1];
					arr[j] = arr[j]^arr[j+1];
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
