/*
 * XML Type:  LocationResult
 * Namespace: http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common
 * Java type: org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common;


/**
 * An XML LocationResult(@http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common).
 *
 * This is a complex type.
 */
public interface LocationResult extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB8C6F9FE6CDD44DBF6D24989B285CB70").resolveHandle("locationresult7b0ctype");
    
    /**
     * Gets the "ErrorCode" element
     */
    org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode.Enum getErrorCode();
    
    /**
     * Gets (as xml) the "ErrorCode" element
     */
    org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode xgetErrorCode();
    
    /**
     * True if has "ErrorCode" element
     */
    boolean isSetErrorCode();
    
    /**
     * Sets the "ErrorCode" element
     */
    void setErrorCode(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode.Enum errorCode);
    
    /**
     * Sets (as xml) the "ErrorCode" element
     */
    void xsetErrorCode(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode errorCode);
    
    /**
     * Unsets the "ErrorCode" element
     */
    void unsetErrorCode();
    
    /**
     * Gets the "ErrorInfo" element
     */
    java.lang.String getErrorInfo();
    
    /**
     * Gets (as xml) the "ErrorInfo" element
     */
    org.apache.xmlbeans.XmlString xgetErrorInfo();
    
    /**
     * Tests for nil "ErrorInfo" element
     */
    boolean isNilErrorInfo();
    
    /**
     * True if has "ErrorInfo" element
     */
    boolean isSetErrorInfo();
    
    /**
     * Sets the "ErrorInfo" element
     */
    void setErrorInfo(java.lang.String errorInfo);
    
    /**
     * Sets (as xml) the "ErrorInfo" element
     */
    void xsetErrorInfo(org.apache.xmlbeans.XmlString errorInfo);
    
    /**
     * Nils the "ErrorInfo" element
     */
    void setNilErrorInfo();
    
    /**
     * Unsets the "ErrorInfo" element
     */
    void unsetErrorInfo();
    
    /**
     * Gets the "Latitude" element
     */
    java.lang.String getLatitude();
    
    /**
     * Gets (as xml) the "Latitude" element
     */
    org.apache.xmlbeans.XmlString xgetLatitude();
    
    /**
     * Tests for nil "Latitude" element
     */
    boolean isNilLatitude();
    
    /**
     * True if has "Latitude" element
     */
    boolean isSetLatitude();
    
    /**
     * Sets the "Latitude" element
     */
    void setLatitude(java.lang.String latitude);
    
    /**
     * Sets (as xml) the "Latitude" element
     */
    void xsetLatitude(org.apache.xmlbeans.XmlString latitude);
    
    /**
     * Nils the "Latitude" element
     */
    void setNilLatitude();
    
    /**
     * Unsets the "Latitude" element
     */
    void unsetLatitude();
    
    /**
     * Gets the "Longitude" element
     */
    java.lang.String getLongitude();
    
    /**
     * Gets (as xml) the "Longitude" element
     */
    org.apache.xmlbeans.XmlString xgetLongitude();
    
    /**
     * Tests for nil "Longitude" element
     */
    boolean isNilLongitude();
    
    /**
     * True if has "Longitude" element
     */
    boolean isSetLongitude();
    
    /**
     * Sets the "Longitude" element
     */
    void setLongitude(java.lang.String longitude);
    
    /**
     * Sets (as xml) the "Longitude" element
     */
    void xsetLongitude(org.apache.xmlbeans.XmlString longitude);
    
    /**
     * Nils the "Longitude" element
     */
    void setNilLongitude();
    
    /**
     * Unsets the "Longitude" element
     */
    void unsetLongitude();
    
    /**
     * Gets the "Radius" element
     */
    java.lang.String getRadius();
    
    /**
     * Gets (as xml) the "Radius" element
     */
    org.apache.xmlbeans.XmlString xgetRadius();
    
    /**
     * Tests for nil "Radius" element
     */
    boolean isNilRadius();
    
    /**
     * True if has "Radius" element
     */
    boolean isSetRadius();
    
    /**
     * Sets the "Radius" element
     */
    void setRadius(java.lang.String radius);
    
    /**
     * Sets (as xml) the "Radius" element
     */
    void xsetRadius(org.apache.xmlbeans.XmlString radius);
    
    /**
     * Nils the "Radius" element
     */
    void setNilRadius();
    
    /**
     * Unsets the "Radius" element
     */
    void unsetRadius();
    
    /**
     * Gets the "ReceivedFrom" element
     */
    org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType.Enum getReceivedFrom();
    
    /**
     * Gets (as xml) the "ReceivedFrom" element
     */
    org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType xgetReceivedFrom();
    
    /**
     * True if has "ReceivedFrom" element
     */
    boolean isSetReceivedFrom();
    
    /**
     * Sets the "ReceivedFrom" element
     */
    void setReceivedFrom(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType.Enum receivedFrom);
    
    /**
     * Sets (as xml) the "ReceivedFrom" element
     */
    void xsetReceivedFrom(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType receivedFrom);
    
    /**
     * Unsets the "ReceivedFrom" element
     */
    void unsetReceivedFrom();
    
    /**
     * Gets the "SwitchAddress" element
     */
    java.lang.String getSwitchAddress();
    
    /**
     * Gets (as xml) the "SwitchAddress" element
     */
    org.apache.xmlbeans.XmlString xgetSwitchAddress();
    
    /**
     * Tests for nil "SwitchAddress" element
     */
    boolean isNilSwitchAddress();
    
    /**
     * True if has "SwitchAddress" element
     */
    boolean isSetSwitchAddress();
    
    /**
     * Sets the "SwitchAddress" element
     */
    void setSwitchAddress(java.lang.String switchAddress);
    
    /**
     * Sets (as xml) the "SwitchAddress" element
     */
    void xsetSwitchAddress(org.apache.xmlbeans.XmlString switchAddress);
    
    /**
     * Nils the "SwitchAddress" element
     */
    void setNilSwitchAddress();
    
    /**
     * Unsets the "SwitchAddress" element
     */
    void unsetSwitchAddress();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult newInstance() {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
