package in.varjava.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapValueForGenericWay {
	public static final <T> void swap(T[] a, int i, int j) {
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static final <T> void swap(List<T> l, int i, int j) {
		Collections.<T>swap(l, i, j);
	}

	public static void main(String... args) {
		String[] arr = { "Hello", "world" };
		swap(arr, 0, 1);
		System.out.println("Array value:" + Arrays.toString(arr));
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		swap(list, 0, 1);
		System.out.println("List value :" + list);
	}

}