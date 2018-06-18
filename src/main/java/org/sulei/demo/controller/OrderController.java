package org.sulei.demo.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.sulei.demo.dao.OrderDAO;
import org.sulei.demo.dao.pojo.OrderDO;
import org.sulei.demo.service.ExampleService;

import com.ikasoa.springboot.IkasoaServiceProxy;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/order")
public class OrderController {
	
	private static final Logger LOG = LoggerFactory.getLogger(OrderController.class);
	
	@Resource
	OrderDAO orderDao;
	
	@Autowired
	IkasoaServiceProxy proxy;

	// http://localhost:8080/order/get?id=1
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public Response<OrderDO> countOrder(@RequestParam(value = "id", required = false) Integer id) {
		try {
			return new Response<OrderDO>(0, orderDao.getOrderById(id));
		} catch (Exception e) {
			return new Response<OrderDO>(1, e.getMessage(), null);
		}
	}
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	@ResponseBody
	public Response<String> info() throws Exception {
		ExampleService es = proxy.getDefaultService(ExampleService.class);
		LOG.info(es.getI() + "");
		return new Response<String>(0, "", es.getI() + "");
	}

}
