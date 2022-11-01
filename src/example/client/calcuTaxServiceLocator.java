/**
 * calcuTaxServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package example.client;

public class calcuTaxServiceLocator extends org.apache.axis.client.Service implements CalcuTaxService {

    public calcuTaxServiceLocator() {
    }

    private final java.lang.String CalTax_address = "http://localhost:8080/services/example/CalTax";

    public java.lang.String getCalTaxWSDDServiceName() {
        // The WSDD service name defaults to the port name.
        return "CalTax";
    }

    public CalcuTaxPortType getCalTax() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalTax_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalTax(endpoint);
    }

    public CalcuTaxPortType getCalTax(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            calcuTaxSoapBindingStub _stub = new calcuTaxSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalTaxWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (CalcuTaxPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                calcuTaxSoapBindingStub _stub = new calcuTaxSoapBindingStub(new java.net.URL(CalTax_address), this);
                _stub.setPortName(getCalTaxWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + serviceEndpointInterface.getName());
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalTax".equals(inputPortName)) {
            return getCalTax();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://example", "CalTaxService");
    }

    private java.util.HashSet<javax.xml.namespace.QName> ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet<>();
            ports.add(new javax.xml.namespace.QName("http://example", "CalTax"));
        }
        return ports.iterator();
    }

}
