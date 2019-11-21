public class testReSubStr {
    public static void main(String[] args) {
        String result = reSubStr("aaaabbccccccddddaaaiilloooooovvvvvvveeeeuu");
        System.out.println(result);
    }
    private static String reSubStr(String str){
        /**
         * 设置变量
         * start:开始
         * end:结束
         * maxStart:最长子串开始位置
         * maxEnd：最长子串结束位置
         */
        int start=0,end=1,maxStart=0,maxEnd=1;
        char[] chars = str.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            //判断如果不相等，则计算器长度
            if(chars[i-1]!=chars[i]) {
                //设置其重复子串结束位置
                end=i;
                //子串长度
                int len = end - start;
                //子串长度大于现有的最大子串长度
                if (len > (maxEnd - maxStart)) {
                    //则进行赋值
                    maxStart = start;
                    maxEnd = end;
                }
                //开始截取位置为end结束位置
                start = end;
            }
        }
        //截取字符串
        return str.substring(maxStart,maxEnd);
    }
}
