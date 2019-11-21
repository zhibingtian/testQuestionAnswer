public class testSum {
    public static void main(String[] args) {
        int result = sum(6);
        System.out.println(result);
    }

    public static int sum(int input){
        //找到累加的数
        int num=0;
        //求和
        int total=0;
        //临时数组的索引
        int t=0;
        //临时数组，用来存放需要累加的数
        int[] count =new int[input];
        for (int i=0;i<input;i++ ){
            num = num *10+input;
            count[t] = num;
            t++;
            System.out.print(num+" ");
        }

        for (int i=0;i<count.length;i++){
            total += count[i];
        }

        System.out.print("\n");

        return total;
    }
}
