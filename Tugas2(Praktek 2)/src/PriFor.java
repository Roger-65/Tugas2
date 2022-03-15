//13020200036, Muhammad Syawal Arma, 13-Maret-2022
import java.util.Scanner;

public class PriFor {
	public static void main(String [] args) {
		int i, N;
		Scanner masukan = new Scanner(System.in);
		System.out.print("Baca N, print l s/d N ");
		System.out.print("N = ");
		N = masukan.nextInt();
		
		for(i = 1; i <= N; i++) {
			System.out.println(i);
		}
		System.out.print("Akhiri program \n");
	}
}
