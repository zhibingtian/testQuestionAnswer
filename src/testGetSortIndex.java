public class testGetSortIndex {
    public static void main(String[] args){
        int[] arr = {3,0,1,5,2};
        int[] index= getSortIndex(arr);

//        for (int i:arr){
//            System.err.print(i+" ");
//        }
//
//        System.err.print("\n");

        for (int i:index){
            System.out.print(i+" ");
        }
    }

    /**
     * 完成冒泡排序的方法
     * @param originalArray 待排序数组
     */
    public static int[] getSortIndex(int[] originalArray) {
        int[] index = new int[originalArray.length];

        for (int i=0;i<index.length;i++){
            index[i]=i;
        }

        //冒泡排序(大的上浮)
        for (int i = 0; i < originalArray.length-1; i++) {//需要遍历的轮数(ints.length)
            for (int j = 0; j < originalArray.length-1-i; j++) {
                if (originalArray[j]<originalArray[j+1]) {
                    Swap(originalArray, j, j+1);
                    Swap(index, j, j+1);
                }
            }
        }

        return index;
    }

    /**
     * 完成一趟交换的工作
     * @param a 待排序数组
     * @param i 待交换位置1
     * @param j 待交换位置2
     */
    public static void Swap(int[] a,int i,int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
}
