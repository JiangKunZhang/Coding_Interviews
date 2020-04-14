package $8;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/14 22:14
 */
public class $8 {
    public int JumpFloor(int target) {
        if(target == 1) {
            return 1;
        }else if(target == 2) {
            return 2;
        }else{
            return JumpFloor(target - 1) + JumpFloor(target - 2);
        }
    }
}
