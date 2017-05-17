package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterSample {

	public static void main(String[] args) throws IOException {

		String outputTxt = "Hello World";

		String path = "A:\\Programming\\Java_practice\\message.txt";
		FileWriter fw = new FileWriter(path);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(outputTxt);

		bw.close();
	}

}
