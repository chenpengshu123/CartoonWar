package com.neuedu.throwable;

/**
* @ClassName: ExceptionDome
* @Description:TryCatchDome类
* @author cps
* @date 2019年8月18日 下午3:51:45
*
*/
public class TryCatchDome {
    public static void main(String[] args) {
		System.out.println(test(null)+","+test("0")+
				test(""));
	}

	private static int test(String str) {
		try {
			// 会出现空指针异常
			return str.charAt(0)-'0';
		}catch (NullPointerException e) {
			// 打印出异常
			e.printStackTrace(); return 1;
		}catch (RuntimeException e) {
			e.printStackTrace(); return 2;
		}catch (Exception e) {
			e.printStackTrace(); return 3;
		}finally {
			return 4;
		}
	}
}
