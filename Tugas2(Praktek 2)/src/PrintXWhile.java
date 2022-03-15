//13020200036, Muhammad Syawal Arma, 13-Maret-2022
import java.util.Scanner;

public class PrintXWhile {
	public static void main(String [] args) {
		int sum;
		int x;
		Scanner masukan = new Scanner(System.in);
		sum = 0;
		System.out.print("Masukkan nilai x (int), akhiri dengan 999 : \n");
		x = masukan.nextInt();
		while(x != 999) {
			sum = sum + x;
			System.out.print("Masukkan nilai x (int), akhiri dengan 999 : \n");
			x = masukan.nextInt();
		}
		System.out.println("Hasil penjumlahan = " + sum);
	}
}
