package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderSample5 {

	public static void main(String[] args) throws IOException {

		String path = "A:\\Programming\\Java_practice\\book.csv";

		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();
		int sum = 0;
		while (line != null) {
			String[] items = line.split(",");
			int price = Integer.parseInt(items[2]);
			sum += price;
			line = br.readLine();
		}
		System.out.println(sum);

		br.close();

	}

}
