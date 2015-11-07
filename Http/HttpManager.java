package com.felight;

import java.io.*;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import org.apache.http.util.EntityUtils;

public class HttpManager {
	static int count=0;

	public void HttpMger(String url) {

		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpGet httpGet = new HttpGet(url);
			CloseableHttpResponse response1 = httpclient.execute(httpGet);
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					response1.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				System.out.println(line);

				if (line.contains("a href=")) {
					count += 1;
				}
			}
			try {
				System.out.println(response1.getStatusLine());
				HttpEntity entity1 = response1.getEntity();

				EntityUtils.consume(entity1);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
