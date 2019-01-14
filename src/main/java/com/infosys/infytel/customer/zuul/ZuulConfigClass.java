package com.infosys.infytel.customer.zuul;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfigClass {
	/*@Bean
	public ZuulFallbackProvider zuulFallbackProvider() {
		return new ZuulFallbackProvider() {
			
			@Override
			public String getRoute() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ClientHttpResponse fallbackResponse() {
				// TODO Auto-generated method stub
				return new ClientHttpResponse() {
					
					@Override
					public HttpHeaders getHeaders() {
						// TODO Auto-generated method stub
						HttpHeaders headers = new HttpHeaders();
						headers.setContentType(MediaType.TEXT_PLAIN);
						return headers;
					}
					
					@Override
					public InputStream getBody() throws IOException {
						// TODO Auto-generated method stub
						return new ByteArrayInputStream("Sorry. Something went wrong".getBytes());
					}
					
					@Override
					public String getStatusText() throws IOException {
						// TODO Auto-generated method stub
						return "OK";
					}
					
					@Override
					public HttpStatus getStatusCode() throws IOException {
						// TODO Auto-generated method stub
						return HttpStatus.OK;
					}
					
					@Override
					public int getRawStatusCode() throws IOException {
						// TODO Auto-generated method stub
						return 200;
					}
					
					@Override
					public void close() {
						// TODO Auto-generated method stub
						
					}
				};
			}
		};
	}*/
}
