
package com.ifmo.servicesclientlab1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ifmo.serviceslab1maven package. 
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

    private final static QName _GetEmployeesResponse_QNAME = new QName("http://serviceslab1maven.ifmo.com/", "getEmployeesResponse");
    private final static QName _FilterEmployeesResponse_QNAME = new QName("http://serviceslab1maven.ifmo.com/", "FilterEmployeesResponse");
    private final static QName _FilterEmployees_QNAME = new QName("http://serviceslab1maven.ifmo.com/", "FilterEmployees");
    private final static QName _GetEmployees_QNAME = new QName("http://serviceslab1maven.ifmo.com/", "getEmployees");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ifmo.serviceslab1maven
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployees }
     * 
     */
    public GetEmployees createGetEmployees() {
        return new GetEmployees();
    }

    /**
     * Create an instance of {@link FilterEmployees }
     * 
     */
    public FilterEmployees createFilterEmployees() {
        return new FilterEmployees();
    }

    /**
     * Create an instance of {@link FilterEmployeesResponse }
     * 
     */
    public FilterEmployeesResponse createFilterEmployeesResponse() {
        return new FilterEmployeesResponse();
    }

    /**
     * Create an instance of {@link GetEmployeesResponse }
     * 
     */
    public GetEmployeesResponse createGetEmployeesResponse() {
        return new GetEmployeesResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab1maven.ifmo.com/", name = "getEmployeesResponse")
    public JAXBElement<GetEmployeesResponse> createGetEmployeesResponse(GetEmployeesResponse value) {
        return new JAXBElement<GetEmployeesResponse>(_GetEmployeesResponse_QNAME, GetEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab1maven.ifmo.com/", name = "FilterEmployeesResponse")
    public JAXBElement<FilterEmployeesResponse> createFilterEmployeesResponse(FilterEmployeesResponse value) {
        return new JAXBElement<FilterEmployeesResponse>(_FilterEmployeesResponse_QNAME, FilterEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab1maven.ifmo.com/", name = "FilterEmployees")
    public JAXBElement<FilterEmployees> createFilterEmployees(FilterEmployees value) {
        return new JAXBElement<FilterEmployees>(_FilterEmployees_QNAME, FilterEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceslab1maven.ifmo.com/", name = "getEmployees")
    public JAXBElement<GetEmployees> createGetEmployees(GetEmployees value) {
        return new JAXBElement<GetEmployees>(_GetEmployees_QNAME, GetEmployees.class, null, value);
    }

}
