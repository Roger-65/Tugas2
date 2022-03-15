//13020200036, Muhammad Syawal Arma, 13-Maret-2022
import java.util.Scanner;

public class Max2 {
	public static void main(String [] args) {
		int a, b;
		Scanner masukan = new Scanner(System.in);
		System.out.print("Maksimum dua bilangan : \n");
		System.out.print("Ketikkan dua bilangan, pisahkan dengan RETURN : \n");
		a = masukan.nextInt();
		b = masukan.nextInt();
		System.out.println("Ke dua bilangan : a = " + a  + " b = " + b);
		if(a >= b) {
			System.out.println("Nilai a yang maksimum : " + a);
		}else {
			System.out.println("Nilai b yang maksikmum : " + b);
		}
	}
}
