import java.util.*;

public class VectorEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> a = new ArrayList<Character>();//ArrayList ��ü�� ���۷��� ���� ����
		Scanner scanner = new Scanner(System.in);//��ĳ�� ��ü�� ���۷��� ���� ����
		double sum = 0;//�Ǽ� ���� sum �ʱ�ȭ 0
		int count = 0;
		double score[] = new double[6];
		System.out.print("6���� ������ �� ĭ���� �и��Ͽ� �Է��ϼ���. (A/B/C/D/F)");
		while(count !=6)//count�� 5�� �ƴҶ����� �ݺ�
		{
			String st = scanner.next();
			char c = st.charAt(0);//������ index�� �ִ� ���� �����ؼ� c�� ����
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
			sum += score[i];//sum�� sum�� score[i] ���� �� ����
		}
		System.out.println();
		System.out.print("��� : " + sum/a.size());//��� ���
	}

}
