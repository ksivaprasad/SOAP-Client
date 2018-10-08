package com.soapservice.client;

import com.soapservice.bean.Email;
import com.soapservice.bean.EmailStatus;
import com.soapservice.service.EmailServiceImpl;
import com.soapservice.service.EmailServiceImplServiceLocator;

public class Client {
	public static void main(String[] args) {
		EmailServiceImplServiceLocator locator = new EmailServiceImplServiceLocator();
		try {
			EmailServiceImpl emailServiceImpl = locator.getEmailServiceImpl();
			String body = "this is the body";
			String subject = "subject";
			String to = "ksivaprasad82@gmail.com";
			Email email = new Email(body,subject,to);
			EmailStatus status = emailServiceImpl.sendEmail(email);
			System.out.println(status.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
