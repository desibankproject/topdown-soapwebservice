package com.soap.synergistic.customers.provider;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.soap.synergistic.customers.CustomerVO;
import com.soap.synergistic.customers.CustomersJames;

//name =portyType
@WebService(name = "CustomersJames",portName="CustomersJamesPort",serviceName="CustomersJamesService",endpointInterface="com.soap.synergistic.customers.CustomersJames", targetNamespace = "http://www.synergistic.soap.com/customers",wsdlLocation="WEB-INF/wsdl/customers.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class CustomerServiceProviderImpl implements CustomersJames{

	@Override
	public CustomerVO findCustomerByUsername(String username) {
		
		CustomerVO customerVO=new CustomerVO();
		customerVO.setEmail("nagen@synergisticit.com");
		customerVO.setGender("Male");
		customerVO.setPassword("test");
		customerVO.setPhoto("https://tpc.googlesyndication.com/simgad/17503230147793533909?sqp=4sqPyQQlQiMqIQhaEAEdAAC0QiABKAEwCTgDQPCTCUgAUAFYAWBacAJ4AQ&rs=AOga4qkZ7YXtTQ1ZINCkkKUbOACcbrqppw");
		customerVO.setRole("super admin");
		customerVO.setUsername("packpackpack");
		return customerVO;
	}

}
