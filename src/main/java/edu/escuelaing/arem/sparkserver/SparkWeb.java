
package edu.escuelaing.arem.sparkserver;

import edu.escuelaing.arem.calculator.TrigCalculator;
import spark.Request;
import spark.Response;
import static spark.Spark.get;
import static spark.Spark.port;
/**
 *
 * @author StivenVanegas
 */
public class SparkWeb {
    public static void main(String[] args) {
            port(getPort());
            get("/calculator", (req, res) -> calculatorPage(req, res));
    }
    
    
    
    public static int getPort(){
        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

    private static String calculatorPage(Request req, Response res) {
        String value = req.queryParams("value");
        String op = req.queryParams("op");
        
        if(op.equals("sin")){
            return "SIN";
        } else if(op.equals("cos")){
            return "COS";
        } else if(op.equals("tan")){
         return "TAN"   ;
        } else{
            return "Error";
        }      
    }
}
