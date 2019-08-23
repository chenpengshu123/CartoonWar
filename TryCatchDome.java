package com.neuedu.throwable;

/**
* @ClassName: ExceptionDome
* @Description:TryCatchDome��
* @author cps
* @date 2019��8��18�� ����3:51:45
*
*/
public class TryCatchDome {
    public static void main(String[] args) {
		System.out.println(test(null)+","+test("0")+
				test(""));
	}

	private static int test(String str) {
		try {
			// ����ֿ�ָ���쳣
			return str.charAt(0)-'0';
		}catch (NullPointerException e) {
			// ��ӡ���쳣
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
