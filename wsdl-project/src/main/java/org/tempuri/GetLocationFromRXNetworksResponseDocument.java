/*
 * An XML document type.
 * Localname: GetLocationFromRXNetworksResponse
 * Namespace: http://tempuri.org/
 * Java type: org.tempuri.GetLocationFromRXNetworksResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.tempuri;


/**
 * A document containing one GetLocationFromRXNetworksResponse(@http://tempuri.org/) element.
 *
 * This is a complex type.
 */
public interface GetLocationFromRXNetworksResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetLocationFromRXNetworksResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB8C6F9FE6CDD44DBF6D24989B285CB70").resolveHandle("getlocationfromrxnetworksresponsefc3bdoctype");
    
    /**
     * Gets the "GetLocationFromRXNetworksResponse" element
     */
    org.tempuri.GetLocationFromRXNetworksResponseDocument.GetLocationFromRXNetworksResponse getGetLocationFromRXNetworksResponse();
    
    /**
     * Sets the "GetLocationFromRXNetworksResponse" element
     */
    void setGetLocationFromRXNetworksResponse(org.tempuri.GetLocationFromRXNetworksResponseDocument.GetLocationFromRXNetworksResponse getLocationFromRXNetworksResponse);
    
    /**
     * Appends and returns a new empty "GetLocationFromRXNetworksResponse" element
     */
    org.tempuri.GetLocationFromRXNetworksResponseDocument.GetLocationFromRXNetworksResponse addNewGetLocationFromRXNetworksResponse();
    
    /**
     * An XML GetLocationFromRXNetworksResponse(@http://tempuri.org/).
     *
     * This is a complex type.
     */
    public interface GetLocationFromRXNetworksResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetLocationFromRXNetworksResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB8C6F9FE6CDD44DBF6D24989B285CB70").resolveHandle("getlocationfromrxnetworksresponsef588elemtype");
        
        /**
         * Gets the "GetLocationFromRXNetworksResult" element
         */
        org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult getGetLocationFromRXNetworksResult();
        
        /**
         * Tests for nil "GetLocationFromRXNetworksResult" element
         */
        boolean isNilGetLocationFromRXNetworksResult();
        
        /**
         * True if has "GetLocationFromRXNetworksResult" element
         */
        boolean isSetGetLocationFromRXNetworksResult();
        
        /**
         * Sets the "GetLocationFromRXNetworksResult" element
         */
        void setGetLocationFromRXNetworksResult(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult getLocationFromRXNetworksResult);
        
        /**
         * Appends and returns a new empty "GetLocationFromRXNetworksResult" element
         */
        org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult addNewGetLocationFromRXNetworksResult();
        
        /**
         * Nils the "GetLocationFromRXNetworksResult" element
         */
        void setNilGetLocationFromRXNetworksResult();
        
        /**
         * Unsets the "GetLocationFromRXNetworksResult" element
         */
        void unsetGetLocationFromRXNetworksResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.tempuri.GetLocationFromRXNetworksResponseDocument.GetLocationFromRXNetworksResponse newInstance() {
              return (org.tempuri.GetLocationFromRXNetworksResponseDocument.GetLocationFromRXNetworksResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.tempuri.GetLocationFromRXNetworksResponseDocument.GetLocationFromRXNetworksResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.tempuri.GetLocationFromRXNetworksResponseDocument.GetLocationFromRXNetworksResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument newInstance() {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.tempuri.GetLocationFromRXNetworksResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.tempuri.GetLocationFromRXNetworksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
