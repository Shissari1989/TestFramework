import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class loopPractice {

	public void loop1() {

		for (int i = 7; i >= 1; i--) {

			for (int j = 1; j <= i; j++)

			{
				System.out.print("*");

			}
			System.out.println();

		}

	}

	public void loop2() {

		for (int i = 1; i <= 7; i++) {

			for (int j = 7; j >= i; j--) {

				System.out.print(i);

				for (int k = 1; k <= 7; k++) {
					System.out.print("*");
					// System.out.print(k);

				}
				System.out.println();
			}

		}

	}

	public void loop3() {

		int i, j, k;

		for (i = 1; i <= 7; i++)

		{

			for (j = 1; j <= i; j++) {
				System.out.print(j);

			}

			for (k = 6; k >= j; k--) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	public void loop4() {

		for (int i = 7; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);

			}

			System.out.println();
		}
	}

	public void loop5() {
		int i, j, k;

		for (i = 1; i <= 5; i++)

		{

			for (j = 3; j >= i; j--) {

				System.out.print(" ");
			}

			for (k = 1; k <= i; k++) {
				System.out.print(k);
				System.out.print(" ");

			}

			System.out.println();
		}
	}

	public void loop6() {

		int i, j;
		int k = 7;
		Test t = new Test();
		t.test();
		for (i = 1; i <= 7; i++) {

			for (j = 1; j <= i; j++) {

				System.out.print(j);

			}

			while (k >= j) {
				System.out.print("*");
				k--;
			}
			/*
			 * for( k=7 ; k>=j ;k-- )
			 * 
			 * { System.out.print("*"); }
			 */
			System.out.println();
		}

	}

	public void loop7() {
		int i, j, k;

		for (i = 1; i <= 5; i++) {

			for (k = i; k != 0; k--) {
				System.out.print(k);

			}

			for (j = 1; j <= i; j++) {

				System.out.print(j--);
			}

			System.out.println();
		}
	}

	public void checkPrimeno() {

		int prime = 53;
		boolean flag = true;
		int i = 2;
		int dividend = prime % i;

		while (dividend != 0) {

			i++;

			if (i == (prime / 2)) {
				System.out.println("Its a prime no");
				break;
			}

		}

		while (i <= prime / 2) {

			if (dividend == 0) {
				flag = true;
			}

		}

		System.out.println("Its not a prime number");

		/*
		 * for (int i = 2; i < prime; i++) {
		 * 
		 * 
		 * 
		 * if (dividend == 0) { flag = true;
		 * 
		 * System.out.println("Its not a prime no"); break;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * if(flag==false) { System.out.println("Is a prime number");
		 * 
		 * }
		 */

	}

	public void fibonacci() {

		int x = 0;
		int y = 0;
		int z = 1;

		for (int i = 1; i <= 20; i++)

		{

			x = y;
			y = z;
			z = x + y;
			System.out.print(z);
			System.out.print("");

		}

	}

	public void factorial() {

		int f = 5;
		int factorial = 1;
		for (int i = 1; i <= f; i++)

		{

			factorial = factorial * i;

		}
		System.out.println(factorial);
	}

	public void sortArray() {

		int[] array = { 20, 2, 3, 56, 65, 66, 8 };

		int temp;
		for (int i = 0; i < array.length; i++) {
			int minimum = array[i];

			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < minimum) {

					minimum = array[j];

					// k = j;	
					temp = array[i];
					array[i] = minimum;
					array[j] = temp;


				}
			
			}

		}

		for (int a : array) {

			System.out.println(a);
		}
	}

	
	public void Hashmap()
	{
		
		Map<String,Integer> mymap = new HashMap<String, Integer>();
		
		mymap.put("Sachin", 556016);
		mymap.put("Shiva",787909);
		
		
		
		
		
	}
	
	public void bubbleSort()
	{
		char c=6;
		int a= (int)c;
		System.out.println(a);
		
		int[] arraybubble= {20, 2, 3, 56, 65, 66, 8};
		arraybubble[2]= 11;
		
		List<Integer> alist = new ArrayList<Integer>();
		alist.add(10);
		System.out.println(alist.contains(10));

		System.out.println(alist.contains(11));
		//alist = new LinkedList<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(11);
		
		al.addAll(alist);
		System.out.println(al);
		
		
	
		
		
		
		System.out.println(Arrays.toString(arraybubble));
		/*
		 * System.out.println(Arrays.binarySearch(arraybubble, 2));
		 * 
		 * Arrays.sort(arraybubble);
		 */
		for(int z: arraybubble)
		{
			System.out.println(z);
		}
		System.out.println();
	
		
		int temp;
	
		for(int i=0;i<arraybubble.length;i++)
		{
			
			for(int j=i+1 ;j<arraybubble.length;j++)
			{
				
				if(arraybubble[i]>arraybubble[j])
				{
					temp=arraybubble[i];
					arraybubble[i]=arraybubble[j];
					arraybubble[j]=temp;
					
				}
				
				
			}
			
			
		}
		
		
		
		
	}
	
	
	
	
	public void sort() {
		int arr[] = { 10, 20, 15, 22, 35 };
		// Arrays.sort(arr);

		int key = 22;
		int res = Arrays.binarySearch(arr, key);
		if (res >= 0)
			System.out.println(key + " found at index = " + res);
		else
			System.out.println(key + " Not found");

		key = 40;
		res = Arrays.binarySearch(arr, key);
		if (res >= 0)
			System.out.println(key + " found at index = " + res);
		else
			System.out.println(key + " Not found");
	}
}