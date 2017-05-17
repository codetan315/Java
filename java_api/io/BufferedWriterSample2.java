package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import book.Book;

public class BufferedWriterSample2 {

	public static void main(String[] args) throws IOException {

		List<Book> bookList = new ArrayList<>();

		bookList.add(new Book("Java Book", 3000));
		bookList.add(new Book("PHP Book", 2000));
		bookList.add(new Book("Ruby Book", 4000));

		String path = "A:\\Programming\\Java_practice\\booklist.csv";
		FileWriter fw = new FileWriter(path);
		BufferedWriter bw = new BufferedWriter(fw);

		for (Book book : bookList) {
			bw.write(book.getName() + "," + book.getPrice());
			bw.newLine();
		}
		bw.close();

	}

}
