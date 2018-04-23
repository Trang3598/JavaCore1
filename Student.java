package BT1p2;

public class Student {
	private String name, address;
	Block block;
	private int id, priority;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String address, Block block, int id, int priority) {
		super();
		this.name = name;
		this.address = address;
		this.block = block;
		this.id = id;
		this.priority = priority;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Block getBlock() {
		return block;
	}
	public void setBlock(Block block) {
		this.block = block;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", block=" + block + ", id=" + id + ", priority="
				+ priority + "]";
	}
	
	

}
