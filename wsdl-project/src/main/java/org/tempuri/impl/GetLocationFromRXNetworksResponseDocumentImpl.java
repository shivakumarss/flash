/*
 * An XML document type.
 * Localname: GetLocationFromRXNetworksResponse
 * Namespace: http://tempuri.org/
 * Java type: org.tempuri.GetLocationFromRXNetworksResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.tempuri.impl;
/**
 * A document containing one GetLocationFromRXNetworksResponse(@http://tempuri.org/) element.
 *
 * This is a complex type.
 */
public class GetLocationFromRXNetworksResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.tempuri.GetLocationFromRXNetworksResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLocationFromRXNetworksResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLOCATIONFROMRXNETWORKSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://tempuri.org/", "GetLocationFromRXNetworksResponse");
    
    
    /**
     * Gets the "GetLocationFromRXNetworksResponse" element
     */
    public org.tempuri.GetLocationFromRXNetworksResponseDocument.GetLocationFromRXNetworksResponse getGetLocationFromRXNetworksResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.tempuri.GetLocationFromRXNetworksResponseDocument.GetLocationFromRXNetworksResponse target = null;
            target = (org.tempuri.GetLocationFromRXNetworksResponseDocument.GetLocationFromRXNetworksResponse)get_store().find_element_user(GETLOCATIONFROMRXNETWORKSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLocationFromRXNetworksResponse" element
     */
    public void setGetLocationFromRXNetworksResponse(org.tempuri.GetLocationFromRXNetworksResponseDocument.GetLocationFromRXNetworksResponse getLocationFromRXNetworksResponse)
    {
        generatedSetterHelperImpl(getLocationFromRXNetworksResponse, GETLOCATIONFROMRXNETWORKSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetLocationFromRXNetworksResponse" element
     */
    public org.tempuri.GetLocationFromRXNetworksResponseDocument.GetLocationFromRXNetworksResponse addNewGetLocationFromRXNetworksResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.tempuri.GetLocationFromRXNetworksResponseDocument.GetLocationFromRXNetworksResponse target = null;
            target = (org.tempuri.GetLocationFromRXNetworksResponseDocument.GetLocationFromRXNetworksResponse)get_store().add_element_user(GETLOCATIONFROMRXNETWORKSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetLocationFromRXNetworksResponse(@http://tempuri.org/).
     *
     * This is a complex type.
     */
    public static class GetLocationFromRXNetworksResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.tempuri.GetLocationFromRXNetworksResponseDocument.GetLocationFromRXNetworksResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetLocationFromRXNetworksResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLOCATIONFROMRXNETWORKSRESULT$0 = 
            new javax.xml.namespace.QName("http://tempuri.org/", "GetLocationFromRXNetworksResult");
        
        
        /**
         * Gets the "GetLocationFromRXNetworksResult" element
         */
        public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult getGetLocationFromRXNetworksResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().find_element_user(GETLOCATIONFROMRXNETWORKSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetLocationFromRXNetworksResult" element
         */
        public boolean isNilGetLocationFromRXNetworksResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().find_element_user(GETLOCATIONFROMRXNETWORKSRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetLocationFromRXNetworksResult" element
         */
        public boolean isSetGetLocationFromRXNetworksResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETLOCATIONFROMRXNETWORKSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetLocationFromRXNetworksResult" element
         */
        public void setGetLocationFromRXNetworksResult(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult getLocationFromRXNetworksResult)
        {
            generatedSetterHelperImpl(getLocationFromRXNetworksResult, GETLOCATIONFROMRXNETWORKSRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetLocationFromRXNetworksResult" element
         */
        public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult addNewGetLocationFromRXNetworksResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().add_element_user(GETLOCATIONFROMRXNETWORKSRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetLocationFromRXNetworksResult" element
         */
        public void setNilGetLocationFromRXNetworksResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().find_element_user(GETLOCATIONFROMRXNETWORKSRESULT$0, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().add_element_user(GETLOCATIONFROMRXNETWORKSRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetLocationFromRXNetworksResult" element
         */
        public void unsetGetLocationFromRXNetworksResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETLOCATIONFROMRXNETWORKSRESULT$0, 0);
            }
        }
    }
}
