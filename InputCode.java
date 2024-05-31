package xzsx;

import java.util.Scanner;
public class InputCode {

	public static void main(String[] args) {
		System.out.println("请输入你的身份证号：");
		Scanner sc=new Scanner(System.in);		//输入身份证号码
		String line=sc.nextLine();            
		System.out.println("原来你的身份证号码是"+line.length()+"位数字啊！");      //输出身份证号码有多少位

	}

}
