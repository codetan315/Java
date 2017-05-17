package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderSample2 {

	public static void main(String[] args) throws IOException {

		String path = "A:\\Programming\\Java_practice\\book.csv";

		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();
		while (line != null) {
			System.out.println(line.replaceAll(",", " "));
			line = br.readLine();
		}

		br.close();

	}

}
