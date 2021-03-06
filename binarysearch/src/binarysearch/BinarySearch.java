package binarysearch;

import java.lang.*;
import java.util.*;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;


public class BinarySearch<T extends Comparable<T>> {
//
//	private T a[];
//	private int N;// 鍏冪礌涓暟
//
//	public BinarySearch(int N) {
//		a = (T[]) new Comparable[N];
//	}
///*
//	public int rank(T item) {
//		int lo = 0, hi = N - 1;
//		while (lo <= hi) {
//			int mid = lo + (hi - lo) / 2;
//			int cmp = item.compareTo(a[mid]);
//			if (cmp > 0)
//				lo = mid + 1;//娉ㄦ剰杩欓噷,鏈�鍚庝竴娆℃瘮杈冨悗锛宭o绛変簬姣攊tem灏忕殑鏈�澶у厓绱犵殑涓嬫爣+1
//			else if (cmp < 0)
//				hi = mid - 1;
//			else
//				return mid;
//		}
//		return lo;
//	}
//*/
//	public void put(T item) {
//		int i = rank(item);// 濡傛灉鏈懡涓紝鍒檌绛変簬姣攊tem灏忕殑鏈�澶у厓绱犵殑index+1
//		for (int j = N; j > i; j--) {
//			a[j] = a[j - 1];// 鍏冪礌鍚庣Щ
//		}
//		a[i] = item;
//		N++;
//	}
//
//	public void print() {
//		for (int i = 0; i < N; i++) {
//			System.out.print(a[i] + " ");
//		}
//	}

	public static void main(String[] args) {
		/*
		BinarySearch<Integer> b = new BinarySearch<>(10);
		b.put(1);
		b.put(3);
		b.put(3);
		b.put(3);
		b.put(2);
		b.put(0);
		b.put(5);
		b.put(4);
		b.print();// 0 1 2 3 3 3 4 5
		*/
		
		int [] whitelist=In.readInts(args[0]);
		Arrays.sort(whitelist);
		while(!StdIn.isEmpty()){
			int key=StdIn.readInt();
			if(rank(key,whitelist)<0)
				System.out.println(key);
		}
	}

	public static int rank(int key,int[] a){
		int lo=0;
		int hi=a.length-1;
		while(lo<=hi){
			int mid=lo+(hi-lo)/2;
			if (key<a[mid]) hi=mid-1;
			else if(key>a[mid])lo=mid+1;
			else return mid;
		}
		return -1;
	}
}