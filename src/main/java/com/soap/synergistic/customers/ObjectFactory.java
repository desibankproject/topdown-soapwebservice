
package com.soap.synergistic.customers;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.synergistic.customers package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindCustomerByUsernameRequest_QNAME = new QName("http://www.synergistic.soap.com/customers", "findCustomerByUsernameRequest");
    private final static QName _FindCustomerByUsernameResponse_QNAME = new QName("http://www.synergistic.soap.com/customers", "findCustomerByUsernameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.synergistic.customers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerVO }
     * 
     */
    public CustomerVO createCustomerVO() {
        return new CustomerVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.synergistic.soap.com/customers", name = "findCustomerByUsernameRequest")
    public JAXBElement<String> createFindCustomerByUsernameRequest(String value) {
        return new JAXBElement<String>(_FindCustomerByUsernameRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.synergistic.soap.com/customers", name = "findCustomerByUsernameResponse")
    public JAXBElement<CustomerVO> createFindCustomerByUsernameResponse(CustomerVO value) {
        return new JAXBElement<CustomerVO>(_FindCustomerByUsernameResponse_QNAME, CustomerVO.class, null, value);
    }

}
