package com.kpmg.basics;

import java.io.File;

public class fILEeX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("kpmg.txt");
		System.out.println(f.mkdir());
		System.out.println(f.exists());
		System.out.println(f.isFile());
	}

}
