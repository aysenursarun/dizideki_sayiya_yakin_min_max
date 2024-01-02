package dizideki_sayiya_yakin_min_max;

import java.util.Arrays;
import java.util.Scanner;

public class dizideki_sayiya_yakin_min_max {

	public static void main(String[] args) {

		int[] arr = { 15, 12, 788, 1, -1, -778, 2, 0 };

		Scanner scan = new Scanner(System.in);

		System.out.print("Dizi: " + Arrays.toString(arr));
		System.out.println();
		System.out.print("Girilen Sayı: ");
		int value = scan.nextInt();

		Arrays.sort(arr);

		int x = 0;
		int y = 0;

		for (int i : arr) {
			if (i < value) {
				x = i;
			}
			if (i > value) {
				y = i;
				break;
			}
		}

		System.out.println("Girilen sayıdan küçük en yakın sayı : " + x);
		System.out.println("Girilen sayıdan büyük en yakın sayı : " + y);
	}

}
