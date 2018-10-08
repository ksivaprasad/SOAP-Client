/**
 * EmailServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soapservice.service;

public class EmailServiceImplServiceLocator extends org.apache.axis.client.Service implements com.soapservice.service.EmailServiceImplService {

    public EmailServiceImplServiceLocator() {
    }


    public EmailServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmailServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EmailServiceImpl
    private java.lang.String EmailServiceImpl_address = "http://localhost:8080/SOAPService/services/EmailServiceImpl";

    public java.lang.String getEmailServiceImplAddress() {
        return EmailServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EmailServiceImplWSDDServiceName = "EmailServiceImpl";

    public java.lang.String getEmailServiceImplWSDDServiceName() {
        return EmailServiceImplWSDDServiceName;
    }

    public void setEmailServiceImplWSDDServiceName(java.lang.String name) {
        EmailServiceImplWSDDServiceName = name;
    }

    public com.soapservice.service.EmailServiceImpl getEmailServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EmailServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmailServiceImpl(endpoint);
    }

    public com.soapservice.service.EmailServiceImpl getEmailServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.soapservice.service.EmailServiceImplSoapBindingStub _stub = new com.soapservice.service.EmailServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getEmailServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmailServiceImplEndpointAddress(java.lang.String address) {
        EmailServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.soapservice.service.EmailServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.soapservice.service.EmailServiceImplSoapBindingStub _stub = new com.soapservice.service.EmailServiceImplSoapBindingStub(new java.net.URL(EmailServiceImpl_address), this);
                _stub.setPortName(getEmailServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EmailServiceImpl".equals(inputPortName)) {
            return getEmailServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.soapservice.com", "EmailServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.soapservice.com", "EmailServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EmailServiceImpl".equals(portName)) {
            setEmailServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
