package edu.ncsu.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="template_types")
public class TemplateType {
	
	@Id
	private int type_id;
	private String type_name;
	
	/**
	 * @return the type_id
	 */
	public int getType_id() {
		return type_id;
	}
	/**
	 * @param type_id the type_id to set
	 */
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	/**
	 * @return the type_name
	 */
	public String getType_name() {
		return type_name;
	}
	/**
	 * @param type_name the type_name to set
	 */
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	
}
