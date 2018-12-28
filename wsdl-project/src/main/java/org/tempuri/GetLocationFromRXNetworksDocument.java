/*
 * An XML document type.
 * Localname: GetLocationFromRXNetworks
 * Namespace: http://tempuri.org/
 * Java type: org.tempuri.GetLocationFromRXNetworksDocument
 *
 * Automatically generated - do not modify.
 */
package org.tempuri;


/**
 * A document containing one GetLocationFromRXNetworks(@http://tempuri.org/) element.
 *
 * This is a complex type.
 */
public interface GetLocationFromRXNetworksDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetLocationFromRXNetworksDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB8C6F9FE6CDD44DBF6D24989B285CB70").resolveHandle("getlocationfromrxnetworks155adoctype");
    
    /**
     * Gets the "GetLocationFromRXNetworks" element
     */
    org.tempuri.GetLocationFromRXNetworksDocument.GetLocationFromRXNetworks getGetLocationFromRXNetworks();
    
    /**
     * Sets the "GetLocationFromRXNetworks" element
     */
    void setGetLocationFromRXNetworks(org.tempuri.GetLocationFromRXNetworksDocument.GetLocationFromRXNetworks getLocationFromRXNetworks);
    
    /**
     * Appends and returns a new empty "GetLocationFromRXNetworks" element
     */
    org.tempuri.GetLocationFromRXNetworksDocument.GetLocationFromRXNetworks addNewGetLocationFromRXNetworks();
    
    /**
     * An XML GetLocationFromRXNetworks(@http://tempuri.org/).
     *
     * This is a complex type.
     */
    public interface GetLocationFromRXNetworks extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetLocationFromRXNetworks.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB8C6F9FE6CDD44DBF6D24989B285CB70").resolveHandle("getlocationfromrxnetworks4146elemtype");
        
        /**
         * Gets the "providerID" element
         */
        int getProviderID();
        
        /**
         * Gets (as xml) the "providerID" element
         */
        org.apache.xmlbeans.XmlInt xgetProviderID();
        
        /**
         * True if has "providerID" element
         */
        boolean isSetProviderID();
        
        /**
         * Sets the "providerID" element
         */
        void setProviderID(int providerID);
        
        /**
         * Sets (as xml) the "providerID" element
         */
        void xsetProviderID(org.apache.xmlbeans.XmlInt providerID);
        
        /**
         * Unsets the "providerID" element
         */
        void unsetProviderID();
        
        /**
         * Gets the "baseUrl" element
         */
        java.lang.String getBaseUrl();
        
        /**
         * Gets (as xml) the "baseUrl" element
         */
        org.apache.xmlbeans.XmlString xgetBaseUrl();
        
        /**
         * Tests for nil "baseUrl" element
         */
        boolean isNilBaseUrl();
        
        /**
         * True if has "baseUrl" element
         */
        boolean isSetBaseUrl();
        
        /**
         * Sets the "baseUrl" element
         */
        void setBaseUrl(java.lang.String baseUrl);
        
        /**
         * Sets (as xml) the "baseUrl" element
         */
        void xsetBaseUrl(org.apache.xmlbeans.XmlString baseUrl);
        
        /**
         * Nils the "baseUrl" element
         */
        void setNilBaseUrl();
        
        /**
         * Unsets the "baseUrl" element
         */
        void unsetBaseUrl();
        
        /**
         * Gets the "apiKey" element
         */
        java.lang.String getApiKey();
        
        /**
         * Gets (as xml) the "apiKey" element
         */
        org.apache.xmlbeans.XmlString xgetApiKey();
        
        /**
         * Tests for nil "apiKey" element
         */
        boolean isNilApiKey();
        
        /**
         * True if has "apiKey" element
         */
        boolean isSetApiKey();
        
        /**
         * Sets the "apiKey" element
         */
        void setApiKey(java.lang.String apiKey);
        
        /**
         * Sets (as xml) the "apiKey" element
         */
        void xsetApiKey(org.apache.xmlbeans.XmlString apiKey);
        
        /**
         * Nils the "apiKey" element
         */
        void setNilApiKey();
        
        /**
         * Unsets the "apiKey" element
         */
        void unsetApiKey();
        
        /**
         * Gets the "request" element
         */
        org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments getRequest();
        
        /**
         * Tests for nil "request" element
         */
        boolean isNilRequest();
        
        /**
         * True if has "request" element
         */
        boolean isSetRequest();
        
        /**
         * Sets the "request" element
         */
        void setRequest(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments request);
        
        /**
         * Appends and returns a new empty "request" element
         */
        org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments addNewRequest();
        
        /**
         * Nils the "request" element
         */
        void setNilRequest();
        
        /**
         * Unsets the "request" element
         */
        void unsetRequest();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.tempuri.GetLocationFromRXNetworksDocument.GetLocationFromRXNetworks newInstance() {
              return (org.tempuri.GetLocationFromRXNetworksDocument.GetLocationFromRXNetworks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.tempuri.GetLocationFromRXNetworksDocument.GetLocationFromRXNetworks newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.tempuri.GetLocationFromRXNetworksDocument.GetLocationFromRXNetworks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.tempuri.GetLocationFromRXNetworksDocument newInstance() {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.tempuri.GetLocationFromRXNetworksDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.tempuri.GetLocationFromRXNetworksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
