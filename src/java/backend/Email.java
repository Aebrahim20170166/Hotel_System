/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package backend;

import com.sun.istack.internal.logging.Logger;
import static java.lang.System.out;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
/**
 *
 * @author Alaa_Ibrahim
 */
public class Email {
    public String sender="tvecacademy@gmail.com";
    public String password="tvec_2020";
    public String receiver="hekmatmaher7@gmail.com";
    public String subject;
    public String content;
    public String host="localhost";
    
    public void SendEmail() throws MessagingException{
        
        // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.smtp.starttls.enable", "true");
      properties.put("mail.smtp.host", "smtp.gmail.com");
      properties.put("mail.smtp.port", "587");
      
      Session session;
        session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(sender,password);
            }
        });
        
        Message message=prepareMessage(session, sender,receiver,subject,content);
        Transport.send(message);
        System.out.print("email sent");
      
    }

    private Message prepareMessage(Session session, String sender1, String receiver1,String subject,String content) throws MessagingException {
        try{
        Message message=new MimeMessage(session);
        message.setFrom(new InternetAddress(sender));  
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
        message.setSubject(subject);
        message.setText(content);
        return message;
        }
        catch(Exception ex)
        {
            out.print("error");
        }
        //To change body of generated methods, choose Tools | Templates.
        return null;
    }
}
