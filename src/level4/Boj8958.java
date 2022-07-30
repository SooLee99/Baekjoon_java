package level4;

// OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Boj8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
 
		int test_case = Integer.parseInt(br.readLine()); // 테스트 케이스
 
		for (int i = 0; i < test_case; i++) {
			int cnt = 0; // 연속횟수
			int sum = 0; // 누적 합산
 
			for (byte value : br.readLine().getBytes()) {
				if (value == 'O') {
					cnt++;
					sum += cnt;
				} 
				else 
					cnt = 0;
			}
			sb.append(sum).append('\n');
		}
		System.out.println(sb);
	}
}