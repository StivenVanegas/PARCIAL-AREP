
package edu.escuelaing.arem.sparkserver;

import edu.escuelaing.arem.calculator.TrigCalculator;
import spark.Request;
import spark.Response;
import static spark.Spark.get;
import static spark.Spark.port;
import org.json.*;
/**
 *
 * @author StivenVanegas
 */
public class SparkWeb {
    public static void main(String[] args) {
            port(getPort());
            get("/calculator", (req, res) -> calculatorPage(req, res));
    }
    
    private static JSONObject calculatorPage(Request req, Response res) {
        String value = req.queryParams("value");
        String op = req.queryParams("op");
        JSONObject json = new JSONObject();
        json.put("operation",op);
        json.put("value",value);
        
        if(op.equals("sin")){
            double r = TrigCalculator.sin(Double.parseDouble(value));
            json.put("result",r);
        } else if(op.equals("cos")){
            double r = TrigCalculator.cos(Double.parseDouble(value));
            json.put("result",r);
        } else if(op.equals("tan")){
            double r = TrigCalculator.tan(Double.parseDouble(value));
            json.put("result",r);
        } else{
            json.put("result","");
        } 
        return json;
    }
    
    public static int getPort(){
        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }


}
