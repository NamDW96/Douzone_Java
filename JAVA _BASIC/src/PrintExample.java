
public class PrintExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("%d원\n",value);
		System.out.printf("%3d원\n",value);
		System.out.printf("%8d원\n",value);
		System.out.printf("%-6d원\n",value);
		System.out.printf("%06d원\n",value);
		
		double area = 3.141592 *10 *10;
		System.out.printf("%010.2f\n",area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n",1,name, job);
	}
}
