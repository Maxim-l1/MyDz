package DZGit.DZ;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
		System.out.print("Введите массив чисел через пробел: ");
        String str = in.nextLine();
        
        String[] mass = str.split(" ");
        int[] massInt = new int[mass.length];
        for (int i = 0; i < massInt.length; i++) {
        	massInt[i] = Integer.parseInt(mass[i]);
        }
        
        int min = massInt[0];
        int max = massInt[0];
        int countFive = 0;
        for (int i = 1; i < massInt.length; i++) {
        	if (massInt[i] < min)
        		min = massInt[i];
        	if (massInt[i] > max)
        		max = massInt[i];
        	if (massInt[i] == 5)
        		countFive++;
        }
        System.out.println("Минимальное чисо массива: " + min);
        System.out.println("Максимальное чисо массива: " + max);
        System.out.println("Количество повторений числа 5: " + countFive);
        for(int i = massInt.length-1 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++) {
                if( massInt[j] > massInt[j+1] ){
                    int tmp = massInt[j];
                    massInt[j] = massInt[j+1];
                    massInt[j+1] = tmp;
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < massInt.length; i++) {
        	System.out.print(massInt[i] + " ");
        }
        System.out.println();
        int k = 0;
        int kMax = 0;
        for (int i = 0; i < massInt.length - 1; i++)
        {
            if (massInt[i+1] == massInt[i])
                k++;
            else
                k = 0;
            if (k > kMax) 
            	kMax = k;
        }
        System.out.println("Максимальное количество повторений числа: " + ++kMax);
	}
}
