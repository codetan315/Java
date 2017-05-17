package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import book.Book;

public class BufferedWriterSample5 {

	public static void main(String[] args) throws IOException {

		List<Book> bookList = new ArrayList<>();

		bookList.add(new Book("Java Book", 3000));
		bookList.add(new Book("PHP Book", 2000));
		bookList.add(new Book("Ruby Book", 4000));

		String path = "A:\\Programming\\Java_practice\\book.html";
		FileWriter fw = new FileWriter(path);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("<html>\r\n" +
				 "<head><title>Book List</title></head>\r\n" +
				 "<body>\r\n" +
				 "<table>\r\n");
		for (Book book : bookList) {
			bw.write("<tr><td>" + book.getName() + "</td><td>" + book.getPrice() + "</td></tr>\r\n");
		}
		bw.write("</table>\r\n" +
				 "</body>\r\n" +
				 "</html>");

		bw.close();

	}

}
