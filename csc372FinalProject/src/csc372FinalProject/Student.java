package csc372FinalProject;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class Student {
	
	private String name;
	private String address;
	private double GPA;
	
	public Student(String name, String address, double GPA) {
		this.name = name;
		this.address = address;
		this.GPA = GPA;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	public String toString() {
		return "Student Name: " + name + "\nStudent Address: " + address + "\nStudent GPA: " + GPA + "\n";
	}
}