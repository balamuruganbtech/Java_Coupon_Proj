package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationAppLaunch {

	static void persistExample() throws Exception {
		Employee e1 = new Employee(1, "muruga", "80k");
		FileOutputStream fos = new FileOutputStream("D:\\bala\\E\\stuff-misc\\serialization\\employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println("=========== Persist Successfully ===========");

	}

	static void dePersistExample() throws Exception {
		FileInputStream fis = new FileInputStream("D:\\bala\\E\\stuff-misc\\serialization\\employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e = (Employee) ois.readObject();
		System.out.println(e.id + "\t" + e.name + "\t" + e.salary);
		ois.close();
		fis.close();
		System.out.println("=========== De-Persist Successfully ===========");
	}

	public static void main(String[] args) throws Exception {
		persistExample();
		dePersistExample();

	}

}
