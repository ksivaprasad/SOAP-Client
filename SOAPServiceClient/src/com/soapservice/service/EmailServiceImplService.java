/**
 * EmailServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soapservice.service;

public interface EmailServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getEmailServiceImplAddress();

    public com.soapservice.service.EmailServiceImpl getEmailServiceImpl() throws javax.xml.rpc.ServiceException;

    public com.soapservice.service.EmailServiceImpl getEmailServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
