package hw0305;

import java.util.Scanner;

public class Hw0305 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int fv;
		int pv;
		final double i=0.05;
		int n;
		System.out.print("�п�J����");
		pv=scn.nextInt();
		System.out.print("�п�J�g��");
		n=scn.nextInt();
		fv=(int) (pv * Math.pow((i+1),n));
		System.out.print("My pv is "+pv+" and after "+n+" year it would be "+fv);
	}
}
