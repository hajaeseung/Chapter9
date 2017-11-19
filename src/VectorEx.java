import java.util.*;

public class VectorEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> a = new ArrayList<Character>();//ArrayList 객체와 레퍼런스 변수 생성
		Scanner scanner = new Scanner(System.in);//스캐너 객체와 레퍼런스 변수 생성
		double sum = 0;//실수 변수 sum 초기화 0
		int count = 0;
		double score[] = new double[6];
		System.out.print("6개의 학점을 빈 칸으로 분리하여 입력하세요. (A/B/C/D/F)");
		while(count !=6)//count가 5가 아닐때까지 반복
		{
			String st = scanner.next();
			char c = st.charAt(0);//지정된 index에 있는 문자 리턴해서 c에 대입
			if((c >= 'A' && c <= 'D') || c == 'F')
			{a.add(c); count++;}
			else continue;
		}
		for(int i = 0; i < a.size(); i++)
		{
			if(a.get(i) == 'A')
			{score[i] = 4.0;}
			else if(a.get(i) == 'B')
			{score[i] = 3.0;}
			else if(a.get(i) == 'C')
			{score[i] = 2.0;}
			else if(a.get(i) == 'D')
			{score[i] = 1.0;}
			else if(a.get(i) == 'F')
			{score[i] = 0.0;}
			System.out.print(score[i]  + " ");
			sum += score[i];//sum에 sum과 score[i] 더한 값 대입
		}
		System.out.println();
		System.out.print("평균 : " + sum/a.size());//평균 출력
	}

}
