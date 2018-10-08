package com.soapservice.service;

public class EmailServiceImplProxy implements com.soapservice.service.EmailServiceImpl {
  private String _endpoint = null;
  private com.soapservice.service.EmailServiceImpl emailServiceImpl = null;
  
  public EmailServiceImplProxy() {
    _initEmailServiceImplProxy();
  }
  
  public EmailServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmailServiceImplProxy();
  }
  
  private void _initEmailServiceImplProxy() {
    try {
      emailServiceImpl = (new com.soapservice.service.EmailServiceImplServiceLocator()).getEmailServiceImpl();
      if (emailServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)emailServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)emailServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (emailServiceImpl != null)
      ((javax.xml.rpc.Stub)emailServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.soapservice.service.EmailServiceImpl getEmailServiceImpl() {
    if (emailServiceImpl == null)
      _initEmailServiceImplProxy();
    return emailServiceImpl;
  }
  
  public com.soapservice.bean.EmailStatus sendEmail(com.soapservice.bean.Email email) throws java.rmi.RemoteException{
    if (emailServiceImpl == null)
      _initEmailServiceImplProxy();
    return emailServiceImpl.sendEmail(email);
  }
  
  
}