import java.util.*;
public class WorldEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> nations = new HashMap<String, Integer> ();
		Scanner scanner = new Scanner(System.in);//스캐너 객체와 레퍼런스 변수 생성
		while(true) {//나라 이름, 인구수 입력
			System.out.print("나라 이름, 인구  >>" );
			String n = scanner.next();//나라이름 입력
			if(n.equals("그만"))
				break;//"그만" 입력시 중지
			int p = scanner.nextInt();//인구 수 입력
			nations.put(n, p);//저장
		}
		while(true) {
			System.out.print("인구 검색 >> ");
			String n = scanner.next();//인구 검색
			if(n.equals("그만"))
				break;//"그만" 입력시 중지
			Integer m = nations.get(n);//정보 알아내기
			if(m == null)
				System.out.println(n + "나라는 없습니다.");
			else
				System.out.println(n + "의 인구는 " + m);
		}
		scanner.close();
	}

}
