package Mcqs;

public class VariableHiding {
	
	public static void main(String[] args) {
		int x=100;
		VariableHiding obj = new VariableHiding();
		obj.displayX(200);
		System.out.println(x);
	}
	private void displayX(int x) {
		x=x;
		System.out.println(x);
	}
}
