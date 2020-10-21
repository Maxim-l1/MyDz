package DZGit.DZ;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner inInt = new Scanner(System.in);
        
		System.out.print("Имя: ");
        String name = in.nextLine();
        
		System.out.print("Место жительства: ");
        String city = in.nextLine();
        
		System.out.print("Возраст: ");
        int age = inInt.nextInt();
        
		System.out.print("Хобби: ");
        String hobby = in.nextLine();
        System.out.println();
        System.out.println("Вывод 1.1");
        System.out.println("Имя:" + "\t\t\t" + name);
        System.out.println("Место жительства:" + "\t" + city);
        System.out.println("Возраст:" + "\t\t" + age);
        System.out.println("Хобби:" + "\t\t\t" + hobby);

        System.out.println();
        System.out.println("Вывод 1.2");
        String text = String.format("Человек по имени %s живет в городе %s.\nЭтому человеку %d лет и любит он заниматься %s.",
        		name, city, age, hobby);
        System.out.println(text);
        
        System.out.println();
        System.out.println("Вывод 1.3");
        System.out.println("Имя - " + name);
        System.out.println("Место жительства - " + city);
        System.out.println("Возраст - " + age);
        System.out.println("Хобби - " + hobby);
	}
}