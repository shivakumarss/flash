/*
 * An XML document type.
 * Localname: LocationArguments
 * Namespace: http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common
 * Java type: org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArgumentsDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.impl;
/**
 * A document containing one LocationArguments(@http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common) element.
 *
 * This is a complex type.
 */
public class LocationArgumentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArgumentsDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationArgumentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONARGUMENTS$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "LocationArguments");
    
    
    /**
     * Gets the "LocationArguments" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments getLocationArguments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments)get_store().find_element_user(LOCATIONARGUMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationArguments" element
     */
    public boolean isNilLocationArguments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments)get_store().find_element_user(LOCATIONARGUMENTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationArguments" element
     */
    public void setLocationArguments(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments locationArguments)
    {
        generatedSetterHelperImpl(locationArguments, LOCATIONARGUMENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LocationArguments" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments addNewLocationArguments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments)get_store().add_element_user(LOCATIONARGUMENTS$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationArguments" element
     */
    public void setNilLocationArguments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments)get_store().find_element_user(LOCATIONARGUMENTS$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments)get_store().add_element_user(LOCATIONARGUMENTS$0);
            }
            target.setNil();
        }
    }
}
