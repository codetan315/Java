package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import book.Book;

public class BufferedWriterSample4 {

	public static void main(String[] args) throws IOException {

		List<Book> bookList = new ArrayList<>();

		bookList.add(new Book("Java Book", 3000));
		bookList.add(new Book("PHP Book", 2000));
		bookList.add(new Book("Ruby Book", 4000));

		String path = "A:\\Programming\\Java_practice\\booktotal.txt";
		FileWriter fw = new FileWriter(path);
		BufferedWriter bw = new BufferedWriter(fw);

		int sum = 0;
		for (Book book : bookList) {
			sum += book.getPrice();
		}
		bw.write(Integer.toString(sum));
		bw.close();

	}

}
