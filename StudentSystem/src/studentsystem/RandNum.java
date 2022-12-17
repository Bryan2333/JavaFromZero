package studentsystem;

import java.util.Scanner;

public class RandNum {
    @SuppressWarnings("SpellCheckingInspection")
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] array = new int[48];
        int num1 = 0, countUsed = 0, countUnused = 1;

        System.out.print("请输入已经抽取过的学号：");
        while(num1 >= 0)
        {
            num1 = in.nextInt();
            array[countUsed] = num1;
            countUsed++;
        }

        for(int i = 0; i < countUsed; i++)
        {
            System.out.println(array[i]);
        }

        /*try
        {
            System.out.print("请输入已经抽取过的学号：");
            while(num1 >= 0)
            {
                num1 = in.nextInt();
                array[countUsed] = num1;
                countUsed++;
            }

            System.out.print("要抽取多少个学号: ");
            int stuIDNum = in.nextInt();

            System.out.print("以下为抽取到的学号：");
            while(countUnused <= stuIDNum)
            {
                int num = 1 + (int)(Math.random() * 48);
                boolean ifused = false;
                for(int j = 0; j < countUsed; j++)
                {
                    if(array[j] == num)
                    {
                        ifused = true;
                        break;
                    }
                }
                if(ifused)
                {
                    continue;
                }
                System.out.print(num + " ");
                countUnused++;
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }*/
        in.close();
    }
}
