package com.misc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileSplitter {

	public static void main(String[] args) throws IOException {

		try {

			File f = new File("C:\\dump\\vahana-travel-data-2018-03-22-01-01-01.sql");

			BufferedReader b = new BufferedReader(new FileReader(f));
			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:\\dump\\vahana.sql"), "UTF-8"));

			String readLine = "";
			int i = 0;
			while ((readLine = b.readLine()) != null) {
				if (readLine.equals("DROP TABLE IF EXISTS `user`;")) {
					System.out.println("===== Process Started Writing Data ===== ");
					i = 1;
				}
				if (readLine.equals("DROP TABLE IF EXISTS `zzzz`;")) {
					break;
				}
				if (i == 1) {
					out.append(readLine);
					out.append("\n");
				}
			}
			System.out.println("===== Process Ended Writing Data ===== ");
			out.flush();
			out.close();
			b.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}
}
