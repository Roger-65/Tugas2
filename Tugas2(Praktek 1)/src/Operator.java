//13020200036, Muhammad Syawal Arma, 12-Maret-2022
public class Operator {
	public static void main(String [] args) {
		boolean  Bool1, Bool2, TF;
		int i, j, hsl;
		float x, y, res;
		Bool1 = true;
		Bool2 = false;
		System.out.println("Bool1 = True, Bool2 = False");
		TF = Bool1 && Bool2;
		System.out.println("AND = " + TF);
		TF = Bool1 || Bool2;
		System.out.println("OR  = " + TF);
		TF = ! Bool1;
		System.out.println("NOT = " + TF);
		TF = Bool1 ^ Bool2;
		System.out.println("XOR = " + TF);
		System.out.println("______________________________");
		
		i = 5;
		j = 2;
		System.out.println("i = 5, j = 2");
		hsl = i + j;
		System.out.println("Tambah = " + hsl);
		hsl = i - j;
		System.out.println("Kurang = " + hsl);
		hsl = i * j;
		System.out.println("Kali   = " + hsl);
		hsl = i / j;
		System.out.println("Bagi   = " + hsl);
		hsl = i % j;
		System.out.println("Modulo = " + hsl);
		System.out.println("______________________________");
		
		x = 5;
		y = 5;
		System.out.println("x = 5, y = 5");
		res = x + y;
		System.out.println("Tambah = " + res);
		res = x - y;
		System.out.println("Tambah = " + res);
		res = x * y;
		System.out.println("Tambah = " + res);
		res = x / y;
		System.out.println("Tambah = " + res);
		System.out.println("______________________________");
		
		TF = (i == j);
		System.out.println("(i == j) = " + TF);
		TF = (i != j);
		System.out.println("(i != j) = " + TF);
		TF = (i < j);
		System.out.println("(i < j)  = " + TF);
		TF = (i > j);
		System.out.println("(i > j)  = " + TF);
		TF = (i >= j);
		System.out.println("(i >= j) = " + TF);
		TF = (i <= j);
		System.out.println("(i <= j) = " + TF);

	}
}
