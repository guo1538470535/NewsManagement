package com.jbit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

@SpringBootApplication
@MapperScan("com.jbit.dao")
public class NewsmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsmanagementApplication.class, args);
	}

//	@Bean  //默认是jackjson 以下操作是fastjson
//	public HttpMessageConverters fastHttpMessageConverter(){
//		//消息转换器
//		FastJsonHttpMessageConverter messageConverter=new FastJsonHttpMessageConverter();
//		//配置属性
//		FastJsonConfig fastJsonConfig=new FastJsonConfig();
//		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//		//加载配置
//		messageConverter.setFastJsonConfig(fastJsonConfig);
//		return new HttpMessageConverters(messageConverter);
//	}

}
