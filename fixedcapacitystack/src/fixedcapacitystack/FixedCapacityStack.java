package fixedcapacitystack;
class fixedcapacity<T>{
	private T[] a;
	private int N;
	
	public fixedcapacity(int cap){
		a=(T[])new Object[cap];
	}
	public boolean isEmpty(){
		return N==0;
	}
	public int size(){
		return N;
	}
	public void push(T t){
		a[N++]=t;
	}
	public T pop(){
		return a[--N];
	}
	
}
public class FixedCapacityStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fixedcapacity<String> s=new fixedcapacity<String>(100);
		while(!StdIn.isEmpty()){
			String item=StdIn.readString();
			if(item.equals("-"))
				s.push(item);
			else if(!s.isEmpty()) 
				StdOut.print(s.pop()+" ");
			
		}
		StdOut.println("("+s.size()+"left on stack)");
		
	}

}
