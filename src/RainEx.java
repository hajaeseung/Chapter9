import java.util.*;
public class RainEx {
	public static void result(Vector<Integer> v) {//평균 구하는 메소드
		int sum = 0;
		Iterator<Integer> iterator = v.iterator();//Iterator 객체 리턴
		while(iterator.hasNext()) {//Iterator 객체에 요소가 있을 때까지 반복
			int n = iterator.next();//다음 요소 리턴
			sum += n;
		}
		System.out.print("현재 평균 " + sum/v.size());//평균 값
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v = new Vector<Integer>();//Vector 객체와 레퍼런스 변수 생
		Scanner scanner = new Scanner(System.in);//스캐너 객체와 레퍼런스 변수 생성
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료)>>" );
			int n = scanner.nextInt();
			if(n == 0)
				break;//0입력시 종료
			v.add(n);//저장
			for(int i = 0; i < v.size(); i++)
			{
				System.out.print(v.get(i) + " ");//벡터의 정수들 리턴
			}
			System.out.println(" ");
			result(v);//평균값
			System.out.println(" ");
		}
		
	}

}
