/*
 * An XML document type.
 * Localname: CellDBResponseErrorCode
 * Namespace: http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common
 * Java type: org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.impl;
/**
 * A document containing one CellDBResponseErrorCode(@http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common) element.
 *
 * This is a complex type.
 */
public class CellDBResponseErrorCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CellDBResponseErrorCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CELLDBRESPONSEERRORCODE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "CellDBResponseErrorCode");
    
    
    /**
     * Gets the "CellDBResponseErrorCode" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode.Enum getCellDBResponseErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELLDBRESPONSEERRORCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CellDBResponseErrorCode" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode xgetCellDBResponseErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode)get_store().find_element_user(CELLDBRESPONSEERRORCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CellDBResponseErrorCode" element
     */
    public boolean isNilCellDBResponseErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode)get_store().find_element_user(CELLDBRESPONSEERRORCODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CellDBResponseErrorCode" element
     */
    public void setCellDBResponseErrorCode(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode.Enum cellDBResponseErrorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELLDBRESPONSEERRORCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CELLDBRESPONSEERRORCODE$0);
            }
            target.setEnumValue(cellDBResponseErrorCode);
        }
    }
    
    /**
     * Sets (as xml) the "CellDBResponseErrorCode" element
     */
    public void xsetCellDBResponseErrorCode(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode cellDBResponseErrorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode)get_store().find_element_user(CELLDBRESPONSEERRORCODE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode)get_store().add_element_user(CELLDBRESPONSEERRORCODE$0);
            }
            target.set(cellDBResponseErrorCode);
        }
    }
    
    /**
     * Nils the "CellDBResponseErrorCode" element
     */
    public void setNilCellDBResponseErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode)get_store().find_element_user(CELLDBRESPONSEERRORCODE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode)get_store().add_element_user(CELLDBRESPONSEERRORCODE$0);
            }
            target.setNil();
        }
    }
}
