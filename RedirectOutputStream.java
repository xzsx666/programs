package xzsx;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
	public static void main(String[] args) {
	try {
		PrintStream out=System.out;
		PrintStream ps=new PrintStream("./log.txt");
		System.setOut(ps);
		int age=18;
		System.out.println("年龄设置成功，初始值为18");
		String sex="女";
		System.out.println("性别设置成功，初始值为女");
		
		String info="这是个"+sex+"生，应该有"+age+"岁了";
		System.out.println("整个两个信息，结果是"+info);
		System.setOut(out);
		System.out.println("程序运行完毕，请查看日志文件");
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	}
}
