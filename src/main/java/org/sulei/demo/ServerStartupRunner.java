package org.sulei.demo;

import org.springframework.stereotype.Component;

import com.ikasoa.rpc.IkasoaException;
import com.ikasoa.springboot.IkasoaServerRunner;

@Component
public class ServerStartupRunner extends IkasoaServerRunner {

	@Override
	protected void complete(String... args) throws IkasoaException {
	}

	@Override
	protected void fail(String... args) throws IkasoaException {
	}

}
