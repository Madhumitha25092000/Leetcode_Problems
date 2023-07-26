class Solution {
    static int subtractProductAndSum(int n) {
        int pdt=1,rem=0,sum=0,temp=0,diff=0;
        while(n!=0){
            rem=n%10;
            pdt=pdt*rem;
            sum=sum+rem;
            n=n/10;
        }
        diff=pdt-sum;
        return diff;
    }
    public static void main(String args[]){
        int a=subtractProductAndSum(234);
        System.out.println(a);
    }
}