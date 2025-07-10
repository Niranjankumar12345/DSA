package dsa;

public class FindSum {

    public static void main(String[] args) {

        FindSum findsum=new FindSum();

        long start=System.currentTimeMillis();
        System.out.println(findsum.findSumUsingFormula(99999999));
        long end=System.currentTimeMillis();

        System.out.println("Time Take for MAth Funtion:"+(end-start));

        start=System.currentTimeMillis();
        System.out.println(findsum.findSumUSingForLoop(99999999));
        end=System.currentTimeMillis();

        System.out.println("Time Take for Math Function :"+(end-start));

    }
    
    public int findSumUsingFormula(int n){
        return n*(n+1)/2;
    }

    public  int findSumUSingForLoop(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }

}
