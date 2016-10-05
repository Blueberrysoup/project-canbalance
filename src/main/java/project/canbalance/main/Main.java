package project.canbalance.main;

import project.canbalance.classes.CanBalance;

public class Main {

	public static void main(String[] args) {
		CanBalance bal = new CanBalance();
		int[] intArr = {2,1,1,2,1};
		System.out.println(bal.canBalance(intArr));
	}

}
