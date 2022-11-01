package example;

import example.client.calcuTaxServiceLocator;
import example.client.CalcuTaxPortType;

public class FirstTest {
    public static void main(String[] argv) {
        try {
            calcuTaxServiceLocator locator = new calcuTaxServiceLocator();
            CalcuTaxPortType service = locator.getCalTax();
            System.out.println(service.calTax("12000"));
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}