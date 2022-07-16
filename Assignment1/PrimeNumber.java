package week1.Assignment1;

public class PrimeNumber {
	public static void main(String[] args) {
		int input= 13;
		boolean flag = false;
		for(int i=2;i<=input/2;i++){
			if (input%i==0) {
				System.out.println(input+" Is not a Prime Number");
				flag=true;
				break;
			}
		}

		if (flag==false) {
			System.out.println(input+ "Is a Prime Number");

		}
	}



}
