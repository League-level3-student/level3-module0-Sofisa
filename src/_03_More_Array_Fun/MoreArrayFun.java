package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class MoreArrayFun {
	

	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun morearrayfun = new MoreArrayFun();
		morearrayfun.PrintStrings();
		morearrayfun.ReverseStrings();
		morearrayfun.EveryOtherString();
		morearrayfun.RandomString();

	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	void PrintStrings() {
		String[] words = new String[4];
		words[0] = "dog";
		words[1] = "cat";
		words[2] = "turtle";
		words[3] = "bird";
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);

		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	void ReverseStrings() {
		String[] words = new String[4];
		words[0] = "dog";
		words[1] = "cat";
		words[2] = "turtle";
		words[3] = "bird";
		for (int j = 3; j >= 0; j--) {
			System.out.println(words[j]);
		}

	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	static void EveryOtherString() {
		String[] words = new String[4];
		words[0] = "dog";
		words[1] = "cat";
		words[2] = "turtle";
		words[3] = "bird";
		for (int t = 0; t < words.length; t++) {
			if (t % 2 == 0) {
				System.out.println(words[t]);
			}

		}

	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	
	static void RandomString() {
		String[] words = new String[4];
		words[0] = "dog";
		words[1] = "cat";
		words[2] = "turtle";
		words[3] = "bird";
		Random randy = new Random();
		ArrayList<String> names = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			names.add(words[i]);

		}
		while (names.size() > 0) {
			System.out.println(names.remove(randy.nextInt(names.size())));
			
		}

	}
}
