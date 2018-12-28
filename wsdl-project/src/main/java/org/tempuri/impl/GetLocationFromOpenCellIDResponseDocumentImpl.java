/*
 * An XML document type.
 * Localname: GetLocationFromOpenCellIDResponse
 * Namespace: http://tempuri.org/
 * Java type: org.tempuri.GetLocationFromOpenCellIDResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.tempuri.impl;
/**
 * A document containing one GetLocationFromOpenCellIDResponse(@http://tempuri.org/) element.
 *
 * This is a complex type.
 */
public class GetLocationFromOpenCellIDResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.tempuri.GetLocationFromOpenCellIDResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLocationFromOpenCellIDResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLOCATIONFROMOPENCELLIDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://tempuri.org/", "GetLocationFromOpenCellIDResponse");
    
    
    /**
     * Gets the "GetLocationFromOpenCellIDResponse" element
     */
    public org.tempuri.GetLocationFromOpenCellIDResponseDocument.GetLocationFromOpenCellIDResponse getGetLocationFromOpenCellIDResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.tempuri.GetLocationFromOpenCellIDResponseDocument.GetLocationFromOpenCellIDResponse target = null;
            target = (org.tempuri.GetLocationFromOpenCellIDResponseDocument.GetLocationFromOpenCellIDResponse)get_store().find_element_user(GETLOCATIONFROMOPENCELLIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLocationFromOpenCellIDResponse" element
     */
    public void setGetLocationFromOpenCellIDResponse(org.tempuri.GetLocationFromOpenCellIDResponseDocument.GetLocationFromOpenCellIDResponse getLocationFromOpenCellIDResponse)
    {
        generatedSetterHelperImpl(getLocationFromOpenCellIDResponse, GETLOCATIONFROMOPENCELLIDRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetLocationFromOpenCellIDResponse" element
     */
    public org.tempuri.GetLocationFromOpenCellIDResponseDocument.GetLocationFromOpenCellIDResponse addNewGetLocationFromOpenCellIDResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.tempuri.GetLocationFromOpenCellIDResponseDocument.GetLocationFromOpenCellIDResponse target = null;
            target = (org.tempuri.GetLocationFromOpenCellIDResponseDocument.GetLocationFromOpenCellIDResponse)get_store().add_element_user(GETLOCATIONFROMOPENCELLIDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetLocationFromOpenCellIDResponse(@http://tempuri.org/).
     *
     * This is a complex type.
     */
    public static class GetLocationFromOpenCellIDResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.tempuri.GetLocationFromOpenCellIDResponseDocument.GetLocationFromOpenCellIDResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetLocationFromOpenCellIDResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLOCATIONFROMOPENCELLIDRESULT$0 = 
            new javax.xml.namespace.QName("http://tempuri.org/", "GetLocationFromOpenCellIDResult");
        
        
        /**
         * Gets the "GetLocationFromOpenCellIDResult" element
         */
        public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult getGetLocationFromOpenCellIDResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().find_element_user(GETLOCATIONFROMOPENCELLIDRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetLocationFromOpenCellIDResult" element
         */
        public boolean isNilGetLocationFromOpenCellIDResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().find_element_user(GETLOCATIONFROMOPENCELLIDRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetLocationFromOpenCellIDResult" element
         */
        public boolean isSetGetLocationFromOpenCellIDResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETLOCATIONFROMOPENCELLIDRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetLocationFromOpenCellIDResult" element
         */
        public void setGetLocationFromOpenCellIDResult(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult getLocationFromOpenCellIDResult)
        {
            generatedSetterHelperImpl(getLocationFromOpenCellIDResult, GETLOCATIONFROMOPENCELLIDRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetLocationFromOpenCellIDResult" element
         */
        public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult addNewGetLocationFromOpenCellIDResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().add_element_user(GETLOCATIONFROMOPENCELLIDRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetLocationFromOpenCellIDResult" element
         */
        public void setNilGetLocationFromOpenCellIDResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().find_element_user(GETLOCATIONFROMOPENCELLIDRESULT$0, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().add_element_user(GETLOCATIONFROMOPENCELLIDRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetLocationFromOpenCellIDResult" element
         */
        public void unsetGetLocationFromOpenCellIDResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETLOCATIONFROMOPENCELLIDRESULT$0, 0);
            }
        }
    }
}
