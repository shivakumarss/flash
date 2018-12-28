/*
 * An XML document type.
 * Localname: GetLocationFromOpenCellID
 * Namespace: http://tempuri.org/
 * Java type: org.tempuri.GetLocationFromOpenCellIDDocument
 *
 * Automatically generated - do not modify.
 */
package org.tempuri.impl;
/**
 * A document containing one GetLocationFromOpenCellID(@http://tempuri.org/) element.
 *
 * This is a complex type.
 */
public class GetLocationFromOpenCellIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.tempuri.GetLocationFromOpenCellIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLocationFromOpenCellIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLOCATIONFROMOPENCELLID$0 = 
        new javax.xml.namespace.QName("http://tempuri.org/", "GetLocationFromOpenCellID");
    
    
    /**
     * Gets the "GetLocationFromOpenCellID" element
     */
    public org.tempuri.GetLocationFromOpenCellIDDocument.GetLocationFromOpenCellID getGetLocationFromOpenCellID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.tempuri.GetLocationFromOpenCellIDDocument.GetLocationFromOpenCellID target = null;
            target = (org.tempuri.GetLocationFromOpenCellIDDocument.GetLocationFromOpenCellID)get_store().find_element_user(GETLOCATIONFROMOPENCELLID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLocationFromOpenCellID" element
     */
    public void setGetLocationFromOpenCellID(org.tempuri.GetLocationFromOpenCellIDDocument.GetLocationFromOpenCellID getLocationFromOpenCellID)
    {
        generatedSetterHelperImpl(getLocationFromOpenCellID, GETLOCATIONFROMOPENCELLID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetLocationFromOpenCellID" element
     */
    public org.tempuri.GetLocationFromOpenCellIDDocument.GetLocationFromOpenCellID addNewGetLocationFromOpenCellID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.tempuri.GetLocationFromOpenCellIDDocument.GetLocationFromOpenCellID target = null;
            target = (org.tempuri.GetLocationFromOpenCellIDDocument.GetLocationFromOpenCellID)get_store().add_element_user(GETLOCATIONFROMOPENCELLID$0);
            return target;
        }
    }
    /**
     * An XML GetLocationFromOpenCellID(@http://tempuri.org/).
     *
     * This is a complex type.
     */
    public static class GetLocationFromOpenCellIDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.tempuri.GetLocationFromOpenCellIDDocument.GetLocationFromOpenCellID
    {
        private static final long serialVersionUID = 1L;
        
        public GetLocationFromOpenCellIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROVIDERID$0 = 
            new javax.xml.namespace.QName("http://tempuri.org/", "providerID");
        private static final javax.xml.namespace.QName BASEURL$2 = 
            new javax.xml.namespace.QName("http://tempuri.org/", "baseUrl");
        private static final javax.xml.namespace.QName APIKEY$4 = 
            new javax.xml.namespace.QName("http://tempuri.org/", "apiKey");
        private static final javax.xml.namespace.QName REQUEST$6 = 
            new javax.xml.namespace.QName("http://tempuri.org/", "request");
        
        
        /**
         * Gets the "providerID" element
         */
        public int getProviderID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDERID$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "providerID" element
         */
        public org.apache.xmlbeans.XmlInt xgetProviderID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PROVIDERID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "providerID" element
         */
        public boolean isSetProviderID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROVIDERID$0) != 0;
            }
        }
        
        /**
         * Sets the "providerID" element
         */
        public void setProviderID(int providerID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVIDERID$0);
                }
                target.setIntValue(providerID);
            }
        }
        
        /**
         * Sets (as xml) the "providerID" element
         */
        public void xsetProviderID(org.apache.xmlbeans.XmlInt providerID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PROVIDERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PROVIDERID$0);
                }
                target.set(providerID);
            }
        }
        
        /**
         * Unsets the "providerID" element
         */
        public void unsetProviderID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROVIDERID$0, 0);
            }
        }
        
        /**
         * Gets the "baseUrl" element
         */
        public java.lang.String getBaseUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASEURL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "baseUrl" element
         */
        public org.apache.xmlbeans.XmlString xgetBaseUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BASEURL$2, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "baseUrl" element
         */
        public boolean isNilBaseUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BASEURL$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "baseUrl" element
         */
        public boolean isSetBaseUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BASEURL$2) != 0;
            }
        }
        
        /**
         * Sets the "baseUrl" element
         */
        public void setBaseUrl(java.lang.String baseUrl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASEURL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASEURL$2);
                }
                target.setStringValue(baseUrl);
            }
        }
        
        /**
         * Sets (as xml) the "baseUrl" element
         */
        public void xsetBaseUrl(org.apache.xmlbeans.XmlString baseUrl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BASEURL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BASEURL$2);
                }
                target.set(baseUrl);
            }
        }
        
        /**
         * Nils the "baseUrl" element
         */
        public void setNilBaseUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BASEURL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BASEURL$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "baseUrl" element
         */
        public void unsetBaseUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BASEURL$2, 0);
            }
        }
        
        /**
         * Gets the "apiKey" element
         */
        public java.lang.String getApiKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APIKEY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "apiKey" element
         */
        public org.apache.xmlbeans.XmlString xgetApiKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APIKEY$4, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "apiKey" element
         */
        public boolean isNilApiKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APIKEY$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "apiKey" element
         */
        public boolean isSetApiKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APIKEY$4) != 0;
            }
        }
        
        /**
         * Sets the "apiKey" element
         */
        public void setApiKey(java.lang.String apiKey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APIKEY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APIKEY$4);
                }
                target.setStringValue(apiKey);
            }
        }
        
        /**
         * Sets (as xml) the "apiKey" element
         */
        public void xsetApiKey(org.apache.xmlbeans.XmlString apiKey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APIKEY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APIKEY$4);
                }
                target.set(apiKey);
            }
        }
        
        /**
         * Nils the "apiKey" element
         */
        public void setNilApiKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APIKEY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APIKEY$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "apiKey" element
         */
        public void unsetApiKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APIKEY$4, 0);
            }
        }
        
        /**
         * Gets the "request" element
         */
        public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments)get_store().find_element_user(REQUEST$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "request" element
         */
        public boolean isNilRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments)get_store().find_element_user(REQUEST$6, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "request" element
         */
        public boolean isSetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUEST$6) != 0;
            }
        }
        
        /**
         * Sets the "request" element
         */
        public void setRequest(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments request)
        {
            generatedSetterHelperImpl(request, REQUEST$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "request" element
         */
        public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments)get_store().add_element_user(REQUEST$6);
                return target;
            }
        }
        
        /**
         * Nils the "request" element
         */
        public void setNilRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments target = null;
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments)get_store().find_element_user(REQUEST$6, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments)get_store().add_element_user(REQUEST$6);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "request" element
         */
        public void unsetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUEST$6, 0);
            }
        }
    }
}
