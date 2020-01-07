
package administrador;

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
@WebService(name = "administrador", targetNamespace = "http://administrador/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Administrador {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGrupo", targetNamespace = "http://administrador/", className = "administrador.GetGrupo")
    @ResponseWrapper(localName = "getGrupoResponse", targetNamespace = "http://administrador/", className = "administrador.GetGrupoResponse")
    @Action(input = "http://administrador/administrador/getGrupoRequest", output = "http://administrador/administrador/getGrupoResponse")
    public String getGrupo();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaEquipos", targetNamespace = "http://administrador/", className = "administrador.ConsultaEquipos")
    @ResponseWrapper(localName = "consultaEquiposResponse", targetNamespace = "http://administrador/", className = "administrador.ConsultaEquiposResponse")
    @Action(input = "http://administrador/administrador/consultaEquiposRequest", output = "http://administrador/administrador/consultaEquiposResponse")
    public String consultaEquipos();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTipoUsr", targetNamespace = "http://administrador/", className = "administrador.GetTipoUsr")
    @ResponseWrapper(localName = "getTipoUsrResponse", targetNamespace = "http://administrador/", className = "administrador.GetTipoUsrResponse")
    @Action(input = "http://administrador/administrador/getTipoUsrRequest", output = "http://administrador/administrador/getTipoUsrResponse")
    public String getTipoUsr();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getIdUsr", targetNamespace = "http://administrador/", className = "administrador.GetIdUsr")
    @ResponseWrapper(localName = "getIdUsrResponse", targetNamespace = "http://administrador/", className = "administrador.GetIdUsrResponse")
    @Action(input = "http://administrador/administrador/getIdUsrRequest", output = "http://administrador/administrador/getIdUsrResponse")
    public String getIdUsr();

    /**
     * 
     * @param usr
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarUsr", targetNamespace = "http://administrador/", className = "administrador.BuscarUsr")
    @ResponseWrapper(localName = "buscarUsrResponse", targetNamespace = "http://administrador/", className = "administrador.BuscarUsrResponse")
    @Action(input = "http://administrador/administrador/buscarUsrRequest", output = "http://administrador/administrador/buscarUsrResponse")
    public String buscarUsr(
        @WebParam(name = "usr", targetNamespace = "")
        String usr);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getApeMaterno", targetNamespace = "http://administrador/", className = "administrador.GetApeMaterno")
    @ResponseWrapper(localName = "getApeMaternoResponse", targetNamespace = "http://administrador/", className = "administrador.GetApeMaternoResponse")
    @Action(input = "http://administrador/administrador/getApeMaternoRequest", output = "http://administrador/administrador/getApeMaternoResponse")
    public String getApeMaterno();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsr", targetNamespace = "http://administrador/", className = "administrador.GetUsr")
    @ResponseWrapper(localName = "getUsrResponse", targetNamespace = "http://administrador/", className = "administrador.GetUsrResponse")
    @Action(input = "http://administrador/administrador/getUsrRequest", output = "http://administrador/administrador/getUsrResponse")
    public String getUsr();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getApePaterno", targetNamespace = "http://administrador/", className = "administrador.GetApePaterno")
    @ResponseWrapper(localName = "getApePaternoResponse", targetNamespace = "http://administrador/", className = "administrador.GetApePaternoResponse")
    @Action(input = "http://administrador/administrador/getApePaternoRequest", output = "http://administrador/administrador/getApePaternoResponse")
    public String getApePaterno();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNombre", targetNamespace = "http://administrador/", className = "administrador.GetNombre")
    @ResponseWrapper(localName = "getNombreResponse", targetNamespace = "http://administrador/", className = "administrador.GetNombreResponse")
    @Action(input = "http://administrador/administrador/getNombreRequest", output = "http://administrador/administrador/getNombreResponse")
    public String getNombre();

    /**
     * 
     * @param usr
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTodosLosDatosAlumno", targetNamespace = "http://administrador/", className = "administrador.GetTodosLosDatosAlumno")
    @ResponseWrapper(localName = "getTodosLosDatosAlumnoResponse", targetNamespace = "http://administrador/", className = "administrador.GetTodosLosDatosAlumnoResponse")
    @Action(input = "http://administrador/administrador/getTodosLosDatosAlumnoRequest", output = "http://administrador/administrador/getTodosLosDatosAlumnoResponse")
    public String getTodosLosDatosAlumno(
        @WebParam(name = "usr", targetNamespace = "")
        String usr);

}
