package com.collection.practice;

import java.util.TreeSet;

public class BookTreeSet {

	public static void main(String args[])
	{
		TreeSet<Book> bookSet = new TreeSet();
		bookSet.add(new Book(1,"One Indian Girl","Chetan Bhagat"));
		bookSet.add(new Book(2,"The song of ice and fire","Jorge R R Martin"));
		bookSet.add(new Book(3,"Harry Potter and Priseners of Azskban","J K rowllings"));
		bookSet.add(new Book(4,"The Hobbit","J L Tolkins"));
	
		System.out.println(bookSet);
	}
	
	
}
class Book implements Comparable<Book>
{
	private Integer bookId;
	private String bookName;
	private String Auther;
	
	public Book(Integer bookId, String bookName, String auther) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		Auther = auther;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuther() {
		return Auther;
	}

	public void setAuther(String auther) {
		Auther = auther;
	}

	@Override
	public String toString() {
		return "\nBook [bookId=" + bookId + ", bookName=" + bookName + ", Auther=" + Auther + "]";
	}

	@Override
	public int compareTo(Book book) {
		// TODO Auto-generated method stub
		if(this.getBookName().equalsIgnoreCase(book.getBookName()) && this.getAuther().equalsIgnoreCase(book.getAuther()))
		{
			return 0;
		}
		else if(this.getBookName().compareTo(book.getBookName())>0 )
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	
}
