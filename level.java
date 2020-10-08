package level;
import java.io.IOException;
import static java.lang.Thread.*;

public class level extends Thread{

    public static void level0() {
    System.out.println("hello,world");
    }

    public static void level1(int num){
        int real_num=num%24;

        if(real_num>=7&&real_num<=18)
            System.out.println("张涛姐姐应该回复学弟了");
        else System.out.println("张涛姐姐应该回复学妹了");
    }
    public static void level2() {
        for(int i=100;i<1000;i++)
        {
            if(Math.pow(i%10,3)+Math.pow((i/10)%10,3)+Math.pow((i/100)%10,3)==i)
                System.out.println(i);
        }
    }
    public static void chooseit(int [][] arr1,int[][] arr2){
        int i=0,j=0;
        SlpThread[] SlpThread = new SlpThread[arr1.length+arr2.length];
        for(;i<arr1.length;i++) {
            SlpThread[i]= new SlpThread(arr1[i]);
        }
        for(j=i;j<arr2.length+i;j++) {
            SlpThread[j] = new SlpThread(arr2[j-i]);
        }
        for (int k = 0; k <j;k++)
            {
                SlpThread[k].start();
                //start every thread
            }
        }
    public static void level3() {
        int 哲哲姐姐[][]={{24, 8}, {35, 9}, {15, 10}, {17, 8}, {20, 7}, {49, 14}, {50, 16}, {98, 16}};
        int 天齐姐姐[][]={{3, 8}, {5, 9}, {2, 17}, {45, 8}, {13, 7}, {99, 14}, {175, 16}, {151, 99999}};
        chooseit(哲哲姐姐,天齐姐姐);
    }
    public static void level4() {

//u make the circle at the 4Q->(x,y)
//(x-r)^2+(y-r)^2=r^2
//x^2-2rx+r^2+y^2-2ry+r^2=r^2
//Flip y:
        String str1="oO0";
        String str2="░";
        String str3="\n";
        String str4="0Oo";
drawcircle(true);
        //mid
        for (int k = 0; k < 3; k++)
            System.out.print(str1);
        for (int o = 0; o < 97; o++)
            System.out.print(str2);
        System.out.print(str4);
        System.out.print(str3);
        //downside
       drawcircle(false);
       baodachutiren();
       System.out.println("想打出题人");
    }
    public static void drawcircle(boolean isupside) {
        int start=0;
        int end=0;
        String str1="oO0";
        String str2="░";
        String str3="\n";
        String str4="0Oo";
        int r=50;
        if(isupside)
            end=r;
        else {start=r;end=2*r+1;}

        for (int y = start; y < end; y++) {
            int x = 0;
            for (x = 0; (x - r) * (x - r) + (y - r) * (y - r) > r * r; x++)
                System.out.print(" ");
            for (int k = 0; k < 3; k++, x++)
                System.out.print(str1);
            for (; (x - r) * (x - r) + (y - r) * (y - r) < r * r && x != r; x++)
                System.out.print(" ");
            if (y != 0)
                System.out.print(str2);
            x++;
            for (; (x - r) * (x - r) + (y - r) * (y - r) < r * r; x++)
                System.out.print(" ");
            for (int k = 0; k < 1; k++)
                System.out.print(str4);
            System.out.print(str3);

        }
    }
    public static void baodachutiren(){
        System.out.printf("\n" +
                "                        _    ,-,    _\n" +
                "                 ,--, /: :\\/': :`\\/: :\\\n" +
                "                |`;  ' `,'   `.;    `: |\n" +
                "                |    |     |  '  |     |.\n" +
                "                | :  |     | 肖白 |     ||\n" +
                "                | :. |  :  |  :  |  :  | \\\n" +
                "                 \\__/: :.. : :.. | :.. |  )\n" +
                "                      `---',\\___/,\\___/ /'\n" +
                "                           `==._ .. . /'\n" +
                "                                `-::-'");
    }
}
    class SlpThread extends Thread{
    int[] num={};
    public SlpThread(int[] num){
        this.num =num;
    }
    public void run(){

            try {
                sleep(num[0]*10);
            } catch (InterruptedException e) {
                System.out.print("? ? ?");
            }
            System.out.printf("%d,%d\n",num[0],num[1]);
        }
    }
