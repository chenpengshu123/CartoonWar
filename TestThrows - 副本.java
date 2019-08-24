package com.neuedu.throwable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
* @ClassName: TestThrows
* @Description: 测试Throws
* @author cps
* @date 2019年8月18日 下午4:15:12
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
       //  throws FileNotFoundException 声明异常(作用在方法之上)
    public static void hello() throws FileNotFoundException {
    	FileReader fr = new FileReader(new File("E:\\hello.txt"));
    }
}
