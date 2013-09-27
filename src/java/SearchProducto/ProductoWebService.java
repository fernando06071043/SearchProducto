/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchProducto;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;



/**
 *
 * @author TRABAJO
 */
@WebService(serviceName = "ProductoWebService")
public class ProductoWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "search")
    public ArrayList<String> hello(@WebParam(name = "search") String txt) {
        return ProductoClass.getJobOffers(txt);
    }
}
