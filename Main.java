import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = 0; // c라는 결과를 담을 변수를 만들고

        for (int i=0; i<b; i++) { // 0~3
            String[]str = br.readLine().split(" "); // 공백 구분해서 계산한다.
            int price = Integer.parseInt(str[0]);
            int count = Integer.parseInt(str[1]);

            int total = price * count; //price * count 의 값을 total에 저장

            c += total; // total 담을 값을 c에 더하면서 저장함
        }
        if(a == c) { // 만약 a의 총금액이 c의 총금액 이랑 같으면 YES 출력함
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
