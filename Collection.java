package com.neuedu.test;

import java.util.ArrayList;

/**
* @ClassName: Collection
* @Description: ����
* @author cps
* @date 2019��8��16�� ����4:11:32
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

