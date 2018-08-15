package com.xyb.common.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

public class HttpRequst {
	
	static final int connectTimeoutMs = 6000;
	static final int readTimeoutMs = 8000;

	@SuppressWarnings("deprecation")
	public static String httpRequestReturn(String url, String data) throws Exception {
		BasicHttpClientConnectionManager connManager;

		connManager = new BasicHttpClientConnectionManager(RegistryBuilder.<ConnectionSocketFactory>create()
				.register("http", PlainConnectionSocketFactory.getSocketFactory())
				.register("https", SSLConnectionSocketFactory.getSocketFactory()).build(), null, null, null);

		HttpClient httpClient = HttpClientBuilder.create().setConnectionManager(connManager).build();

		HttpPost httpPost = new HttpPost(url);

		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(readTimeoutMs)
				.setConnectTimeout(connectTimeoutMs).build();
		httpPost.setConfig(requestConfig);

		StringEntity postEntity = new StringEntity(data, "UTF-8");
		// httpPost.addHeader("Content-Type", "text/xml");
		httpPost.addHeader("Content-Type", "application/json");

		httpPost.setEntity(postEntity);

		String responseBody = "";

		try {
			HttpResponse httpResponse = httpClient.execute(httpPost);
			HttpEntity httpEntity = httpResponse.getEntity();

			responseBody = EntityUtils.toString(httpEntity, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭连接
			httpClient.getConnectionManager().shutdown();
		}

		return responseBody;
	}
}
