package Lec34;

import java.util.ArrayList;

public class HashMap<K, V> {
	private class Node {
		K key;
		V value;
		Node next;

		public Node(K key, V value) {
			// TODO Auto-generated constructor stub
			this.key = key;
			this.value = value;
		}

	}

	private ArrayList<Node> bucket;
	private int size = 0;

	public HashMap(int cap) {
		// TODO Auto-generated constructor stub
		bucket = new ArrayList<>();
		for (int i = 0; i < cap; i++) {
			bucket.add(null);
		}

	}

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public void put(K key, V value) {
		int bn = hashfunction(key);
		Node node = bucket.get(bn);
		while (node != null) {
			if (node.key.equals(key)) {
				node.value = value;
				return;
			}
			node = node.next;
		}
		size++;
		Node temp = new Node(key, value);
		node = bucket.get(bn);
		temp.next = node;
		bucket.set(bn, temp);
		double loadfactor = size / bucket.size();
		double th = 2;
		if (loadfactor > th) {
			ReHash();
		}

	}

	private int hashfunction(K key) {
		return key.hashCode() % bucket.size();
	}

	private void ReHash() {
		// TODO Auto-generated method stub
		ArrayList<Node> oba = this.bucket;
		ArrayList<Node> nba = new ArrayList<>();
		for (int i = 0; i < 2 * this.bucket.size(); i++) {
			nba.add(null);
		}
		this.bucket = nba;
		size = 0;
		for (Node node : oba) {
			while (node != null) {
				put(node.key, node.value);
				node = node.next;
			}
		}

	}

	public V get(K key) {
		int bn = hashfunction(key);
		Node node = bucket.get(bn);
		while (node != null) {
			if (node.key.equals(key)) {
				return node.value;
			}
			node = node.next;
		}
		return null;

	}

	public boolean containsKey(K key) {
		int bn = hashfunction(key);
		Node node = bucket.get(bn);
		while (node != null) {
			if (node.key.equals(key)) {
				return true;
			}
			node = node.next;
		}
		return false;
	}

	public V remove(K key) {
		int bn = hashfunction(key);
		Node node = bucket.get(bn);
		Node prev = null;
		while (node != null) {
			if (node.key.equals(key)) {
				break;
			}
			prev = node;
			node = node.next;

		}
		if (node == null) {
			return null;
		}
		V rv = node.value;
		if (prev == null) {
			bucket.set(bn, node.next);
		} else {
			prev.next = node.next;
		}
		size--;
		return rv;

	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {

		String str = "";
		str += "{";
		for (Node node : this.bucket) {
			while (node != null) {
				str += node.key + "->" + node.value + ", ";
				node = node.next;
			}

		}
		str += "}";
		return str;

	}
}