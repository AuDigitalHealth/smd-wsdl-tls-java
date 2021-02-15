
package au.net.electronichealth.ns.smd.tls.v2010;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.3-b01-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SealedMessageDeliveryService", targetNamespace = "http://ns.electronichealth.net.au/smd/svc/SealedMessageDelivery/2010", wsdlLocation = "smd-SealedMessageDelivery-TLS-2010.wsdl")
public class SealedMessageDeliveryService
    extends Service
{

    private final static URL SEALEDMESSAGEDELIVERYSERVICE_WSDL_LOCATION;
    private final static WebServiceException SEALEDMESSAGEDELIVERYSERVICE_EXCEPTION;
    private final static QName SEALEDMESSAGEDELIVERYSERVICE_QNAME = new QName("http://ns.electronichealth.net.au/smd/svc/SealedMessageDelivery/2010", "SealedMessageDeliveryService");

    static {
        SEALEDMESSAGEDELIVERYSERVICE_WSDL_LOCATION = au.net.electronichealth.ns.smd.tls.v2010.SealedMessageDeliveryService.class.getResource("smd-SealedMessageDelivery-TLS-2010.wsdl");
        WebServiceException e = null;
        if (SEALEDMESSAGEDELIVERYSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'smd-SealedMessageDelivery-TLS-2010.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        SEALEDMESSAGEDELIVERYSERVICE_EXCEPTION = e;
    }

    public SealedMessageDeliveryService() {
        super(__getWsdlLocation(), SEALEDMESSAGEDELIVERYSERVICE_QNAME);
    }

    public SealedMessageDeliveryService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SEALEDMESSAGEDELIVERYSERVICE_QNAME, features);
    }

    public SealedMessageDeliveryService(URL wsdlLocation) {
        super(wsdlLocation, SEALEDMESSAGEDELIVERYSERVICE_QNAME);
    }

    public SealedMessageDeliveryService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SEALEDMESSAGEDELIVERYSERVICE_QNAME, features);
    }

    public SealedMessageDeliveryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SealedMessageDeliveryService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SealedMessageDelivery
     */
    @WebEndpoint(name = "SealedMessageDelivery")
    public SealedMessageDelivery getSealedMessageDelivery() {
        return super.getPort(new QName("http://ns.electronichealth.net.au/smd/svc/SealedMessageDelivery/2010", "SealedMessageDelivery"), SealedMessageDelivery.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SealedMessageDelivery
     */
    @WebEndpoint(name = "SealedMessageDelivery")
    public SealedMessageDelivery getSealedMessageDelivery(WebServiceFeature... features) {
        return super.getPort(new QName("http://ns.electronichealth.net.au/smd/svc/SealedMessageDelivery/2010", "SealedMessageDelivery"), SealedMessageDelivery.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SEALEDMESSAGEDELIVERYSERVICE_EXCEPTION!= null) {
            throw SEALEDMESSAGEDELIVERYSERVICE_EXCEPTION;
        }
        return SEALEDMESSAGEDELIVERYSERVICE_WSDL_LOCATION;
    }

}