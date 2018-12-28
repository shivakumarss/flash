/*
 * An XML document type.
 * Localname: CellDBRequestFormat
 * Namespace: http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common
 * Java type: org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormatDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.impl;
/**
 * A document containing one CellDBRequestFormat(@http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common) element.
 *
 * This is a complex type.
 */
public class CellDBRequestFormatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormatDocument
{
    private static final long serialVersionUID = 1L;
    
    public CellDBRequestFormatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CELLDBREQUESTFORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "CellDBRequestFormat");
    
    
    /**
     * Gets the "CellDBRequestFormat" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat.Enum getCellDBRequestFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELLDBREQUESTFORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CellDBRequestFormat" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat xgetCellDBRequestFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat)get_store().find_element_user(CELLDBREQUESTFORMAT$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CellDBRequestFormat" element
     */
    public boolean isNilCellDBRequestFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat)get_store().find_element_user(CELLDBREQUESTFORMAT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CellDBRequestFormat" element
     */
    public void setCellDBRequestFormat(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat.Enum cellDBRequestFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELLDBREQUESTFORMAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CELLDBREQUESTFORMAT$0);
            }
            target.setEnumValue(cellDBRequestFormat);
        }
    }
    
    /**
     * Sets (as xml) the "CellDBRequestFormat" element
     */
    public void xsetCellDBRequestFormat(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat cellDBRequestFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat)get_store().find_element_user(CELLDBREQUESTFORMAT$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat)get_store().add_element_user(CELLDBREQUESTFORMAT$0);
            }
            target.set(cellDBRequestFormat);
        }
    }
    
    /**
     * Nils the "CellDBRequestFormat" element
     */
    public void setNilCellDBRequestFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat)get_store().find_element_user(CELLDBREQUESTFORMAT$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat)get_store().add_element_user(CELLDBREQUESTFORMAT$0);
            }
            target.setNil();
        }
    }
}
