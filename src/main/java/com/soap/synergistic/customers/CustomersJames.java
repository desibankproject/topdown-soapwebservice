
package com.soap.synergistic.customers;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CustomersJames", targetNamespace = "http://www.synergistic.soap.com/customers")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomersJames {


    /**
     * 
     * @param username
     * @return
     *     returns com.soap.synergistic.customers.CustomerVO
     */
    @WebMethod(action = "http://www.synergistic.soap.com/customers/findCustomerByUsername")
    @WebResult(name = "findCustomerByUsernameResponse", targetNamespace = "http://www.synergistic.soap.com/customers", partName = "parameters")
    public CustomerVO findCustomerByUsername(
        @WebParam(name = "findCustomerByUsernameRequest", targetNamespace = "http://www.synergistic.soap.com/customers", partName = "username")
        String username);

}
