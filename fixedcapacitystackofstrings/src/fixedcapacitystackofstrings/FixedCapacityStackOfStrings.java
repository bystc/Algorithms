package fixedcapacitystackofstrings;
class FixedCapacity{
	private String[] a;
	private int N;
	public FixedCapacity(int cap){
		a=new String[cap];
		
	}
	public boolean isEmpty(){
		return N==0;
	}
	public int size(){
		return N;
		
	}
	public void push(String item){
		a[N++]=item;
		
	}
	public String pop(){
		return a[--N];
	}
}
public class FixedCapacityStackOfStrings {
	public static void main(String[] args){
		FixedCapacity s=new FixedCapacity(100);
		while(!StdIn.isEmpty()){
			String item=StdIn.readString();
			if(!item.equals("-"))
				s.push(item);
			else if(!s.isEmpty()) StdOut.print(s.pop()+" ");
		}
		StdOut.println("("+s.size()+" left on stack)");
		
	}

}
