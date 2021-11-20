package day08_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIfEmeklilik {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen cinsiyetinizi giriniz ");
		char cinsiyet = scan.next().toUpperCase().charAt(0);

		System.out.println("Lutfen yasinizi  giriniz ");
		double yas = scan.nextDouble();

		if (cinsiyet == 'E') {

			if (yas < 0) {
				System.out.println("erkek yas negatif olamaz");
			} else if (yas < 65) {
				System.out.println("Bu yastaki erkek Emekli olamaz");
			} else {
				System.out.println("bu yastaki erkek emekli olabilir");
			}

		} else if (cinsiyet == 'K') {
			if (yas < 0) {
				System.out.println("kadin yas negatif olamaz");
			} else if (yas < 60) {
				System.out.println("bu yastaki kadin Emekli olamaz");
			} else {
				System.out.println("Bu yastaki kadin emekli olabilir");
			}

		} else {
			System.out.println("yazdiginiz cinsiyet sisteme kayitli degil");
		}

		scan.close();
	}

}
