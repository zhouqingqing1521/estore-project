package com.briup.bean;

import java.io.Serializable;
import java.util.List;
/**
 * 分类
 */
public class Category implements Serializable {
	private Integer id;
	private String name;
	private String description;
	//存储子类信息
	private List<Category> categories;

	public Category() {
		super();
		//
	}

	public Category(Integer id, String name, String description, List<Category> categories) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.categories = categories;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + ", categories=" + categories
				+ "]";
	}

}
