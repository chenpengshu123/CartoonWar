package com.neuedu.test;

import java.util.ArrayList;

/**
* @ClassName: Collection
* @Description: 集合
* @author cps
* @date 2019年8月16日 下午4:11:32
*/
public class Collection {
    public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(4);
		System.out.println(arrayList);
		//for(int i=0;i<arrayList.size();i++) {
			//System.out.println(arrayList.get(i));
			
			// add(int index, E element)
			arrayList.add(0, 1000);
			System.out.println(arrayList);
		}
	}

