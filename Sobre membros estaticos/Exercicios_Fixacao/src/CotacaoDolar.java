public class CotacaoDolar {
    
    public static final double IOF = 0.06;
    public static double REAL = 0;
    public static double conversaoDolar(double cot, double dol){
        
        REAL = ((cot*dol)* IOF) + (cot*dol);

        return REAL;

    }
}
