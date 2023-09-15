package MailProject.Email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import MailProject.Email.Code.Gmail;

//@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
//		SpringApplication.run(MainApplication.class, args);
		Gmail gmail = new Gmail();
        String to = "mehtashruti500@gmail.com";
        String from = "mehtashruti500@gmail.com";
        String subject = "Sending email using Gmail";
        String text = "This is a example email send using gmail and java program ";
        boolean b = gmail.sendEmail(to, from, subject, text);
        if (b) {
            System.out.println("Email is sent successfully");
        } else {
            System.out.println("There is problem in sending email");
        }

    }
	}
