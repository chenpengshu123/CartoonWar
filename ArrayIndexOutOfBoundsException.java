package com.neuedu.throwable;

/**
* @ClassName: ArrayIndexOutOfBoundsException
* @Description: ArrayIndexOutOfBoundsException类
* @author cps
* @date 2019年8月17日 上午11:12:56
*
*/
// ArrayIndexOutOfBoundsException 数组下标越界异常（运行异常）
public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
		String nums[]= {"one","two","three"};
			for(int i=0;i<4;i++)
				System.out.println(nums[i]);//i=3时，数组下标会越界
	}
}
