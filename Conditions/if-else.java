import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Hoş Geldiniz!");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Yaşınızı giriniz: ");
		int yas = scanner.nextInt();
		
		    if (yas >= 18) {
		    
		        System.out.println("İşleminize devam edebilirsiniz.");
	    	} 
	    	/*
	    	else if (koşul) {
	    	    
	    	}
	    	*/
	    	else {
		    
		        System.out.println("İşleme devam edebilmek için en az 18 yaşında olmalısınız.");
	    	}
	}
}
