/**
 * ModelCustomServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com;


/**
 *  ModelCustomServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class ModelCustomServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public ModelCustomServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public ModelCustomServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getPersonList method
     * override this method for handling normal response from getPersonList operation
     */
    public void receiveResultgetPersonList(
        ModelCustomServiceStub.GetPersonListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPersonList operation
     */
    public void receiveErrorgetPersonList(Exception e) {
    }

    // No methods generated for meps other than in-out

    /**
     * auto generated Axis2 call back method for getBookList method
     * override this method for handling normal response from getBookList operation
     */
    public void receiveResultgetBookList(
        ModelCustomServiceStub.GetBookListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBookList operation
     */
    public void receiveErrorgetBookList(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for findBook method
     * override this method for handling normal response from findBook operation
     */
    public void receiveResultfindBook(
        ModelCustomServiceStub.FindBookResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from findBook operation
     */
    public void receiveErrorfindBook(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOrganisationList method
     * override this method for handling normal response from getOrganisationList operation
     */
    public void receiveResultgetOrganisationList(
        ModelCustomServiceStub.GetOrganisationListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOrganisationList operation
     */
    public void receiveErrorgetOrganisationList(Exception e) {
    }

    // No methods generated for meps other than in-out
}
