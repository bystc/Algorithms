package binarysearch;

import java.lang.*;
import java.util.*;


public class BinarySearch {
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
	
	public static void main(String[] args){
		
		Scanner a=new Scanner(System.in);
		int [] whitelist=new int[10];
		int i=0;
		while(a.hasNextInt()){
			whitelist[i]=a.nextInt();
			i++;
		}
		Scanner in=new Scanner(System.in);
		Arrays.sort(whitelist);
		while(in.hasNextInt()){
			int key=in.nextInt();
			if(rank(key,whitelist)<0)
				System.out.println(key);
		}
	
	}
}
