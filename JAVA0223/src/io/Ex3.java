package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex3 {
	public static void main(String[] args) {
		Person p = new Person("홍길동", 20, "901010-1234456");
		
		File f = new File("c:\\temp\\person.txt");
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))){
			
			oos.writeObject(p);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){
			
			Object o = ois.readObject();
			if(o instanceof Person) {
				Person person = (Person)o;
				System.out.println(person.toString());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
