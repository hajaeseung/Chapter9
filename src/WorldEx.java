import java.util.*;
public class WorldEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> nations = new HashMap<String, Integer> ();
		Scanner scanner = new Scanner(System.in);//��ĳ�� ��ü�� ���۷��� ���� ����
		while(true) {//���� �̸�, �α��� �Է�
			System.out.print("���� �̸�, �α�  >>" );
			String n = scanner.next();//�����̸� �Է�
			if(n.equals("�׸�"))
				break;//"�׸�" �Է½� ����
			int p = scanner.nextInt();//�α� �� �Է�
			nations.put(n, p);//����
		}
		while(true) {
			System.out.print("�α� �˻� >> ");
			String n = scanner.next();//�α� �˻�
			if(n.equals("�׸�"))
				break;//"�׸�" �Է½� ����
			Integer m = nations.get(n);//���� �˾Ƴ���
			if(m == null)
				System.out.println(n + "����� �����ϴ�.");
			else
				System.out.println(n + "�� �α��� " + m);
		}
		scanner.close();
	}

}
