package com.neuedu.throwable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
* @ClassName: CloseAbleDome
* @Description: CloseAbleDome类
* @author cps
* @date 2019年8月18日 下午4:49:41
*
*/
public class CloseAbleDome {
    public static void main(String[] args) {
		try (LoginException hello=new LoginException()){
			hello.Login();
			System.out.println("world");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class LoginException extends Exception implements AutoCloseable{
    public void Login() {
    	System.out.println("登录");
    }
	@Override
	public void close() throws Exception {
		System.out.println("已关闭");
	}
	
}

