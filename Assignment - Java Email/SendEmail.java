import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	public static void main(String[] args) {
		// to use smtp of gmail first enable from this link
		// https://myaccount.google.com/lesssecureapps
		// also add --add-modules java.activation parameter while runing program
		// Add recipient

		String to = "sanjibsubedi4@gmail.com";
		// Add sender
		String from = "sanjeebsubedi4@gmail.com";
		final String username = "sanjeebsubedi4@gmail.com";// your Gmail username
		final String password = "balespurs11";// your Gmail password
		String host = "smtp.gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");

		// Get the Session object
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// Create a default MimeMessage object
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

			// Set Subject
			message.setSubject("This is Test Email for the Soch College of IT");
			
			// Put the content of your message
			message.setText("Hi! This is just an experiment");
			
			// Send message
			Transport.send(message);

			System.out.println("Sent message successfully....");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
