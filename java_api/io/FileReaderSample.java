package io;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSample {

	public static void main(String[] args) throws IOException {

		String path = "A:\\Programming\\Java_practice\\book.csv";

		FileReader fr = new FileReader(path);

		int ch = fr.read();
		while (ch != -1) {
			System.out.print((char)ch);
			ch = fr.read();
		}

		fr.close();

	}

}
