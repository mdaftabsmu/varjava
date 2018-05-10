package in.varjava.example;

public class StringSwapValue {
	public static void main(String[] args) {
		swapValue("a","world");
		
	}
	private static void swapValue(String firstValue,String secondValue) {
		firstValue = firstValue+secondValue;
		System.out.println(" Full value :: "+firstValue);
		secondValue=firstValue.substring(0, firstValue.length()-secondValue.length());
		System.out.println(" Second value :: "+secondValue);
		firstValue=firstValue.substring(secondValue.length());
		System.out.println(" first value := "+firstValue);
	}
}
