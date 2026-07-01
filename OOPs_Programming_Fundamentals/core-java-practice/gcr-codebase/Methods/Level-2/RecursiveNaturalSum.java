public class RecursiveNaturalSum {
    static int recursiveSum(int n){
        if(n==1) return 1;
        return n+recursiveSum(n-1);
    }
    static int formulaSum(int n){
        return n*(n+1)/2;
    }
}