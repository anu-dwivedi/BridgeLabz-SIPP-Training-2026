public class RandomArrayStatistics {
    static int[] generate4DigitRandomArray(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=(int)(Math.random()*9000)+1000;
        return arr;
    }
    static double[] findAverageMinMax(int[] numbers){
        int min=numbers[0],max=numbers[0],sum=0;
        for(int n:numbers){
            sum+=n;
            min=Math.min(min,n);
            max=Math.max(max,n);
        }
        return new double[]{(double)sum/numbers.length,min,max};
    }
}