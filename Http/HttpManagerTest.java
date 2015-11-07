package com.felight;

import java.io.IOException;

public class HttpManagerTest {
		
	public static void main(String[] args) throws IOException{
		
		HttpManager hm = new HttpManager();
		hm.HttpMger("http://www.felight.com");
		System.out.println(HttpManager.count);
		
	}

}
