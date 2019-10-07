import java.util.ArrayList;

//import sun.jvm.hotspot.utilities.IntArray;

//import com.sun.tools.javac.code.Attribute.Array;

class newLoops extends Loops {

	static void copy() {
		System.out.println("In Child class");

	}

	void new1() {
		System.out.println("Without static in child class");
	}

}

public class Loops {

	static String staticVariable = "Static varaible";

	String nonstaticVariable = "Non-Static variable";

	final int zx = 10;

	static int n = 10;

	void new1() {
		staticVariable = "test";
		System.out.println(staticVariable);
		System.out.println(n);
		System.out.println("Without static in parent class");
	}

	static void copy() {
		System.out.println("test" + staticVariable);
		/*
		 * System.out.println(n); System.out.println("In parent class");
		 */

	}

	static int x = 1;
	int z1;

	public void pyramid() {

		for (int i = 1; i <= 5; i++) {
//System.out.println(i);	
//System.out.println();

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

	public static void main(String args[])

	{

		// copy();

		n = 20;
		// System.out.println(n);
		loopPractice l1 = new loopPractice();
		l1.bubbleSort();
	}
		/*
		 * Loops l = new newLoops(); l1.n=45; //l1.new1(); l1.copy();
		 */
		// l.new1();
		// l.copy();

		/*ArrayList<Loops> oList = new ArrayList<Loops>();

		Loops[] oolist = new Loops[8];

		
		 * final int il =10; il= il+10; System.out.println(il);
		 
		
		 * for(Loops l: oolist) { l=new Loops();
		 * 
		 * }
		 

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(0, 400);
		System.out.println(list.size());

		if (list.contains(60)) {

			System.out.println("it contains");
		}

		for (Integer x : list)

		{
			System.out.println(x);

		}

		int[] a = { 9, 2, 10, 5, 4, 19 };
		int temp;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j + 1] < a[j]) {
					int temp1 = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp1;
				}
			}
		}

		for (int x = 0; x < a.length; x++) {

			System.out.println(a[x]);

		}
		
		 * for(int i=0; i<bubble.length; i++) {
		 * 
		 * for(int j =i+1; j<i+2; j++) { if(bubble[i]>bubble[j]) { temp=bubble[j];
		 * bubble[j]=bubble[i]; bubble[i]=temp;
		 * 
		 * 
		 * }
		 * 
		 * } for(int x=0; x<bubble.length; x++) {
		 * 
		 * System.out.println(bubble[x]);
		 * 
		 * }
		 * 
		 * 
		 * }
		 

		int[] small = { 8, 90, 35, 2, 19 };

		for (int i = 0; i < small.length; i++) {

			for (int j = i + 1; j < small.length; j++) {
				int temp1;

				if (small[j] < small[i]) {

					temp1 = small[i];
					small[i] = small[j];
					small[j] = temp1;

				}

			}

		}

		for (int x = 0; x < small.length; x++) {

			System.out.println(small[x]);

		}

		int search = 35;

		int left = 0;
		int right = small.length - 1;
		int middle = (left + right) / 2;

	}
*/
	/*
	 * System.out.println(i); System.out.println(small[i]);
	 */

	// System.out.println(min + "and " + small[0]+ "and" + small[3]);

	/*
	 * 
	 * 
	 * 
	 * int[] a = {2,5,6,9,13,14};
	 * 
	 * int target =9;
	 * 
	 * for(int i=0; i<a.length; i++) {
	 * 
	 * if(a[i]==target)
	 * 
	 * { //System.out.println(a[i] +"number ia at " + i + "index");
	 * 
	 * } else {} }
	 * 
	 * int[] b ={2,5,6,9,13,14};
	 * 
	 * int target1 =5;
	 * 
	 * int left=0; int right = b.length -1; int middle = (left + right)/2;
	 * //System.out.println("right index value is " + right);
	 * 
	 * while (left <= right) { System.out.println(middle); //int middle = (left +
	 * right)/2;
	 * 
	 * if (b[middle] == target1) { System.out.println(middle); //
	 * System.out.println("Element found at index " + middle); break; } else if
	 * (b[middle] < target1) {
	 * 
	 * left = middle + 1; System.out.println("left index" + left); } else if
	 * (b[middle] > target1) { right = middle - 1; System.out.println("right index"
	 * + right);
	 * 
	 * }
	 * 
	 * 
	 * } System.out.println("left value is " +left);
	 * System.out.println("right value is " + right); //
	 * System.out.println("middle value is" + middle);
	 */
	/*
	 * int middle =(a.length )/2; System.out.println(middle);
	 */

//		
//		int[] a = { 3, 34, 5,91, 100}; // an array not containing duplicates
//		int target = 91; // the element to be searched
//		/*
//		 * for( int i=0; i<a.length; i++) { if(a[i]==target) { System.out.println (
//		 * "Element found at index "+i); break; // break should be omitted if the array
//		 * contains duplicates } }
//		 */
//		
//		for(int y: a)
//		{
//			 if(a[y]==target) {
//			        System.out.println ( "Element found at index "+y);
//			        break; // break should be omitted if the array contains duplicates
//			    }
//			
//		}

	// int[] intArray= new int[5];
	/*
	 * int[] intArray = { 2, 3, 4, 5, 6 }; for (int x : intArray) {
	 * System.out.println(x);
	 * 
	 * }
	 */
	// display(intArray);

	/*
	 * int count =0;
	 * 
	 * 
	 * 
	 * String duplicate = "testingdata";
	 * 
	 * String[] stArray; stArray = new String[1];
	 * 
	 * 
	 * char[] dup=duplicate.toCharArray();
	 * 
	 * //System.out.println(dup.length);
	 * 
	 * char a=dup[0];
	 * 
	 * for(int i=0; i< dup.length; i++)
	 * 
	 * { for(int j= i +1 ; j<dup.length; j++)
	 * 
	 * {
	 * 
	 * if(dup[i]==dup[j]) { System.out.println("duplicate value " + dup[i]);
	 * 
	 * count++;
	 * 
	 * 
	 * }
	 * 
	 * else {
	 * 
	 * System.out.println(dup[i]); System.out.println(dup[j]);
	 * 
	 * } } System.out.println(dup[i]);
	 * 
	 * System.out.println(count);
	 * 
	 * }
	 */
	/*
	 * 
	 * int[] maxValue = { 2, 3, 4, 6, 5 }; int max =maxValue[0];
	 * 
	 * for(int i=0; i< maxValue.length ; i++) {
	 * 
	 * if(maxValue[i]>max) {
	 * 
	 * max= maxValue[i]; }
	 * 
	 * 
	 * } System.out.println("Max is" + max);
	 */

	/*
	 * int i=10; String s ="apple"; String f="test"; switch (i) { case 1:
	 * System.out.println("i is zero."); break; case 2:
	 * System.out.println("i is one."); break; case 3:
	 * System.out.println("i is two."); break;
	 * 
	 * default: System.out.println("i is greater than 2."); }
	 * 
	 * Loops whiles = new Loops(); whiles.whileLoop();
	 * 
	 * Loops fors = new Loops(); //fors.forLoop();
	 * 
	 * fors.count();
	 */

	public void count()

	{
		if (z1 == 0) {

		}

		String text = "Ssachinn";
		char[] arr = text.toCharArray();

		System.out.println("in array" + arr[0]);
		int x = 1;
		while (x > 2) {

			System.out.println("in while");

		}

		System.out.println("out of while loop");
		// System.out.println(text.length());
		String newText = text.toLowerCase();
		int newtextlength = text.length();
		int j;
		for (int i = 0; i < newtextlength; i++) {
			for (j = 0; j < newtextlength - 1; j++) {
				System.out.println(arr[j]);

			}
			if (arr[i] == arr[j])

			{
				System.out.println("match");
			}
			System.out.println("in test" + arr[i]);
		}

	}

	public void whileLoop() {

		while (x <= 4)

		{
			x++;

			System.out.println("x value is   " + x);
		}

		System.out.println(x);

		System.out.println("out of loop");

	}

	public static void forLoop()

	{
		int i = 5;
		for (i = 1; i <= 9; i++) {

			System.out.println("i value is  " + i);

		}

		System.out.println(i);
		System.out.println("Out of for loop");
	}

	static void arrayMethod(int[] arraynew1) {

	}

	public static void display(int[] test) {
		System.out.println(test[1]);

	}
}
