/*
 * An XML document type.
 * Localname: GetLocationFromCombainResponse
 * Namespace: http://tempuri.org/
 * Java type: org.tempuri.GetLocationFromCombainResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.tempuri.impl;
/**
 * A document containing one GetLocationFromCombainResponse(@http://tempuri.org/) element.
 *
 * This is a complex type.
 */
public class GetLocationFromCombainResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.tempuri.GetLocationFromCombainResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLocationFromCombainResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLOCATIONFROMCOMBAINRESPONSE$0 = 
        new javax.xml.namespace.QName("http://tempuri.org/", "GetLocationFromCombainResponse");
    
    
    /**
     * Gets the "GetLocationFromCombainResponse" element
     */
    public org.tempuri.GetLocationFromCombainResponseDocument.GetLocationFromCombainResponse getGetLocationFromCombainResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.tempuri.GetLocationFromCombainResponseDocument.GetLocationFromCombainResponse target = null;
            target = (org.tempuri.GetLocationFromCombainResponseDocument.GetLocationFromCombainResponse)get_store().find_element_user(GETLOCATIONFROMCOMBAINRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLocationFromCombainResponse" element
     */
    public void setGetLocationFromCombainResponse(org.tempuri.GetLocationFromCombainResponseDocument.GetLocationFromCombainResponse getLocationFromCombainResponse)
    {
        generatedSetterHelperImpl(getLocationFromCombainResponse, GETLOCATIONFROMCOMBAINRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetLocationFromCombainResponse" element
     */
    public org.tempuri.GetLocationFromCombainResponseDocument.GetLocationFromCombainResponse addNewGetLocationFromCombainResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.tempuri.GetLocationFromCombainResponseDocument.GetLocationFromCombainResponse target = null;
            target = (org.tempuri.GetLocationFromCombainResponseDocument.GetLocationFromCombainResponse)get_store().add_element_user(GETLOCATIONFROMCOMBAINRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetLocationFromCombainResponse(@http://tempuri.org/).
     *
     * This is a complex type.
     */
    public static class GetLocationFromCombainResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.tempuri.GetLocationFromCombainResponseDocument.GetLocationFromCombainResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetLocationFromCombainResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLOCATIONFROMCOMBAINRESULT$0 = 
            new javax.xml.namespace.QName("http://tempuri.org/", "GetLocationFromCombainResult");
        
        
        /**
         * Gets the "GetLocationFromCombainResult" element
         */
        public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult getGetLocationFromCombainResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().find_element_user(GETLOCATIONFROMCOMBAINRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetLocationFromCombainResult" element
         */
        public boolean isNilGetLocationFromCombainResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().find_element_user(GETLOCATIONFROMCOMBAINRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetLocationFromCombainResult" element
         */
        public boolean isSetGetLocationFromCombainResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETLOCATIONFROMCOMBAINRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetLocationFromCombainResult" element
         */
        public void setGetLocationFromCombainResult(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult getLocationFromCombainResult)
        {
            generatedSetterHelperImpl(getLocationFromCombainResult, GETLOCATIONFROMCOMBAINRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetLocationFromCombainResult" element
         */
        public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult addNewGetLocationFromCombainResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().add_element_user(GETLOCATIONFROMCOMBAINRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetLocationFromCombainResult" element
         */
        public void setNilGetLocationFromCombainResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().find_element_user(GETLOCATIONFROMCOMBAINRESULT$0, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().add_element_user(GETLOCATIONFROMCOMBAINRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetLocationFromCombainResult" element
         */
        public void unsetGetLocationFromCombainResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETLOCATIONFROMCOMBAINRESULT$0, 0);
            }
        }
    }
}
