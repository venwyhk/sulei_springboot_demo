package org.sulei.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

/**
 * 基础服务
 * 
 * @author <a href="mailto:larry7696@gmail.com">larry</a>
 * @version 0.1
 */
public abstract class BaseService {

	protected static final Logger LOG = LoggerFactory.getLogger(BaseService.class);

	/**
	 * 默认起始页编码
	 */
	protected static final int DEFAULT_PAGE_NUM = 0;

	/**
	 * 默认每页最大条数
	 */
	protected static final int DEFAULT_PAGE_SIZE = 20;

	/**
	 * 事务回滚
	 */
	protected void rollback() {
		TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
	}

}
