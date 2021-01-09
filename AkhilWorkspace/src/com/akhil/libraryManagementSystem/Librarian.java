package com.akhil.libraryManagementSystem;

/**
 * Contains the details of the librarian.
 * 
 * @author Akhil K Anil
 *
 */
public class Librarian {
	// id of the librarian.
	private int librarianId;
	// name of the librarian.
	private String librarianName;
	// address of the librarian.
	private String librarianAddress;

	/**
	 * Gets the id of the librarian.
	 * 
	 * @return - id of the librarian
	 */
	public int getLibrarianId() {
		return librarianId;
	}

	/**
	 * Sets the id of the librarian.
	 * 
	 * @param librarianId
	 */
	public void setLibrarianId(int librarianId) {
		this.librarianId = librarianId;
	}

	/**
	 * Gets the name of the librarian.
	 * 
	 * @return - name of the librarian.
	 */
	public String getLibrarianName() {
		return librarianName;
	}

	/**
	 * Sets the name of the librarian.
	 * 
	 * @param librarianName
	 */
	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}

	/**
	 * Gets the address of the librarian.
	 * 
	 * @return - address of the librarian.
	 */
	public String getLibrarianAddress() {
		return librarianAddress;
	}

	/**
	 * Sets the address of the librarian.
	 * 
	 * @param librarianAddress
	 */
	public void setLibrarianAddress(String librarianAddress) {
		this.librarianAddress = librarianAddress;
	}

}
