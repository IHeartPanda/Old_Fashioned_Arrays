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

	void set(int i, String string) {
		list[i] = (T)string;
	}

	public void addAt(int i, T c) {
		System.out.println(list.length);
		T[] addat = (T[]) new Object[list.length + 1];
		for (int j = 0; j < i; j++) {
			addat[j] = list[j];
		}
		addat[i] = c;
		for (int j = i+1; j < list.length+1; j++) {
			addat[j] = list[j-1];
		}
		list = addat;
	}

	public void remove(int i) {
		T[]remov = (T[]) new Object[list.length-1];
		for (int j = 0; j < i; j++) {
			remov[j] = list[j];
		}
		for (int j = i; j < list.length; j++) {
			remov[j] = list[j+1];
		}
		list = remov;
	}
}
