package Lec35;

import java.util.ArrayList;

public class Generic_Heap <T extends Comparable<T>>{
	private ArrayList<T> list = new ArrayList<>();

	public int size() {
		return this.list.size();
	}

	public boolean isEmpty() {
		return this.list.size() == 0;
	}

	public void add(T item) {
		this.list.add(item);
		upheapify(this.list.size() - 1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if ( isLarger(this.list.get(ci) , this.list.get(pi))>0) {
			swap(ci, pi);
			upheapify(pi);
		}

	}

	public void swap(int i, int j) {
		T ith = list.get(i);
		T jth = list.get(j);
		list.set(i, jth);
		list.set(j, ith);

	}

	public T remove() {
		T rd = this.list.get(0);
		swap(0, this.list.size() - 1);
		this.list.remove(this.size() - 1);
		downheapify(0);
		return rd;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < this.list.size() &&  isLarger(this.list.get(lci) , this.list.get(mini))>0) {
			mini = lci;
		}
		if (rci < this.list.size() &&isLarger(this.list.get(rci) , this.list.get(mini))>0) {
			mini = rci;
		}
		if (mini != pi) {
			swap(pi, mini);
			downheapify(mini);
		}
	}

	public T get() {
		return this.list.get(0);
	}

	public void display() {
		System.out.println(list);
	}
	public int isLarger(T t , T o) {
		return t.compareTo(o); // +ve t Priority 
		
	}
}
