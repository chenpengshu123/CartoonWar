package com.neuedu.throwable;

/**
* @ClassName: ExceptionDeom2
* @Description: ArithmeticException类
* @author cps
* @date 2019年8月17日 上午11:24:07
*
*/
// ArithmeticException 算数运算异常-算数错误，除以0（运行异常 ）
public class ArithmeticException {
    public static void main(String[] args) {
		int a=0;
		System.out.println(5/0);
	}
}
