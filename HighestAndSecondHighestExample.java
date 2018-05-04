package in.varjava.example;

public class HighestAndSecondHighestExample {
	public static void main(String[] args) {
		 Integer arr[] = {12, 35, 1, 10, 34, 1};
		 findSeecondLagerValue(arr);
	}
	private static void findSeecondLagerValue(Integer[] arr) {
		if(arr.length < 2) {
			System.out.println("Invalid array size !!");
			return;
		}
		Integer higestValue =0;
		Integer secondHigestValue = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > higestValue) {
				secondHigestValue = higestValue;
				higestValue = arr[i];
			}else if(arr[i] >secondHigestValue && arr[i]!=higestValue){
				secondHigestValue = arr[i];
			}
		}
		System.out.println(" Second higest Number from arrays  :: "+secondHigestValue);
		System.out.println("  higest Number from arrays  :: "+higestValue);
	}
}
