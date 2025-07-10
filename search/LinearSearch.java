package dsa.search;

public class LinearSearch {

    public static void main(String[] args) {

        int [] a={1,2,3,4,5,6,7,8,9,10};
        int b=6;
        for(int i=0;i<a.length;i++){
            if(a[b]==a[i]){
                System.out.println(a[i]);
            }
        }

    }
}
