package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderSample4 {

	public static void main(String[] args) throws IOException {

		String path = "A:\\Programming\\Java_practice\\book.csv";

		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();
		while (line != null) {
			String[] items = line.split(",");
			int price = Integer.parseInt(items[2]);
			if (price >= 3000) {
				System.out.println(line);
			}
			line = br.readLine();
		}

		br.close();

	}

}
