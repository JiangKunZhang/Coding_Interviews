package $10_1;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/21 23:22
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class $10I {
    public int Fibonacci(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;
        for(int i = 2; i <= n;i++) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
        return f2;
    }
}