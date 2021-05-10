package slrv2;

/**
 *
 * @author Carlos Chavarría
 */
public class MainSLR {

    public static void main(String[] args) {

        double[] dtsx = {23, 26, 30, 34, 43, 48, 52, 57, 58}; // X: independent variable 
        double[] dtsy = {651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518}; //Y: dependent variable 

        DSX dsx = new DSX(dtsx);
        DSY dsy = new DSY(dtsy);
        Procedure slr = new Procedure(dsx, dsy);
        slr.Prediction();
        
    }
}
