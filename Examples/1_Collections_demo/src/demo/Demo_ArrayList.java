package demo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo_ArrayList {

	public static void main(String[] args) {

		ArrayList<Icecream> icecreams = new ArrayList<>();

		icecreams.add(new Icecream(1, 50, "Mango", "Candy"));
		icecreams.add(new Icecream(2, 70, "Strawberry", "Cone"));
		icecreams.add(new Icecream(3, 40, "Vanilla", "Cone"));

		Collections.sort(icecreams);

		for (Icecream ic : icecreams) {
			System.out.println(ic);
		}

		/*
		 * ArrayList<Integer> arr = new ArrayList<>(); arr.add(10); arr.add(40);
		 * arr.add(20); arr.add(60); arr.add(50);
		 * 
		 * Collections.sort(arr);
		 * 
		 * for(Integer i : arr){ System.out.println(i); }
		 */
	}

}
