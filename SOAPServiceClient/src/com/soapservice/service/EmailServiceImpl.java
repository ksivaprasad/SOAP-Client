/**
 * EmailServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soapservice.service;

public interface EmailServiceImpl extends java.rmi.Remote {
    public com.soapservice.bean.EmailStatus sendEmail(com.soapservice.bean.Email email) throws java.rmi.RemoteException;
}
