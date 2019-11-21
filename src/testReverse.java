public class testReverse {
    public static void main(String[] args) {
        int result = reverse(123456);
        System.out.println(result);
    }

    public static int reverse(int num){
        int a;
        int count=0;
        int total=0;
        int[] temp =new int[10];
        while (num != 0){
            a=num%10;

            temp[count]=a;
            num=num/10;
            count++;
        }



        for (int i=0;i<count;i++){
//            System.out.print(temp[i]);
            total = total*10+temp[i];
        }

        System.out.print("\n");

        return total;
    }
}
