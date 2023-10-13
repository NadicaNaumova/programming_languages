package exe3;

public class myNumber {
	private int num1;
	public int num2;
	

	public myNumber(int num,int num2) {
		this.num1=0;
		this.num2=100;
	}
 int getNum() {
	 return num1;
 } void description() {
	 System.out.print("num1: " + num1);
     System.out.print("num2: " + num2);
 }


 public int getNum2() {
         return num2;
     }

 public float calculateAverage() {
	    return (float) (num1 + num2) / 2;
	}
	public static void main(String[] args) {
	    myNumber number = new myNumber(5, 10); 
	    number.description();
	    System.out.print("Average: " + number.calculateAverage());
	    System.out.print("Value of num2: " + number.getNum2());
	}
}
