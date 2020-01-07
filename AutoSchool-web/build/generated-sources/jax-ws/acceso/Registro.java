
package acceso;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "registro", targetNamespace = "http://acceso/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Registro {


    /**
     * 
     * @param materno
     * @param huella
     * @param paterno
     * @param pswd
     * @param usr
     * @param grupo
     * @param nombre
     * @param tipoUsr
     * @param email
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registroUsr", targetNamespace = "http://acceso/", className = "acceso.RegistroUsr")
    @ResponseWrapper(localName = "registroUsrResponse", targetNamespace = "http://acceso/", className = "acceso.RegistroUsrResponse")
    @Action(input = "http://acceso/registro/registroUsrRequest", output = "http://acceso/registro/registroUsrResponse")
    public String registroUsr(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "paterno", targetNamespace = "")
        String paterno,
        @WebParam(name = "materno", targetNamespace = "")
        String materno,
        @WebParam(name = "huella", targetNamespace = "")
        String huella,
        @WebParam(name = "usr", targetNamespace = "")
        String usr,
        @WebParam(name = "pswd", targetNamespace = "")
        String pswd,
        @WebParam(name = "tipoUsr", targetNamespace = "")
        String tipoUsr,
        @WebParam(name = "grupo", targetNamespace = "")
        String grupo,
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getxId", targetNamespace = "http://acceso/", className = "acceso.GetxId")
    @ResponseWrapper(localName = "getxIdResponse", targetNamespace = "http://acceso/", className = "acceso.GetxIdResponse")
    @Action(input = "http://acceso/registro/getxIdRequest", output = "http://acceso/registro/getxIdResponse")
    public String getxId();

}
