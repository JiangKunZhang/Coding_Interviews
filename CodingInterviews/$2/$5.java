package $2;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/7 17:17
 *5.替换空格
 *
 */
public class $2 {
    public String replaceSpace(StringBuffer str) {
        //原位替换，从后往前
        //双指针法，第一个指针起点为原字符串末位，第二个指针起点为新字符串末位

        //1.计算空格数，然后得出替换后字符串长度
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        //如果没有空格，直接返回
        if(count == 0){
            return str.toString();
        }

        int oldIndex =  str.length() - 1;//第一个指针
        int newLength = str.length() + count * 2;//新字符串长度
        int newIndex = newLength - 1;//第二个指针
        str.setLength(newLength);//将原SB扩展到新字符串长度

        //原位扩展
        while(oldIndex >= 0 && oldIndex <= newIndex){
            if(str.charAt(oldIndex) == ' '){
                //如果当前为空格，进行替换
                str.setCharAt(newIndex--,'0');
                str.setCharAt(newIndex--,'2');
                str.setCharAt(newIndex--,'%');
            }else{
                //不为空格，往后移位
                str.setCharAt(newIndex--,str.charAt(oldIndex--));
            }
        }


        return str.toString();
    }
}
