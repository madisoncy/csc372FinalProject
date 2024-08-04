package csc372FinalProject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		List<Student> listOfStudents = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Please enter student information. Or enter 'exit' to quit.");
			
			System.out.print("Student Name: ");
			String name = scanner.nextLine();
			
			if (name.equalsIgnoreCase("exit")) {
				break;
				}
			
			System.out.print("Student Address: ");
			String address = scanner.nextLine();
			
			System.out.print("Student GPA: ");
			double GPA = scanner.nextDouble();
			scanner.nextLine();
			
			Student student = new Student (name, address, GPA);
			listOfStudents.add(student);
			}
		
		Collections.sort(listOfStudents, (s1, s2) -> s1.getName().compareTo(s2.getName()));
		
		try (FileWriter writer = new FileWriter("studentdata.txt")) {
			for (Student student : listOfStudents) {
				writer.write(student.toString());
				}
			
			System.out.println("The student data has been exported to studentdata.txt.");
			} catch (IOException e) {
				e.printStackTrace();
				}
		}
	}