package _02_diy_array_list;

public class ArrayList<T> {
	T[] list;

	public ArrayList() {
		list = (T[]) new Object[0];

	}

	void add(T num) {
		T[] adding = (T[]) new Object[list.length + 1];
		adding[list.length] = num;
		for (int i = 0; i < list.length; i++) {
			adding[i] = list[i];
		}
		list = adding;

	}

	T get(int imp) {
		return list[imp];

	}
}
