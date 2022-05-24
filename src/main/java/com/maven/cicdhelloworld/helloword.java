package com.maven.cicdhelloworld;

import javax.naming.Context;

import com.amazonaws.services.lambda.runtime.RequestHandler;

public class helloword implements RequestHandler<Object, String> {

	@Override
	public String handleRequest(Object input, com.amazonaws.services.lambda.runtime.Context context) {
		System.out.println("hello word");
		return "hello word..";
	
	}
}
