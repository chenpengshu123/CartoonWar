package com.neuedu.throwable;

/**
* @ClassName: ArrayIndexOutOfBoundsException
* @Description: ArrayIndexOutOfBoundsException��
* @author cps
* @date 2019��8��17�� ����11:12:56
*
*/
// ArrayIndexOutOfBoundsException �����±�Խ���쳣�������쳣��
public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
		String nums[]= {"one","two","three"};
			for(int i=0;i<4;i++)
				System.out.println(nums[i]);//i=3ʱ�������±��Խ��
	}
}
