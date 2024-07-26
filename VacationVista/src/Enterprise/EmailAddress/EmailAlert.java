/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.EmailAddress;

import Enterprise.Customer.Customer;
import java.util.Properties;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.DataSource;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;

/**
 *
 * @author siddh
 */
public class EmailAlert {

    public void sendEmail(Customer userDetails, String facility, boolean isApproved) {
    final String username = "teamvacationvista@gmail.com"; // Resort owner's Gmail address
    final String password = "gmuy hmwv vwxy glje"; // Resort owner's Gmail password
    final String host = "smtp.gmail.com"; // Gmail SMTP server
    final String port = "587"; // TLS port for Gmail

    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.host", host);
    props.put("mail.smtp.port", port);

    Session session = Session.getInstance(props,
    new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication(username, password);
    }
    }
 );

    try {
    Message message = new MimeMessage(session);
    message.setFrom(new InternetAddress(username));
    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(userDetails.getEmailId()));

    // Subject of the email
    String subject = isApproved ? "Booking Approval Confirmation from VACATION VISTA" : "Booking Rejection Notification from VACATION VISTA";
    message.setSubject(subject);

    // Body of the email
    String approvalMessage = isApproved ?
    "Your booking request for " + facility + " has been approved by our team. We look forward to hosting you!\n\n\n Regards,\n Team Vacation Vista" :
    "We regret to inform you that your booking request for " + facility + " has been rejected. Sorry for Inconvience. \n\n\n Regards,\n Team Vacation Vista";
    message.setText(approvalMessage);

    Transport.send(message);
    System.out.println("Email sent successfully.");
    } catch (MessagingException e) {
    e.printStackTrace();
    throw new RuntimeException(e);
    }
 }
   
    
    public void sendEmailInvoice(Customer userDetails) {
    final String username = "teamvacationvista@gmail.com"; // Resort owner's Gmail address
    final String password = "gmuy hmwv vwxy glje"; // Resort owner's Gmail password
    final String host = "smtp.gmail.com"; // Gmail SMTP server
    final String port = "587"; // TLS port for Gmail

    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.host", host);
    props.put("mail.smtp.port", port);

    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
        }
    });

    try {
        // Create a default MimeMessage object
        Message message = new MimeMessage(session);

        // Set From: header field
        message.setFrom(new InternetAddress(username));

        // Set To: header field
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(userDetails.getEmailId()));

        // Set Subject: header field
        message.setSubject("Invoice From Vacation Vista");

        // Create a multipart message for attachment
        Multipart multipart = new MimeMultipart();

        // Part one is text message
        BodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText("Your Invoice is ready. Please check the attached pdf and pay the bill accordingly.\nThank you!\n\nRegards,\nVacation Vista.");
        multipart.addBodyPart(messageBodyPart);

        // Part two is the attachment
        messageBodyPart = new MimeBodyPart();
        String filename = "Invoice.pdf"; // Assuming you have already created the file
        DataSource source = new FileDataSource(filename);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(filename);
        multipart.addBodyPart(messageBodyPart);

        // Send the complete message parts
        message.setContent(multipart);

        // Send message
        Transport.send(message);
        
    } catch (MessagingException e) {
        e.printStackTrace();
        throw new RuntimeException(e);
    }
}
    
    
    
    
    
}
