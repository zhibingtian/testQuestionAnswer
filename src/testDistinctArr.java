public class testDistinctArr {
    public static void main(String[] args) {
        int[] arr = {6,2,2,4,10,7,9,2,8,10,20,5,0,9};

        for (int s : arr) {
            System.out.print(s+" ");
        }
        System.out.println("\n");
        System.out.println("================================");

        int dtArr[] = ifRepeat(arr);

        //打印去重后的数组
        for (int s : dtArr) {
            System.out.print(s+" ");
        }
    }

    /**
     * 去掉数组中重复的元素
     *
     * @param arr
     * @return
     */

    public static int[] ifRepeat(int[] arr) {
        //用来记录去除重复之后的数组长度作为临时数组下标索引
        int t = 0;
        //临时数组
        int tempArr[] = new int[arr.length];
        //遍历原数组
        for (int i = 0; i < arr.length; i++) {
            //标记
            boolean isTrue = true;
            //内层循环将原数组的元素逐个对比
            for (int j = i + 1; j < arr.length; j++) {
                //如果发现有重复元素，改变标记，结束内层循环
                if (arr[i] == arr[j]) {
                    isTrue = false;
                    break;
                }

            }

            if (isTrue){
                tempArr[t] = arr[i];
                t++;
            }
        }

        int[] resultArray = new int[t];
        System.arraycopy(tempArr, 0, resultArray, 0, t);

        return resultArray;
    }
}
