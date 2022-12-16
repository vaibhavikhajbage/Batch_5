package com.java8featuresdemosorting;


	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;

	public class BookService {

		public List<Book> getBooksSort(){
			List<Book>  books = new BookDAO().getBooks();
			//Collections.sort(books, new MyComparator());
			Collections.sort(books, (b1,b2)->b1.getPage()-b2.getPage());
			return books;
			
		}
		
		public static void main(String[] args) {
			System.out.println(new BookService().getBooksSort());
		}
		
	}
	/*class MyComparator implements Comparator<Book>{

		@Override
		public int compare(Book b1, Book b2) {	
			return b2.getPage()-b1.getPage();
		}
		
		
	}*/


