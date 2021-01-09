package com.akhil.LibraryManagementSystem;

/**
 * Contains the details of the book.
 * 
 * @author Akhil K Anil
 *
 */
public class Books {
	// id of the book.
	private int bookId;
	// name of the book.
	private String bookName;
	// author of the book.
	private String bookAuthor;
	// status of the book;
	private String bookStatus;

	/**
	 * Gets the id of the book.
	 * 
	 * @return - id of the book.
	 */
	public int getBookId() {
		return bookId;
	}

	/**
	 * Sets the id of the book.
	 * 
	 * @param bookId
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	/**
	 * Gets the name of the book.
	 * 
	 * @return - name of the book.
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * Sets the name of the book.
	 * 
	 * @param bookName - name of the book.
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 * Gets the author of the book.
	 * 
	 * @return - author of the book.
	 */
	public String getBookAuthor() {
		return bookAuthor;
	}

	/**
	 * Sets the author of the book.
	 * 
	 * @param bookAuthor
	 */
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	/**
	 * Sets the status of the book.
	 * 
	 * @return - status of the book.
	 */
	public String GetBookStatus() {
		return bookStatus;
	}

	/**
	 * Sets the status of the book.
	 * 
	 * @param bookStatus
	 */
	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}

}
