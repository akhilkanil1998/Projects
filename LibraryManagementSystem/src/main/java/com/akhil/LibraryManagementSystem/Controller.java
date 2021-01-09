package com.akhil.LibraryManagementSystem;

import java.util.ArrayList;

/**
 * Helps to perform the logic of the library application.
 * 
 * @author Akhil K Anil
 *
 */
public class Controller {
	/*
	 * FIELDS.
	 */
	// List of admins.
	private ArrayList<Admin> admins = new ArrayList<Admin>();
	// List of Librarians.
	private ArrayList<Librarian> librarians = new ArrayList<Librarian>();
	// List of Books.
	private ArrayList<Books> books = new ArrayList<Books>();

	/*
	 * GETTERS AND SETTERS.
	 */

	/**
	 * Gets the list of admins.
	 * 
	 * @return - list of admins.
	 */
	public ArrayList<Admin> getAdmins() {
		return admins;
	}

	/**
	 * Sets the admin to the admin list.
	 * 
	 * @param admins
	 */
	public void setAdmins(ArrayList<Admin> admins) {
		this.admins = admins;
	}

	/**
	 * Get the list of librarians.
	 * 
	 * @return - list of librarians.
	 */
	public ArrayList<Librarian> getLibrarians() {
		return librarians;
	}

	/**
	 * Sets the librarian to the librarian list.
	 * 
	 * @param librarians
	 */
	public void setLibrarians(ArrayList<Librarian> librarians) {
		this.librarians = librarians;
	}

	/**
	 * Gets the list of the books.
	 * 
	 * @return - list of the books.
	 */
	public ArrayList<Books> getBooks() {
		return books;
	}

	/**
	 * Sets the book to the books list.
	 * 
	 * @param books
	 */
	public void setBooks(ArrayList<Books> books) {
		this.books = books;
	}

}
