/**
 * CDLProxyCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.wsdl.myservice;


/**
 *  CDLProxyCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class CDLProxyCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public CDLProxyCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public CDLProxyCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getLocationFromOpenCellID method
     * override this method for handling normal response from getLocationFromOpenCellID operation
     */
    public void receiveResultgetLocationFromOpenCellID(
        org.tempuri.GetLocationFromOpenCellIDResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getLocationFromOpenCellID operation
     */
    public void receiveErrorgetLocationFromOpenCellID(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getLocationFromRXNetworks method
     * override this method for handling normal response from getLocationFromRXNetworks operation
     */
    public void receiveResultgetLocationFromRXNetworks(
        org.tempuri.GetLocationFromRXNetworksResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getLocationFromRXNetworks operation
     */
    public void receiveErrorgetLocationFromRXNetworks(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getLocationFromCombain method
     * override this method for handling normal response from getLocationFromCombain operation
     */
    public void receiveResultgetLocationFromCombain(
        org.tempuri.GetLocationFromCombainResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getLocationFromCombain operation
     */
    public void receiveErrorgetLocationFromCombain(java.lang.Exception e) {
    }
}
