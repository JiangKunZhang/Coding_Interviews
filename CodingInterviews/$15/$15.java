package $15;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/7 22:02
 * 二进制中1的个数
 */
public class $15 {
    public int NumberOf1(int n) {
        int count = 0;
        int flag = 1;
        while(flag != 0) {
            if((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

}
