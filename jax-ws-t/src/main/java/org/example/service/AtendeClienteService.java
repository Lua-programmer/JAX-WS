
package org.example.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "AtendeClienteService", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", wsdlLocation = "https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl")
public class AtendeClienteService
    extends Service
{

    private final static URL ATENDECLIENTESERVICE_WSDL_LOCATION;
    private final static WebServiceException ATENDECLIENTESERVICE_EXCEPTION;
    private final static QName ATENDECLIENTESERVICE_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClienteService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ATENDECLIENTESERVICE_WSDL_LOCATION = url;
        ATENDECLIENTESERVICE_EXCEPTION = e;
    }

    public AtendeClienteService() {
        super(__getWsdlLocation(), ATENDECLIENTESERVICE_QNAME);
    }

    public AtendeClienteService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ATENDECLIENTESERVICE_QNAME, features);
    }

    public AtendeClienteService(URL wsdlLocation) {
        super(wsdlLocation, ATENDECLIENTESERVICE_QNAME);
    }

    public AtendeClienteService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ATENDECLIENTESERVICE_QNAME, features);
    }

    public AtendeClienteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AtendeClienteService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AtendeCliente
     */
    @WebEndpoint(name = "AtendeClientePort")
    public AtendeCliente getAtendeClientePort() {
        return super.getPort(new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClientePort"), AtendeCliente.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AtendeCliente
     */
    @WebEndpoint(name = "AtendeClientePort")
    public AtendeCliente getAtendeClientePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClientePort"), AtendeCliente.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ATENDECLIENTESERVICE_EXCEPTION!= null) {
            throw ATENDECLIENTESERVICE_EXCEPTION;
        }
        return ATENDECLIENTESERVICE_WSDL_LOCATION;
    }

}
