package com.example.Classes.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class EntityForStudent {
	@Id
	private int id;
	private String name;
	private int age;
	private String collage;
	private String type;
	private long aadhhar;
	private String branch;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getAadhhar() {
		return aadhhar;
	}

	public void setAadhhar(long aadhhar) {
		this.aadhhar = aadhhar;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "EntityForStudent [id=" + id + ", name=" + name + ", age=" + age + ", collage=" + collage + ", type="
				+ type + ", aadhhar=" + aadhhar + ", branch=" + branch + "]";
	}

	public EntityForStudent(int id, String name, int age, String collage, String type, long aadhhar, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.collage = collage;
		this.type = type;
		this.aadhhar = aadhhar;
		this.branch = branch;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aadhhar, age, branch, collage, id, name, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntityForStudent other = (EntityForStudent) obj;
		return aadhhar == other.aadhhar && age == other.age && Objects.equals(branch, other.branch)
				&& Objects.equals(collage, other.collage) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(type, other.type);
	}

	public EntityForStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
