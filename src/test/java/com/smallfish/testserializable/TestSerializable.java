package com.smallfish.testserializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerializable {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Person person = new Person();

		person.setName("hello");
		person.setId(11);

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(
				"d:/aaa.txt"));
		
		os.writeObject(person);
		os.close();

	}

}
