package javacodeseries;

public class StaticBlock {
	private int x;
	private String name;
	
	static {
		int y=10;
		String staticName="Static Block";
		System.out.println("Static block executed");
	}
	public StaticBlock(int x,String name) {
		this.x=x;
		this.name=name;
	}
	public void updateInstanceVariables(int newX,String newName) {
		x=newX;
		name=newName;
	}
	public static void main(String[]args) {
		StaticBlock obj1=new StaticBlock(5,"Object 1");
		StaticBlock obj2=new StaticBlock(10,"Object 2");
		obj1.updateInstanceVariables(20,"Updated Object1");
		
		
		
	}

}
