package xzsx;

import java.util.Scanner;
public class Example {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入姓名：");	//接受学生姓名
		String name=sc.nextLine();
		System.out.println("请输入年级：");	//接受学生年级
		String grade=sc.nextLine();
		
		switch (grade.hashCode()) {			//通过年级的哈希值匹配学生的教室
		case 727481:
			System.out.println("学生"+name+"被分配到001号教室");
			break;
		case 727621:
			System.out.println("学生"+name+"被分配到002号教室");
			break;
		case 727490:
			System.out.println("学生"+name+"被分配到003号教室");
			break;
		default:
			System.out.println("抱歉，不存在该年级！");
		}
	}

}
