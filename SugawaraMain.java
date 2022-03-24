import java.util.*;
public class SugawaraMain{
	public static void main(String[] args){
		System.out.println("うるう年かどうか判定します。");
		System.out.println("判定したい西暦を入力してください。");
		int seireki = new Scanner(System.in).nextInt();
		int hantei1 = seireki % 4;
		int hantei2 = seireki % 100;
		int hantei3 = seireki % 400;
		if((hantei1 == 0 && hantei2 >=1)||hantei3 == 0){
			System.out.println(seireki + "年はうるう年です。");
		}else{
			System.out.println(seireki + "年はうるう年ではありません。");
		}
	}
}
