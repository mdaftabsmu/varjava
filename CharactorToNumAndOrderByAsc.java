package in.varjava.example;

import java.util.Arrays;

public class CharactorToNumAndOrderByAsc {
	public static void main(String[] args) {
		sortData("Java");
	}
	private static void sortData(String data) {
		char[] ch = data.toCharArray();
		for(int i =0;i<ch.length;i++) {
			System.out.println(ch[i]+" ::: "+(int)ch[i]);
		}
		
		Arrays.sort(ch);
		System.out.print(" After ascending value :: \t");
		for(int i =0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	}
	
	private static void swapData() {
		
	}
}
