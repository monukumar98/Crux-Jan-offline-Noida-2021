package Lec35;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class K_SorttedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			list.add(new ArrayList<>());
		}
		list.get(0).add(2);
		list.get(0).add(3);
		list.get(0).add(5);
		list.get(0).add(7);
		list.get(1).add(4);
		list.get(1).add(6);
		list.get(1).add(8);
		list.get(1).add(9);
        list.get(2).add(1);
		list.get(2).add(12);
		list.get(2).add(13);
		list.get(3).add(10);
		list.get(3).add(11);
		list.get(3).add(14);
		System.out.println(list);
		System.out.println(MergeKSortedList2(list));

	}

	public static class Pair implements Comparable<Pair>  {
		int val;
		int listno;
		int idx;
		public Pair(int val, int listno, int idx) {
			// TODO Auto-generated constructor stub
			this.idx=idx;
			this.val=val;
			this.listno=listno;
		}
		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return o.val-this.val;
		}

	}

	public static ArrayList<Integer> MergeKSortedList(ArrayList<ArrayList<Integer>> list) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		PriorityQueue<Pair> pq = new PriorityQueue<>( new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				// TODO Auto-generated method stub
				return o1.val-o2.val;
			}
		});
		for(int  i=0; i<list.size(); i++) {
			Pair p = new Pair(list.get(i).get(0),i,0);
			pq.add(p);
			
		}
		while(!pq.isEmpty()) {
			Pair rp = pq.remove();
			ans.add(rp.val);
			rp.idx++;
			if(rp.idx<list.get(rp.listno).size()) {
				rp.val=list.get(rp.listno).get(rp.idx);
				pq.add(rp);
			}
			
		}
		return ans;
	}
	public static ArrayList<Integer> MergeKSortedList2(ArrayList<ArrayList<Integer>> list) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Generic_Heap<Pair> pq = new Generic_Heap<>();
		for(int  i=0; i<list.size(); i++) {
			Pair p = new Pair(list.get(i).get(0),i,0);
			pq.add(p);
			
		}
		while(!pq.isEmpty()) {
			Pair rp = pq.remove();
			ans.add(rp.val);
			rp.idx++;
			if(rp.idx<list.get(rp.listno).size()) {
				rp.val=list.get(rp.listno).get(rp.idx);
				pq.add(rp);
			}
			
		}
		return ans;
	}

}
