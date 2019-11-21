public class testSplit {
    public static void main(String[] args) {
        String source = "z:h,a:n-g: la,o-: ge: ni:u, b:an";
        String[] ss = split(source,',');

        for (String s:ss) {
            System.out.print(s);
        }
    }

    public static String[] split(String source,char delimiter){
        String[] temp = new String[source.length()];
        String fgf = String.valueOf(delimiter);
        for (int i=0;i<source.length();i++){
            temp[i]=source.substring(i,i+1);
        }

        int t=0;
        String tempArr[] = new String[temp.length];
        for (int i=0;i<temp.length;i++){
            boolean isTrue = true;

            if(fgf.equals(temp[i])){
                isTrue = false;
            }
            System.err.print(temp[i]);
            if(isTrue){
                tempArr[t] = temp[i];
                t++;
            }
        }

        System.out.println("\n");

        String[] resultArray = new String[t];
        System.arraycopy(tempArr, 0, resultArray, 0, t);

        return resultArray;
    }
}
