import java.util.*;

public class Information {
	public class Location {//���� �̸�, ����, �浵 ����
		private String city;
		private int latitude;
		private int longitude;
		public Location(String city, int latitude, int longitude) {//Location ��ü ����
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
	private Scanner scanner = new Scanner(System.in);//��ĳ�� ��ü�� ���۷��� ���� ����
	private HashMap<String, Location> st = new HashMap<String, Location> ();//HashMap ��ü�� ���۷��� ���� ����
	private void read() {//���� ���� ����
		System.out.println("����,�浵, ������ �Է��ϼ���.");
		for(int i = 0; i < 4; i++) {//4���� ���� ����
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
	private void print() { //4���� ������ ���� ���
		Set<String> a = st.keySet();//��� key�� ���� set �÷��� ����
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

	private void infor() {//���� �˻�
		while(true) {
			System.out.print("���� �̸� >> ");
			String city = scanner.nextLine(); // ���� �̸� �Է�
			if(city.equals("�׸�"))
				return; // ����
			
				Location location = st.get(city);// �ؽøʿ��� ���ø��� �˻�
				if(location == null) {
					System.out.println(city + "�� �����ϴ�.");
				}
				else { //  �̸��� ���� Location ã��
					System.out.print(location.getCity() + ", ");
					System.out.print(location.getLatitude() + ", ");
					System.out.print(location.getLongitude() + ", ");
					System.out.println("");
				}
			
		}
	}
	public void run() {//����
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
