package dsa.search;

public class BinarySearch {

    public static void main(String[] args) {

        int[] a={1,2,3,4,5,6,7,8,9,10};
        int b=6;

        int start=0;
        int end=a.length-1;

        while(true){
            int middle=(start+end)/2;

            if(a[middle]==b){
                System.out.println(middle);
                return;
            }
            if(a[middle]>b){
                end=middle-1;
            }
            if(a[middle]<b){
                start=middle+1;
            }

        }

    }
}
