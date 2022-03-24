import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		System.out.print("西暦>>");
		int input_year = new Scanner(System.in).nextInt();
		int cond1 = input_year % 400;
		int cond2 = input_year % 100;
		int cond3 = input_year % 4;

		if((cond1 ==0) || (cond2 !=0 && cond3 ==0)){
			System.out.println(input_year + "年はうるう年です。");
		}else{
			System.out.println(input_year + "年はうるう年ではありません。");
		}
	}
}
