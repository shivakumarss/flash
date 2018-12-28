/*
 * XML Type:  CellDBResponseErrorCode
 * Namespace: http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common
 * Java type: org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common;


/**
 * An XML CellDBResponseErrorCode(@http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common).
 *
 * This is an atomic type that is a restriction of org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode.
 */
public interface CellDBResponseErrorCode extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CellDBResponseErrorCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB8C6F9FE6CDD44DBF6D24989B285CB70").resolveHandle("celldbresponseerrorcodec2bctype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum SUCCESS = Enum.forString("Success");
    static final Enum FAILED = Enum.forString("Failed");
    static final Enum NOT_FOUND = Enum.forString("NotFound");
    static final Enum ERROR_OCCURED = Enum.forString("ErrorOccured");
    
    static final int INT_SUCCESS = Enum.INT_SUCCESS;
    static final int INT_FAILED = Enum.INT_FAILED;
    static final int INT_NOT_FOUND = Enum.INT_NOT_FOUND;
    static final int INT_ERROR_OCCURED = Enum.INT_ERROR_OCCURED;
    
    /**
     * Enumeration value class for org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SUCCESS
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_SUCCESS = 1;
        static final int INT_FAILED = 2;
        static final int INT_NOT_FOUND = 3;
        static final int INT_ERROR_OCCURED = 4;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Success", INT_SUCCESS),
                new Enum("Failed", INT_FAILED),
                new Enum("NotFound", INT_NOT_FOUND),
                new Enum("ErrorOccured", INT_ERROR_OCCURED),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode newValue(java.lang.Object obj) {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) type.newValue( obj ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode newInstance() {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
