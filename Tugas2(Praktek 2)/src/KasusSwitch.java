//13020200036, Muhammad Syawal Arma, 13-Maret-2022
import java.util.Scanner;

public class KasusSwitch {
	public static void main(String [] args) {
		char cc;
		Scanner masukan = new Scanner(System.in);
		System.out.print("Ketikkan sebuah huruf, akhiri dengan RETURN \n");
		cc = masukan.next().charAt(0);
		switch(cc) {
			case 'a' : {
				System.out.print(" Yang anda ketik adalah a");
				break;
			}
			case 'u' : {
				System.out.print(" Yang anda ketik adalah u");
				break;
			}
			case 'e' : {
				System.out.print(" Yang anda ketik adalah e");
				break;
			}
			case 'i' : {
				System.out.print(" Yang anda ketik adalah i");
				break;
			}
			case 'o' : {
				System.out.print(" Yang anda ketik adalah o");
				break;
			}
			default : {
				System.out.print(" Yang and ketik adalah huruf mati \n");
				break;
			}
		}
	}
}
