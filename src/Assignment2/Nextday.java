package Assignment2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Nextday {

	public static time nextday(time t) {
		int arr_month[] = { 1, 3, 5, 7, 8, 10, 12, 4, 6, 9, 11, 2 };
		time t1 = null;
		if (t.day < 32 && t.day > 0 && t.month > 0 && t.month < 13
				&& t.year > 1811 && t.year < 2012) {
			for (int i = 0; i < arr_month.length - 1; i++) {
				if (t.month == arr_month[i]) {
					if (i < 11) {
						if (t.day < 30) {
							t1.day = t.day + 1;
							t1.year = t.year;
						}
						if ((t.day == 30 && i > 7 && i < 10)
								|| (t.day == 31 && i < 8)) {
							t1.day = 1;
							if (t.month != 12) {
								t1.month = t.month + 1;
								t1.year = t.year;
							} else {
								t1.month = 1;
								t1.year = t.year + 1;
							}
						}
					}
					if (i == 11) {
						if (t.day < 28) {
							t1.day = t.day + 1;
						} else {
							if ((t.year % 4 == 0 && t.year % 100 != 0)
									|| t.year % 400 == 0) {
								if (t.day == 29) {
									t1.day = 1;
									t1.month = 3;
								} else {
									t1.day = 29;
									t1.month = t.month;
								}
							} else {
								t1.day = 1;
								t1.month = 3;
							}
						}
						t1.year = t.year;
					}
				}

			}

		} else {
			System.out.println("you've enter incorrected input");
		}
		System.out.println("The next day of this day is:" + t1.day + "/"
				+ t1.month + "/" + t1.year);
		return t1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
