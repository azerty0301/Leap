import java.util.*;
public class SasakiMain{
	public static void main(String[] args){
		System.out.print("西暦>>");
		int year = new Scanner(System.in).nextInt();

		if(year % 400 == 0 ||year % 100 != 0 && year % 4 == 0){
			System.out.println(year + "年はうるう年です");
		}else{
			System.out.println(year + "年はうるう年ではありません");
		}
	}
}
