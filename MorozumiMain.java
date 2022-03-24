import java.util.*;
public class MorozumiMain{
	public static void main(String[] args){
		/*
		 * 年号が400で割り切れたらうるう年
		 * 年号が100で割り切れずに4で割り切れたらうるう年
		 * 実行例
		 * 西暦>> 2022
		 * 2022年はうるう年ではありません
		 * 西暦>> 2400
		 * 2400年はうるう年です
		 */
		System.out.print("西暦を入力: ");
		int y = new Scanner(System.in).nextInt();

		if(y % 400 == 0 || y % 100 != 0 && y % 4 == 0){
			System.out.println("うるう年です");
		}else{
			System.out.println("うるう年ではありません");
		}
	}
}
