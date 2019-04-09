package com.deletetheFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class App {
	public static void main(String[] args) throws Exception {
		// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String dir = "D:\\My_Learning\\[DesireCourse.Com] Udemy - Design Patterns in Java - Concepts & Hands On Projects";
		File f = new File(dir);
		File[] listFiles = f.listFiles();
		for (File file : listFiles) {
			File[] listFiles2 = file.listFiles();
			for (File file2 : listFiles2) {
				if (file2.getName().endsWith(".srt")) {
					System.out.println(file2.getAbsolutePath()+" Has Been deleted.");
                    file2.deleteOnExit();
				}
			}
		}

	}
}
