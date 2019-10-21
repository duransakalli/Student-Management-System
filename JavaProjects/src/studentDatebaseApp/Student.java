package studentDatebaseApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int balance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();

		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();

		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level");
		this.gradeYear = in.nextInt();

		setStudentID();

		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

	}

	private String setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
		return studentID;
	}

	public void Enroll() {
		Scanner in = new Scanner(System.in);
		String[] courseArr = new String[41];
		boolean quit = true;
		int count = 0;

		System.out.println("Enter course to enroll: \n");
		while (quit) {
			System.out.println("Press 1 to select History 101 \n" + "Press 2 to select English 101\n"
					+ "Press 3 to select Chemistry 101 \n" + "Press 4 to select Computer Science 101\n"
					+ "Press 5 to Quit\n");
			int select = in.nextInt();
			switch (select) {
			case 1:
				if (courseArr[0] == null) {
					count++;
				}
				courseArr[0] = "History 101";
				System.out.println("History 101 added.");
				break;
			case 2:
				if (courseArr[1] == null) {
					count++;
				}
				courseArr[1] = "English 101";
				System.out.println("English 101 added.");
				break;
			case 3:
				if (courseArr[2] == null) {
					count++;
				}
				courseArr[2] = "Chemistry 101";
				System.out.println("Chemistry 101 added.");
				break;
			case 4:
				if (courseArr[3] == null) {
					count++;
				}
				courseArr[3] = "Computer Science 101";
				System.out.println("Computer Science 101 added.");
				break;
			case 5:
				quit = false;
				break;
			}
		}
		in.close();
		for (int i = 0; i < courseArr.length; i++) {
			if (courseArr[i] != null) {
				System.out.println("ENROLLED IN : " + courseArr[i]);
			}
		}

		System.out.println("TUITION BALANCE: " + (count * costOfCourse));

	}
	
	

}
