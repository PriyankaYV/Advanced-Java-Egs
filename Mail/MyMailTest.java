package com.emaildr;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class MyMailTest {

	public static void main(String[] args) throws AddressException,MessagingException, IOException {
		
		MyMail javaEmail = new MyMail();
		
		String [] emails = {"priyankayv93@gmail.com"};
		javaEmail.setMailServerProperties();
		javaEmail.createEmailMessage(emails,"Java Email","This is an email sent by JavaMail api.");
		javaEmail.sendEmail("priyankayv93","*******");
	}
		
		
		

}
