import java.util.Arrays;
import java.util.ArrayList;
class ArraysExample {
	public static void main(String[] args) {
		///////
		//Array
		///////
		String[] foods = new String[10];
		Arrays.fill(foods,"popcorn");
		System.out.print(foods);
		for (int i = 0; i<foods.length;i++) {
			System.out.println(foods[i]);
		}
		System.out.println(Arrays.toString(foods));
		
		///////////////////
		//ArrayList Example
		///////////////////
		ArrayList<String> moreFood;
		moreFood = new ArrayList<String>();
		moreFood.add("candy");
		moreFood.add("kale");
		moreFood.add("pumpkin");
		System.out.println(moreFood);
		
	}
}