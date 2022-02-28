package com.arrays;

public class NewArrayClass {
public static void main(String[] args) {
	int arr[] = {3,14,6,8,9};
	getHighestNo(arr);
}

public static void getHighestNo(int arr[]) {
	int highest = 0;
	for(int i=0; i<arr.length;i++) {
		if(arr[i]>highest)
			highest = arr[i];
		
	}
	System.out.println(highest);
}
}
