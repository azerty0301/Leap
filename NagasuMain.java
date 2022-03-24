import java.util.*;
public class NagasuMain{
	public static void main(String[] args){
		/*
		 * 年号が400で割り切れたらうるう年
		 * 年号が１００で割り切れずに４で割り切れたらうるう年
		 *
		 */

	  System.out.print("西暦 >>");
	  int yyyy = new Scanner(System.in).nextInt();
	  int hantei1 = yyyy % 400;
	  int hantei2 = yyyy % 100;
	  int hantei3 = yyyy % 4;
		
	  if(hantei1 == 0 || hantei2 != 0 && hantei3 == 0 ){
		  System.out.println(yyyy + "年はうるう年です");
	  }else{
		  System.out.println(yyyy + "年はうるう年ではありません");
		}
	}
}
