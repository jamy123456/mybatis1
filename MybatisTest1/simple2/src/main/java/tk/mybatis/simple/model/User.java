package tk.mybatis.simple.model;

public class User {
	private int id;
	private String name;
	private String age;
	private String address;
	private Role role;
	
	public User() {
		super();
	}

	

	public User(int id, String name, String age, String address, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.role = role;
	}



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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", role=" + role + "]";
	}

}
