package Template;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Output1 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = "test시작!";
		bw.write(s + "\n");		// 버퍼에 있는 값 출력 + 예외처리 + 자동개행기능이 없음
		bw.flush();				// 남아있는 데이터 출력
		bw.close();				// 스트림 닫음
	}
}
