package data_structures;

class DynamicStack extends CustomStack{
	DynamicStack(){
		super();
	}
	
	DynamicStack(int item){
		super();
	}
	
	@Override
	public boolean push(int item) {
		if(this.isfull()) {
			//create an array of double size
			int[] temp = new int[data.length * 2];
			
			//copy all the elements in temp
			for(int i=0;i<data.length;i++) {
				temp[i] = data[i];
			}
			
			data = temp;
		}
		
		
		//now we know the stack is not full so insert the item as usual
		return super.push(item);
	}
}

public class Dynamic_Stack{
	public static void main(String[] args) throws StackException {
		DynamicStack stack = new DynamicStack();
		stack.push(200);
		stack.push(900);
		stack.push(45);
		stack.push(90);
		stack.push(45);
		stack.push(100);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
