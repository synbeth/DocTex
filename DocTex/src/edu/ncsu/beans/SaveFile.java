package edu.ncsu.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="save_files")
public class SaveFile {
	
	@Id
	private int file_id;
	private int user_id;
	private int temp_id;
	private String filename;
	private String pathname;
	
	/**
	 * @return the file_id
	 */
	public int getFile_id() {
		return file_id;
	}
	/**
	 * @param file_id the file_id to set
	 */
	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}
	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the temp_id
	 */
	public int getTemp_id() {
		return temp_id;
	}
	/**
	 * @param temp_id the temp_id to set
	 */
	public void setTemp_id(int temp_id) {
		this.temp_id = temp_id;
	}
	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}
	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
	/**
	 * @return the pathname
	 */
	public String getPathname() {
		return pathname;
	}
	/**
	 * @param pathname the pathname to set
	 */
	public void setPathname(String pathname) {
		this.pathname = pathname;
	}
	
	
}
