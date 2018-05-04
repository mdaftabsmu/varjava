package in.varjava.example;

public class SamllestAndSecondSmallestNumberExample {
	public static void main(String[] args) {
		Integer arr[] = {12, 35, 1, 10, 34, 1};
		findSmallestAndSecondSmallest(arr);
	}
	private static void findSmallestAndSecondSmallest(Integer[] arr) {
		if(arr.length < 2) {
			System.out.println("Invalid array value !!");
			return;
		}
		Integer smallestValue = 0;
		Integer secondSmallestValue = 0;
		smallestValue = secondSmallestValue = Integer.MAX_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] < smallestValue) {
				secondSmallestValue = smallestValue;
				smallestValue = arr[i];
			}else if(arr[i]<secondSmallestValue && arr[i]!=smallestValue) {
				secondSmallestValue = arr[i];
			}
		}
		System.out.println(" Second smallest Number from arrays  :: "+secondSmallestValue);
		System.out.println("  Smallest Number from arrays  :: "+smallestValue);
	}
}
