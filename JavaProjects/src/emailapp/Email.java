package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private int defaultPAsswordLength = 10;
	private String alternativeEmail;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		this.password = randomPassword(defaultPAsswordLength);
		System.out.println("Your password is: " + this.password);

		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + "company.com";
		System.out.println("Your email is: " + email);
	}

	public String setDepartment() {
		System.out.println(
				"DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Deparment Code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "sales";
		} else if (depChoice == 2) {
			return "dev";
		} else if (depChoice == 3) {
			return "acct";
		} else {
			return " ";
		}
	}

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789&%$#@!.";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);

		}
		return new String(password);
	}

	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;

	}

	public void setAlternativeEmail(String altEmail) {
		this.alternativeEmail = altEmail;

	}

	public void changePassword(String newPassword) {
		this.password = newPassword;
	}

	public String getPassword() {
		return password;
	}

	public int getMailboxCapacity() {
		return mailBoxCapacity;
	}

	public String getAlternativeEmail() {
		return alternativeEmail;
	}

	public String showInfo() {
		return  "DISPLAY NAME: "+firstName+" "+lastName+"\n"+
				"COMPANY EMAIL: "+email+"\n"+
				"MAILBOX CAPACITY: "+mailBoxCapacity;	
		}

}
