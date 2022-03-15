//13020200036, Muhammad Syawal Arma, 13-Maret-2022
import java.util.Scanner;

public class PrintXInterasi {
	public static void main(String [] args) {
		int sum = 0;
		int x;
		Scanner masukan = new Scanner(System.in);
		System.out.print("Masukkan nilai x(int), akhiri dengan 999");
		x = masukan.nextInt();
		if (x == 999) {
			System.out.print("Kasus kosong \n");
		}else {
			sum = x;
			for(;;) {
				System.out.print("Masukkan nilai x(int), akhiri dengan 999 : ");
				x = masukan.nextInt();
				if(x == 999) {
					break;
				}else {
					sum = sum + x;
				}
			}
		}
		System.out.println("Hasil Penjumlahan = " + sum);
	}
}
