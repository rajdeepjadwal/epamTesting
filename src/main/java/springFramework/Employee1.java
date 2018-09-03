package springFramework;

public class Employee1 {
	int eid;
	String ename;
	Address address;

	public Employee1() {
		
	}
	
	//constructor Injection
	public Employee1( Address address) {

		this.address = address;
	}


	public int getEid() {
		return eid;
	}

	@Override
	public String toString() {
		return "Empolyee1 [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	//setter Injection
	public void setAddress(Address address) {
		this.address = address;
	}

	public void myInit() {
		System.out.println("--Object Initialised");
	}

	public void myDestroy() {
		System.out.println("--Object Destroyed");
	}
}
