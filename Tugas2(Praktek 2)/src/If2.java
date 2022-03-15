//13020200036, Muhammad Syawal Arma, 13-Maret-2022
import java.util.Scanner;

public class If2 {
	public static void main(String [] args) {
		int a;
		Scanner masukan = new Scanner(System.in);
		System.out.print("Contoh IF dua kasus \n");
		System.out.print("ketikan suatu nilai integer : ");
		a = masukan.nextInt();
		if(a >= 0) {
			System.out.print("Nilai a positif " + a);
		}else {
			System.out.print("Nilai a negatif " + a);
		}
	}
}
