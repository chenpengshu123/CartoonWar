package com.neuedu.throwable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
* @ClassName: TestThrows
* @Description: ����Throws
* @author cps
* @date 2019��8��18�� ����4:15:12
*
*/
public class TestThrows {
	
    public static void main(String[] args) {
		try {
			hello();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
       //  throws FileNotFoundException �����쳣(�����ڷ���֮��)
    public static void hello() throws FileNotFoundException {
    	FileReader fr = new FileReader(new File("E:\\hello.txt"));
    }
}
