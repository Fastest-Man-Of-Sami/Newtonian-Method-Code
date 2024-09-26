
public class Main {
    public static void main(String[] args) {
        double x = 0.00007;
        double[] xs = new double[1500];
        xs[0] = x;
        boolean flag = false;
        for(int i = 0; i < 1499; i++){
            xs[i+1]=xs[i]-(Math.cos(2*xs[i])*Math.cos(2*xs[i])-Math.pow(xs[i],2))/getDerivative(xs[i]);
            if(Math.abs(xs[i+1]-xs[i])<10e-10){
                System.out.println("The Newtonian Method converges towards "+xs[i+1]);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("The Newtonian Method does not converge within 1500 iterations.");
        }
    }
    public static double getDerivative(double x) {
        return -2*x-Math.sin(4*x);
    }
}