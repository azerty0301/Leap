import java.util.*;
public class AkitaMain{
	public static void main(String[] args){
		System.out.print("西暦>>");
		int y = new Scanner(System.in).nextInt();
		if(y%400==0 || y%100!=0 && y%4==0){
			System.out.print(y+"はうるう年です。");
		}else{
			System.out.print(y+"はうるう年ではありません。");
		}
	}
}
