import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir değer giriniz: ");
		
		int sayi = scanner.nextInt();
		
		System.out.println("Girdiğiniz değer: " + sayi);
	}
}
