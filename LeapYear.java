package xzsx;

import java.util.Scanner;

public class LeapYear {
	 public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("输入一个年份：");	
		 long year=scan.nextLong();		//用户输入
		 if(year%4==0&&year%100!=0||year%400==0) 	//是闰年
			 System.out.println(year+"是闰年");
		 else 										                //不是闰年
			 System.out.println(year+"不是闰年");
	 
	 }
}
