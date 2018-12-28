/*
 * XML Type:  LocationResult
 * Namespace: http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common
 * Java type: org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.impl;
/**
 * An XML LocationResult(@http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common).
 *
 * This is a complex type.
 */
public class LocationResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationResult
{
    private static final long serialVersionUID = 1L;
    
    public LocationResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORCODE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "ErrorCode");
    private static final javax.xml.namespace.QName ERRORINFO$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "ErrorInfo");
    private static final javax.xml.namespace.QName LATITUDE$4 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "Latitude");
    private static final javax.xml.namespace.QName LONGITUDE$6 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "Longitude");
    private static final javax.xml.namespace.QName RADIUS$8 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "Radius");
    private static final javax.xml.namespace.QName RECEIVEDFROM$10 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "ReceivedFrom");
    private static final javax.xml.namespace.QName SWITCHADDRESS$12 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "SwitchAddress");
    
    
    /**
     * Gets the "ErrorCode" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode.Enum getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorCode" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode)get_store().find_element_user(ERRORCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ErrorCode" element
     */
    public boolean isSetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "ErrorCode" element
     */
    public void setErrorCode(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode.Enum errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORCODE$0);
            }
            target.setEnumValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorCode" element
     */
    public void xsetErrorCode(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBResponseErrorCode)get_store().add_element_user(ERRORCODE$0);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Unsets the "ErrorCode" element
     */
    public void unsetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORCODE$0, 0);
        }
    }
    
    /**
     * Gets the "ErrorInfo" element
     */
    public java.lang.String getErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORINFO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorInfo" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORINFO$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ErrorInfo" element
     */
    public boolean isNilErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORINFO$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ErrorInfo" element
     */
    public boolean isSetErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORINFO$2) != 0;
        }
    }
    
    /**
     * Sets the "ErrorInfo" element
     */
    public void setErrorInfo(java.lang.String errorInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORINFO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORINFO$2);
            }
            target.setStringValue(errorInfo);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorInfo" element
     */
    public void xsetErrorInfo(org.apache.xmlbeans.XmlString errorInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORINFO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORINFO$2);
            }
            target.set(errorInfo);
        }
    }
    
    /**
     * Nils the "ErrorInfo" element
     */
    public void setNilErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORINFO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORINFO$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ErrorInfo" element
     */
    public void unsetErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORINFO$2, 0);
        }
    }
    
    /**
     * Gets the "Latitude" element
     */
    public java.lang.String getLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Latitude" element
     */
    public org.apache.xmlbeans.XmlString xgetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATITUDE$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Latitude" element
     */
    public boolean isNilLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATITUDE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Latitude" element
     */
    public boolean isSetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LATITUDE$4) != 0;
        }
    }
    
    /**
     * Sets the "Latitude" element
     */
    public void setLatitude(java.lang.String latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$4);
            }
            target.setStringValue(latitude);
        }
    }
    
    /**
     * Sets (as xml) the "Latitude" element
     */
    public void xsetLatitude(org.apache.xmlbeans.XmlString latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATITUDE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LATITUDE$4);
            }
            target.set(latitude);
        }
    }
    
    /**
     * Nils the "Latitude" element
     */
    public void setNilLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATITUDE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LATITUDE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Latitude" element
     */
    public void unsetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LATITUDE$4, 0);
        }
    }
    
    /**
     * Gets the "Longitude" element
     */
    public java.lang.String getLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Longitude" element
     */
    public org.apache.xmlbeans.XmlString xgetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LONGITUDE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Longitude" element
     */
    public boolean isNilLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LONGITUDE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Longitude" element
     */
    public boolean isSetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LONGITUDE$6) != 0;
        }
    }
    
    /**
     * Sets the "Longitude" element
     */
    public void setLongitude(java.lang.String longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$6);
            }
            target.setStringValue(longitude);
        }
    }
    
    /**
     * Sets (as xml) the "Longitude" element
     */
    public void xsetLongitude(org.apache.xmlbeans.XmlString longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LONGITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LONGITUDE$6);
            }
            target.set(longitude);
        }
    }
    
    /**
     * Nils the "Longitude" element
     */
    public void setNilLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LONGITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LONGITUDE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Longitude" element
     */
    public void unsetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LONGITUDE$6, 0);
        }
    }
    
    /**
     * Gets the "Radius" element
     */
    public java.lang.String getRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIUS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Radius" element
     */
    public org.apache.xmlbeans.XmlString xgetRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RADIUS$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Radius" element
     */
    public boolean isNilRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RADIUS$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Radius" element
     */
    public boolean isSetRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RADIUS$8) != 0;
        }
    }
    
    /**
     * Sets the "Radius" element
     */
    public void setRadius(java.lang.String radius)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIUS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RADIUS$8);
            }
            target.setStringValue(radius);
        }
    }
    
    /**
     * Sets (as xml) the "Radius" element
     */
    public void xsetRadius(org.apache.xmlbeans.XmlString radius)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RADIUS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RADIUS$8);
            }
            target.set(radius);
        }
    }
    
    /**
     * Nils the "Radius" element
     */
    public void setNilRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RADIUS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RADIUS$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Radius" element
     */
    public void unsetRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RADIUS$8, 0);
        }
    }
    
    /**
     * Gets the "ReceivedFrom" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType.Enum getReceivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVEDFROM$10, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReceivedFrom" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType xgetReceivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType)get_store().find_element_user(RECEIVEDFROM$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReceivedFrom" element
     */
    public boolean isSetReceivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECEIVEDFROM$10) != 0;
        }
    }
    
    /**
     * Sets the "ReceivedFrom" element
     */
    public void setReceivedFrom(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType.Enum receivedFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVEDFROM$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECEIVEDFROM$10);
            }
            target.setEnumValue(receivedFrom);
        }
    }
    
    /**
     * Sets (as xml) the "ReceivedFrom" element
     */
    public void xsetReceivedFrom(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType receivedFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType)get_store().find_element_user(RECEIVEDFROM$10, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.ProviderType)get_store().add_element_user(RECEIVEDFROM$10);
            }
            target.set(receivedFrom);
        }
    }
    
    /**
     * Unsets the "ReceivedFrom" element
     */
    public void unsetReceivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECEIVEDFROM$10, 0);
        }
    }
    
    /**
     * Gets the "SwitchAddress" element
     */
    public java.lang.String getSwitchAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWITCHADDRESS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SwitchAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetSwitchAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWITCHADDRESS$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SwitchAddress" element
     */
    public boolean isNilSwitchAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWITCHADDRESS$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SwitchAddress" element
     */
    public boolean isSetSwitchAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SWITCHADDRESS$12) != 0;
        }
    }
    
    /**
     * Sets the "SwitchAddress" element
     */
    public void setSwitchAddress(java.lang.String switchAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWITCHADDRESS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SWITCHADDRESS$12);
            }
            target.setStringValue(switchAddress);
        }
    }
    
    /**
     * Sets (as xml) the "SwitchAddress" element
     */
    public void xsetSwitchAddress(org.apache.xmlbeans.XmlString switchAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWITCHADDRESS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SWITCHADDRESS$12);
            }
            target.set(switchAddress);
        }
    }
    
    /**
     * Nils the "SwitchAddress" element
     */
    public void setNilSwitchAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWITCHADDRESS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SWITCHADDRESS$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SwitchAddress" element
     */
    public void unsetSwitchAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SWITCHADDRESS$12, 0);
        }
    }
}
