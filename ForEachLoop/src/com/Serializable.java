package com;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Serializable {

		public static void main(String[] args) throws Exception {
			Scanner s = new Scanner(System.in);
			System.out.println("enter the student id, name, percentage");
			int id = s.nextInt();
			String name = s.next();
			double per = s.nextDouble();
			Student st = new Student(id,name,per);
			
			System.out.println(st.getId() +" "+st.getName()+ " "+ st.getPer()+" ");
			
			FileOutputStream fout= new FileOutputStream("C:\\Users\\Umapathy LP\\OneDrive\\Documents\\ak");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(st);
			out.close();
			System.out.println("successfully written..");
		}

	}

