package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderSample3 {

	public static void main(String[] args) throws IOException {

		String path = "A:\\Programming\\Java_practice\\book.csv";

		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();
		while (line != null) {
			String[] items = line.split(",");
			String category = items[3];
			if (category.equals("programming")) {
				System.out.println(line);
			}
			line = br.readLine();
		}

		br.close();

	}

}
