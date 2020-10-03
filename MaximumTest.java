// Version UC5

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class MaximumTest<T extends Comparable<T>> {

	List<T> list = new ArrayList<>();

	public MaximumTest(T... parameters) {
		for (T t : parameters)
			this.list.add(t);
	}

	public T maximum() {
		printMax();
		return MaximumTest.maximum(list);
	}

	public static <T extends Comparable<T>> T maximum(List<T> list) {
		try {
			return Collections.max(list);
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	public void printMax() {
		System.out.println("Maximum of " + list + " => " + MaximumTest.maximum(list));
	}

}