import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		List<Integer> inputList = new ArrayList<Integer>();
		List<Integer> number = new ArrayList<Integer>();

		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < n; i++) {
			inputList.add(Integer.parseInt(br.readLine()));
		}

		int num = 1;
		boolean flag = true;

		for (int i = 0; i < n; i++) {
			int target = inputList.get(i);

			while (target >= num) {
				number.add(num);
				answer.append("+\n");
				num++;
			}

			int top = number.get(number.size() - 1);

			if (top == target) {
				number.remove(number.size() - 1);
				answer.append("-\n");
			} else {
				flag = false;
				break;
			}
		}

		if (!flag) {
			System.out.println("NO");
		} else {
			System.out.println(answer);
		}
	}
}