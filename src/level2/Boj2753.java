package level2;

// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Boj2753 {
public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y = Integer.parseInt(br.readLine());
		System.out.print((y % 4 == 0) ? ( (y % 400 == 0) ? "1" : (y % 100 == 0) ? "0" : "1") : "0");
	}
}
