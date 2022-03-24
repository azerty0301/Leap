import java.util.*;
public class NagatsuMain{
	public static void main(String[] args){
		System.out.print("西暦>>");
		int year = new Scanner(System.in).nextInt();
		if(year % 400 == 0){
			System.out.println("年はうるう年です");
		}else if(year % 100 == 0){
			System.out.println("年はうるう年ではありません");
		}else if(year % 4 == 0){
			System.out.println("年はうるう年です");
		}else{
			System.out.println("年はうるう年ではありません");
		}
	}
}
