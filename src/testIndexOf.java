public class testIndexOf {
    public static void main(String[] args) {
        String source = "welcome to zhanglaoge's home";
        String sub = "laommm";
        int index = indexOf(source,sub);
        System.out.println("index="+index);
//        for (int i=index;i<sub.length()+index;i++){
//            System.out.print(source.charAt(i));
//        }
    }

    public static int indexOf(String source,String sub){
        int index=0;
        int j=0;
        for (int i=0;i<source.length();i++){
            if(source.charAt(i)==sub.charAt(j)){
                j++;
                if (j==sub.length()){
                    index=i-sub.length()+1;
                    break;
                }
            }else {
                index=-1;
                j=0;
            }
        }

        return index;
    }
}
