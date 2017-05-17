package io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import book.Book;

public class FileWriterSample2 {

	public static void main(String[] args) throws IOException {

		List<Book> bookList = new ArrayList<>();

		bookList.add(new Book("Java Book", 3000));
		bookList.add(new Book("PHP Book", 2000));
		bookList.add(new Book("Ruby Book", 4000));

		String path = "A:\\Programming\\Java_practice\\booklist.csv";
		FileWriter fw = new FileWriter(path);

		for (Book book : bookList) {
			fw.write(book.getName() + "," + book.getPrice() + "\r\n");
		}

		fw.close();

	}

}
