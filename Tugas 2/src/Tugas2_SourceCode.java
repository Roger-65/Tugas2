//13020200036, Muhammad Syawal Arma, 13-Maret-2022
import java.util.Scanner;

public class Tugas2_SourceCode {
	public static void main(String [] args) {
		int detik, menit, jam, totalDetik, totalMenit, totalJam;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Detik : ");
		totalDetik = input.nextInt();
		detik = totalDetik % 60;
		totalMenit = totalDetik / 60;
		menit = totalMenit % 60;
		totalJam = totalMenit / 60;
		jam = totalJam % 60;
		System.out.print(jam + ":" + menit + ":" + detik);
		
	}
}
