import java.util.*;
public class RainEx {
	public static void result(Vector<Integer> v) {//��� ���ϴ� �޼ҵ�
		int sum = 0;
		Iterator<Integer> iterator = v.iterator();//Iterator ��ü ����
		while(iterator.hasNext()) {//Iterator ��ü�� ��Ұ� ���� ������ �ݺ�
			int n = iterator.next();//���� ��� ����
			sum += n;
		}
		System.out.print("���� ��� " + sum/v.size());//��� ��
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v = new Vector<Integer>();//Vector ��ü�� ���۷��� ���� ��
		Scanner scanner = new Scanner(System.in);//��ĳ�� ��ü�� ���۷��� ���� ����
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����)>>" );
			int n = scanner.nextInt();
			if(n == 0)
				break;//0�Է½� ����
			v.add(n);//����
			for(int i = 0; i < v.size(); i++)
			{
				System.out.print(v.get(i) + " ");//������ ������ ����
			}
			System.out.println(" ");
			result(v);//��հ�
			System.out.println(" ");
		}
		
	}

}
