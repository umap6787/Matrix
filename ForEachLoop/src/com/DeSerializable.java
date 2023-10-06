package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializable {

		public static void main(String[] args) throws Exception {
			FileInputStream fin = new FileInputStream("C:\\Users\\Umapathy LP\\OneDrive\\Documents\\ak");
			ObjectInputStream oin= new ObjectInputStream(fin);
			
			 Student st= (Student) oin.readObject();
			 System.out.println(st.getId()+" "+ st.getName()+" "+ st.getPer());
			 oin.close();
			 
			 

		}

	}

