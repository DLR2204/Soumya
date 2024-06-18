package collection;

import java.util.ArrayList;

//1.Can stores  homogenous/heterogenous data.

//2.collections are not fixed in size (we can change)

//3.Utility methods.

/*LIST:-

(1)It allows duplicates

(2)Insertion order is preserved*/

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("apple");

		al.add(234);

		al.add(true);

		al.add(34.4f);

		al.add('c');

		al.add("boll");

		al.add("zoo");

		al.add("ant");

		al.add("apple");

		al.add(234);

		al.add(true);

		al.add(34.4f);

		al.add('c');

		al.add("boll");

		al.add("zoo");

		al.add("ant");

		System.out.println(al);

		al.add("fish");

		al.add(1,"banana");
		
		System.out.println(al);

	}
}
