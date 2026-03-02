import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kilonuzu giriniz (Ör. 85): ");
		int kilo = scanner.nextInt();
	
		System.out.print("Boyunuzu giriniz (Ör. 1.85): ");
		double boy = scanner.nextDouble();
		
		double vki = kilo / (boy * boy);
		
		System.out.println("Vücut Kitle İndeksiniz: " + vki);
	}
}
