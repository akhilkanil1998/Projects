package com.akhil.LibraryManagementSystem;

/**
 * Contains the details of the Admin.
 * 
 * @author Akhil K Anil
 *
 */
public class Admin {
	// Id of the admin.
	private int adminId;
	// Name of the admin.
	private String adminName;
	// Address of the admin.
	private String adminAddress;

	/**
	 * Gets the id of the admin.
	 * 
	 * @return - id of the admin.
	 */
	public int getAdminId() {
		return adminId;
	}

	/**
	 * Sets the id of the admin.
	 * 
	 * @param adminId
	 */
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	/**
	 * Gets the name of the admin.
	 * 
	 * @return - name of the admin.
	 */
	public String getAdminName() {
		return adminName;
	}

	/**
	 * Sets the name of the admin.
	 * 
	 * @param adminName
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * Gets the address of the admin.
	 * 
	 * @return - address of the admin.
	 */
	public String getAdminAddress() {
		return adminAddress;
	}

	/**
	 * Sets the address of the admin.
	 * 
	 * @param adminAddress
	 */
	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}

}
