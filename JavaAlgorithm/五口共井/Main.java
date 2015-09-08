/*
古代数学巨著《九章算数》中有这么一道题叫“五家共井，甲二绠（汲水用的井绳）不足，如（接上）乙一绠；乙三绠不足，如丙一绠；

        丙四绠不足，如丁一绠；丁五绠不足，如戊一绠；戊六绠不足，如甲一绠，皆及。

        意思就是说五家人共用一口井，甲家的绳子用两条不够，还要再用乙家的绳子一条才能打到井水；乙家的绳子用三条不够，还要再用丙家的绳子

        一条才能打到井水；丙家的绳子用四条不够，还要再用丁家的绳子一条才能打到井水；丁家的绳子用五条不够，还要再用戊家的绳子一条才能打

        到井水；戊家的绳子用六条不够，还要再用甲家的绳子一条才能打到井水。

        最后问：井有多深？每家的绳子各有多长？



        分析：同样这套题也是属于不定方程，拿这个题目的目地就是让大家能够在不定方程组这种范畴问题上做到“举一反三”，根据题意

        我们设井深为h，各家分别为a,b,c,d,e，则可以列出如下方程组：

        2a+b=h   ①

        3b+c=h   ②

        4c+d=h   ③

        5d+e=h   ④

        6e+a=h   ⑤
*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a, b, c, d, e;
        boolean flag = false;
        for (a = 1; a < 10000; a++) {
            for (e = 1; e < 10000; e++) {
                if (a % 5 != 0 || e % 4 != 0) {
                    continue;
                }
                d = e + a / 5;
                if (d % 3 != 0) {
                    continue;
                }
                c = d + e / 4;
                if (c % 2 != 0) {
                    continue;
                }
                b = c + d / 3;
                int temp = b + c / 2;
                if (temp == a){
                    int h = 2 * a + b;
                    System.out.println("H: " + h);
                    System.out.println("A: " + a + "|B: " + b + "|C: " + c + "|D: " + d + "|E: " + e);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
    }

}
