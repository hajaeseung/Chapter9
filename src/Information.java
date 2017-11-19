import java.util.*;

public class Information {
	public class Location {//도시 이름, 위도, 경도 기입
		private String city;
		private int latitude;
		private int longitude;
		public Location(String city, int latitude, int longitude) {//Location 객체 생성
			this.city = city;
			this.latitude = latitude;
			this.longitude = longitude;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCity() {
			return city;
		}
		public void setLatitude(int latitude) {
			this.latitude = latitude;
		}
		public int getLatitude() {
			return latitude;
		}
		public void setLongitude(int longitude) {
			this.longitude = longitude;
		}
		public int getLongitude() {
			return longitude;
		}
		
	}
	private Scanner scanner = new Scanner(System.in);//스캐너 객체와 레퍼런스 변수 생성
	private HashMap<String, Location> st = new HashMap<String, Location> ();//HashMap 객체와 레퍼런스 변수 생성
	private void read() {//도시 정보 기입
		System.out.println("도시,경도, 위도를 입력하세요.");
		for(int i = 0; i < 4; i++) {//4가지 도시 기입
			System.out.print(">>");
			String infor = scanner.nextLine();
			StringTokenizer tok = new StringTokenizer(infor, ",");
			String city = tok.nextToken().trim();
			int latitude = Integer.parseInt(tok.nextToken().trim());
			int longitude = Integer.parseInt(tok.nextToken().trim());
			Location location = new Location(city, latitude, longitude);
			st.put(city, location);
		}
	}
	private void print() { //4가지 도시의 정보 출력
		Set<String> a = st.keySet();//모든 key를 가진 set 컬렉션 리턴
		Iterator<String> it = a.iterator();
		System.out.println("---------------------------");
		while (it.hasNext()) {
			String name = it.next();
			Location location = st.get(name);
			//System.out.println("---------------------------");
			System.out.print(location.getCity() + " ");
			System.out.print(location.getLatitude() + " ");
			System.out.print(location.getLongitude() + " ");
			System.out.println("");
			//System.out.println("---------------------------");
		}System.out.println("---------------------------");	
	}

	private void infor() {//도시 검색
		while(true) {
			System.out.print("도시 이름 >> ");
			String city = scanner.nextLine(); // 도시 이름 입력
			if(city.equals("그만"))
				return; // 종료
			
				Location location = st.get(city);// 해시맵에서 도시명을 검색
				if(location == null) {
					System.out.println(city + "는 없습니다.");
				}
				else { //  이름이 같은 Location 찾음
					System.out.print(location.getCity() + ", ");
					System.out.print(location.getLatitude() + ", ");
					System.out.print(location.getLongitude() + ", ");
					System.out.println("");
				}
			
		}
	}
	public void run() {//실행
		read();
		print();
		infor();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Information infor =  new Information();
		infor.run();
	}

}
