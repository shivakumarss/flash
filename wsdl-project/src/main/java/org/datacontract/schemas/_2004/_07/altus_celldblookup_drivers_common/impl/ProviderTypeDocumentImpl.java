/*
 * An XML document type.
 * Localname: ProviderType
 * Namespace: http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common
 * Java type: org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.impl;
/**
 * A document containing one ProviderType(@http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common) element.
 *
 * This is a complex type.
 */
public class ProviderTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProviderTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVIDERTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "ProviderType");
    
    
    /**
     * Gets the "ProviderType" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType.Enum getProviderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDERTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProviderType" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType xgetProviderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType)get_store().find_element_user(PROVIDERTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProviderType" element
     */
    public boolean isNilProviderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType)get_store().find_element_user(PROVIDERTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProviderType" element
     */
    public void setProviderType(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType.Enum providerType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDERTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVIDERTYPE$0);
            }
            target.setEnumValue(providerType);
        }
    }
    
    /**
     * Sets (as xml) the "ProviderType" element
     */
    public void xsetProviderType(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType providerType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType)get_store().find_element_user(PROVIDERTYPE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType)get_store().add_element_user(PROVIDERTYPE$0);
            }
            target.set(providerType);
        }
    }
    
    /**
     * Nils the "ProviderType" element
     */
    public void setNilProviderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType)get_store().find_element_user(PROVIDERTYPE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType)get_store().add_element_user(PROVIDERTYPE$0);
            }
            target.setNil();
        }
    }
}
