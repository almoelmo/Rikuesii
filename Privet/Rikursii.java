package Privet;
import java.util.Scanner;
public class Rikursii {
}


public class tasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in );
        /*int n = scan.nextInt(); // крайний элемент
 int f1 = 1;
 int f2 = 1;
 int f3 = 0;
 while(f2 <= n){
 System.out.print(f1 + " ");
 f3 = f1 + f2;
 f1 = f2;
 f2 = f3;
        }
 System.out.print(f1);
         */
        /*
 int n = scan.nextInt(); // порядковый номер
 int f1 = 1;
 int f2 = 1;
 int f3 = 0;
 int itter = 2;
 while(itter <= n + 1){
 System.out.print(f1 + " ");
 f3 = f1 + f2;
 f1 = f2;
 f2 = f3;
 itter++;
        }
         */
        /*
 int n = scan.nextInt(); // порядковый номер
 int f1 = 1;
 int f2 = 1;
 int f3 = 0;
 for (int i = 0; i < n; i++) {
 System.out.print(f1 + " ");
 f3 = f1 + f2;
 f1 = f2;
 f2 = f3;
        }
         */
        /*
 int n = scan.nextInt();
 int temp = n;
 int sum = 0;
 while(temp > 0){
 sum += temp % 10;
 temp /= 10;
        }
 System.out.println(sum);
 temp = n;
 sum = 0;
 for (int i = 0; i % 10 < temp * 10; i++) {
 sum += temp % 10;
            temp /= 10;
        }
        System.out.println(sum);
         */
        /*
        String line = scan.nextLine();
        line += " ";
        int index = 0;
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == ' '){
                String temp = line.substring(index, i);
                boolean f = true;
                for (int j = 0; j < temp.length() / 2 + 1; j++) {
                    if (temp.charAt(j) != temp.charAt(temp.length() - 1 - j)){
                        f = false;
                        break;
                    }
                }
                if(f){
                    count++;
                }
 index = i + 1;
 f = true;
            }
        }
 System.out.println(count);
         */
        /*
 String line = scan.nextLine();
 String[] lines = line.split(" ");
 int count = 0;
 for (int i = 0; i < lines.length; i++) {
 boolean f = true;
 for (int j = 0; j < lines[i].length(); j++) {
 if (lines[i].charAt(j) != lines[i].charAt(lines[i].length() - 1 - j)){
 f = false;
 break;
                }
            }
 if(f) {
 count++;
            }
        }
 System.out.println(count);
         */
        /*
 String line = scan.nextLine();
 String[] lines = line.split(":");
 int hour = Integer.parseInt(lines[0]);
 int count = 1;
 for (int i = 0; i < hour; i++) {
 if (i < 6){
 System.out.println("Время 0" + i + ":" + i + "0 - Всего случаев: " + count);
 count++;
 }else{
 break;
            }
        }

 //долго ломал себе мозг...)
 if(hour >= 10) { //
 for (int i = 10; i <= hour && i <= 15; i++) {
 String temp = "" + lines[1].charAt(1) + lines[1].charAt(0);
                int minute = Integer.parseInt(temp);
                if(minute == i){
                    System.out.println("Время " + i + ":" + lines[1] + " - Всего случаев: " + count);
                }else {
                    String min = "" + Integer.toString(i).charAt(1) + Integer.toString(i).charAt(0);
                    System.out.println("Время " + i + ":" + min + " - Всего случаев: " + count);
                }
                count++;
            }
        }
        if(hour >= 15){
            for (int i = 20; i <= hour; i++) {
                String temp = "" + lines[1].charAt(1) + lines[1].charAt(0);
                int minute = Integer.parseInt(temp);
                if(minute == i){
                    System.out.println("Время " + i + ":" + lines[1] + " - Всего случаев: " + count);
                }else {
                    String min = "" + Integer.toString(i).charAt(1) + Integer.toString(i).charAt(0);
 System.out.println("Время " + i + ":" + min + " - Всего случаев: " + count);
                }
 count++;
            }
        }
         */
        /*
 int n = scan.nextInt();
 int answer = 0;
 int itter = 1;
 while(n > 0){
 answer += itter * (n % 2);
 itter *= 10;
 n /= 2;
        }
 System.out.println(answer);
         */
    }

    public static int rec(int n){  //Задача 7(Рекурсия)
        ((n == 0){
            return 0;
        }
        return n % 2 + rec(n / 2) * 10;
    }

    public static int pow(int st){
        ((st == 0){
            return  1;
        }
        * 5 * pow(st 1 );
    }
}