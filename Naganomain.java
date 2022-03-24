import java.util.*;
public class Naganomain{
	public static void main(String[] args){
		System.out.println("うるう年を判定します");
		int n = new Scanner(System.in).nextInt();
		if (n % 400 ==0 || n % 100 !=0 && n % 4 == 0 ){
			System.out.println("年はうるう年です");
		}else {
			System.out.println("年はうるう年ではありません");
		}
	}
}
