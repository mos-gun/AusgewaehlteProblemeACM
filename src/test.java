import java.util.Date;

public class test {
	public static void main(String[] args) {

		long timeStart = getTime();
		long start = new Date().getTime();
		int num = 100;
		for (int i = 1; i <= num; i++) {
			System.out.print(i);
		}
		long timeEnd = getTime();
		System.out.println(timeEnd - timeStart);
		System.out.println(new Date().getTime()-start);
	}

	public static long getTime() {                            //Methode für aktuelle Zeit in Millisekunden
		return System.currentTimeMillis();
	}

	private static void doIt() {
		long time = -System.currentTimeMillis();
		System.out.println("Expensive Method Call....");
		System.out.println(time + System.currentTimeMillis() + "ms");
	}
}
