public class Prices{
	public int index=0;
	public int position;
	public int prices[]=new int[5];
	
	public int getArrayLength(){
		return prices.length;
	}
	public void displayArray(){
		System.out.println("\nRead Operation: ");
		System.out.println("Array elements are:\n");
		for(int index=0;index<this.getArrayLength();index++){
			System.out.println("prices["+index+"]="+prices[index]);
		}
	}
	public void ArrayElementInsertion(int ele){
		System.out.println("\nInsert Operation:");
		if(this.index<this.getArrayLength()){
			System.out.println("Array has Space for insertion");
			System.out.println("Insert element: "+ele);
				this.prices[index]=ele;
				this.index++;
		}
		else{
			System.out.println("Array has no enough Space for insertion\n cannot insert element "+ele);
		}
		this.displayArray();
	}
}