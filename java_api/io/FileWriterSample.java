package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {

	public static void main(String[] args) throws IOException {

		String outputTxt= "Hello World";

		String path = "A:\\Programming\\Java_practice\\output.txt";
		FileWriter fw = new FileWriter(path);

		fw.write(outputTxt);

		fw.close();

	}

}
