package io;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSample2 {

	public static void main(String[] args) throws IOException {

		String path = "A:\\Programming\\Java_practice\\book.csv";

		FileReader fr = new FileReader(path);

		int ch = fr.read();
		while (ch != -1) {
			if ((char)ch == ',') {
				ch = ' ';
				System.out.print((char)ch);
			} else {
				System.out.print((char)ch);
			}
			ch = fr.read();
		}

		fr.close();

	}

}
