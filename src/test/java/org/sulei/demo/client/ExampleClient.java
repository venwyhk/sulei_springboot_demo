package org.sulei.demo.client;

import org.sulei.demo.service.ExampleService;

import com.ikasoa.rpc.DefaultIkasoaFactory;

public class ExampleClient {

	public static void main(String[] args) {
		ExampleService es = new DefaultIkasoaFactory().getIkasoaClient(ExampleService.class, "localhost", 9999);
		System.out.println(es.getI());
	}

}
