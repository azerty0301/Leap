import java.util.*;
public class Matsuoka{
	public static void main(String[] args){
		int year;
		System.out.print("西暦>>");
		year=new Scanner(System.in).nextInt();
		if(year%400==0 || year%100!=0 && year%4==0){
			System.out.println("西暦>>"+year+"は閏年です");
		}else{
			System.out.println("西暦>>"+year+"は閏年ではありません");
		}
	}
}
