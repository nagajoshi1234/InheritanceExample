package com.arrays;

import java.util.Arrays;

public class JavaIntArrayExample {

	public static void main(String[] args)
	{
		new JavaIntArrayExample();
	}

	public JavaIntArrayExample()
	{
		intArrayExample();
		stringArrayExample();
		intArrayExample2();
	}

	/**
	 * Create an int array, then populate the array, 
	 * and finally print each element in the int array.
	 */
	private void intArrayExample()
	{
		int[] intArray = new int[3];
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		System.out.println("intArray output");
		System.out.println(intArray);
		int i;
		for (i=0; i<3; i++)
		{
			System.out.println(intArray[i]);
		}
		System.out.println("value of i  "+i);

	}

	/**
	 * Create a String array, then populate the array, 
	 * and finally print each element in the int array.
	 */
	private void stringArrayExample()
	{
		String[] stringArray = new String[3];
		stringArray[0] = "a";
		stringArray[1] = "b";
		stringArray[2] = "c";
		System.out.println("stringArray output");

		for (int i=0; i<stringArray.length; i++)
		{
			System.out.println(stringArray[i]);
		}
	}

	/**
	 * Create a Java int array and populate it in one step.
	 * Then get the array length and print each element in the array.
	 */
	private void intArrayExample2()
	{
		int[] intArray = new int[] {4,5,6,7,8};
		System.out.println("intArray output (version 2)");

		for (int i=0; i<intArray.length; i++)
		{
			System.out.println(intArray[i]);
		}
	}

}

class TestArray{
	public void show() {
		int newArr[] = {12, 15, 18, 22};
		System.out.println("value at index[1] is: "+newArr[1]);
		System.out.println("value at index[2] is: "+newArr[2]);
		
		String[] schoolbag2 = { "Books", "Pens", "Pencils", "Notebooks" };
		System.out.println("The third element is: " + schoolbag2[2]);
		System.out.println("size of array: "+schoolbag2.length);

		int[] intArray = new int[3];
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		for (int i=0; i<=3; i++)
		{
			System.out.println(intArray[i]);
		}
		
		
		String[] stringArray = new String[3];
		stringArray[0] = "a";
		stringArray[1] = "b";
		stringArray[2] = "c";
		System.out.println("stringArray output");

		for (int i=0; i<stringArray.length; i++)
		{
			System.out.println(stringArray[i]);
		}
		
		int[] intArray2 = new int[] {4,5,6,7,8};
		System.out.println("intArray output (version 2)");

		for (int i=0; i<intArray2.length; i++)
		{
			System.out.println(intArray[i]);
		}
		
		
		
		

	}
}
