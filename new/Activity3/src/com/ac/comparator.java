package com.ac;
import java.util.*;

public class comparator {

	public static void main(String[] args)
	{
		ArrayList<Integer> i=new ArrayList<Integer>();
		i.add(34);
		i.add(45);
		i.add(55);
		i.add(65);
		i.add(75);
		System.out.println(i);
		Comparator<Integer> c=(t1,t2)->(t1>t2)?-1:(t1<t2)?+1:0;
		Collections.sort(i,c);
		System.out.println(i);
		
		
	}

}
