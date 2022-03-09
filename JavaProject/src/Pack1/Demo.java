package Pack1;

import Pack1.MyInterface;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface ref=()->{System.out.println("Inside lamda disp");};
		ref.disp();
	}

}
