package Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Input1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader : Enter 만 경계로 인식, 입력데이터가 String
		
		String s = br.readLine();		// 예외처리 필수
		System.out.println(s);
		
		// 공백인식방법
		// 첫번째
		StringTokenizer st = new StringTokenizer(s);
		String s1 = st.nextToken();		// 첫번째 공백
		String s2 = st.nextToken();		// 두번째 공백
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("============");
		// 두번째
		String[] s3 = s.split(" ");
		for(int i=0; i<s3.length; i++) {
			System.out.println(s3[i]);
		}
		
		// 보통 형변환은 이 이후에 진행함
	}
}
