/*
 * An XML document type.
 * Localname: LocationResult
 * Namespace: http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common
 * Java type: org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResultDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.impl;
/**
 * A document containing one LocationResult(@http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common) element.
 *
 * This is a complex type.
 */
public class LocationResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONRESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "LocationResult");
    
    
    /**
     * Gets the "LocationResult" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult getLocationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().find_element_user(LOCATIONRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationResult" element
     */
    public boolean isNilLocationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().find_element_user(LOCATIONRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationResult" element
     */
    public void setLocationResult(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult locationResult)
    {
        generatedSetterHelperImpl(locationResult, LOCATIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LocationResult" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult addNewLocationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().add_element_user(LOCATIONRESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationResult" element
     */
    public void setNilLocationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().find_element_user(LOCATIONRESULT$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult)get_store().add_element_user(LOCATIONRESULT$0);
            }
            target.setNil();
        }
    }
}
