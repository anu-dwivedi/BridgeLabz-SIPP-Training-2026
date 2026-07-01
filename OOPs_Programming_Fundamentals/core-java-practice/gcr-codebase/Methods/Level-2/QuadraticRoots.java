public class QuadraticRoots {
    static double[] findRoots(double a,double b,double c){
        double d=b*b-4*a*c;
        if(d<0) return new double[0];
        if(d==0) return new double[]{-b/(2*a)};
        return new double[]{
            (-b+Math.sqrt(d))/(2*a),
            (-b-Math.sqrt(d))/(2*a)
        };
    }
}