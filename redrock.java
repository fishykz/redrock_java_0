import java.util.Scanner;

import level.*;
public class redrock {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.println("input 0,1,2,3,4 to judge:");
            Scanner scan = new Scanner(System.in);
            String s=scan.next();
            switch (s) {
                case "q":
                    return;
                case "0":
                    level.level0();
                    break;
                case "1":
                    System.out.println("现在的时间是(int):\r");
                    int num=scan.nextInt();
                    level.level1(num);
                    break;
                case "2":
                    level.level2();
                    break;
                case "3":
                    level.level3();
                    Thread.sleep(3000);
                    break;
                case  "4":
                    level.level4();
                    break;
                default:
                    System.out.println("爬爬爬,本小白不会");
                    return;
            }
            System.out.printf("level%s is over\n",s);
            System.out.println("input q to quit");
        }
    }
}