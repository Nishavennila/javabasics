package file.basics;

public class Student extends Object{
	private int id;
	 private String name;
	 private String gender;
	 private String branch;
	 private String dept;
	
	 
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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return name;
}
}

