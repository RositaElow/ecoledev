package fr.ecoledev.gestiondecole.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class ClassEntity {
   
	@Id 
	@GeneratedValue
	private Long id;
	private String name;
	private int level;
	private String field;
	
	/**
	 * Empty Constructor
	 */
	public ClassEntity() {}
	
	public ClassEntity(String name, int level, String field) {
		super();
		this.name = name;
		this.level = level;
		this.field = field;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	

	
}

