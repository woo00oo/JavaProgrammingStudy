package collection;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return arrayStack.remove(len-1);
	}
	
	public int stackSize() {
		return arrayStack.size();
	}
	
	public String stackget(int po) {
		return arrayStack.get(po);
	}
}



public class StackTest {
	

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		for(int i = 0 ; i < stack.stackSize(); i ++) {
			System.out.println(stack.stackget(i));
		}
	}

}
