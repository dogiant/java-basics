package com.dogiant.core.l2;


public class Staff {
	
	private Long id;

	private Integer age;

	private String name;

	public Staff() {
		super();
	}

	public Staff(Long id, Integer age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static int compareByNameThenAge(Staff lo, Staff ro) {
	    if (lo.name.equals(ro.name)) {
	        return lo.age - ro.age;
	    } else {
	        return lo.name.compareTo(ro.name);
	    }
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Staff other = (Staff) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

}
