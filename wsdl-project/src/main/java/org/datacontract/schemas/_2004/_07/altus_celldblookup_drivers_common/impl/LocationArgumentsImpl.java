/*
 * XML Type:  LocationArguments
 * Namespace: http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common
 * Java type: org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.impl;
/**
 * An XML LocationArguments(@http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common).
 *
 * This is a complex type.
 */
public class LocationArgumentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.LocationArguments
{
    private static final long serialVersionUID = 1L;
    
    public LocationArgumentsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CELLID$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "CellID");
    private static final javax.xml.namespace.QName IMEI$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "IMEI");
    private static final javax.xml.namespace.QName LAC$4 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "LAC");
    private static final javax.xml.namespace.QName MCC$6 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "MCC");
    private static final javax.xml.namespace.QName MNC$8 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "MNC");
    private static final javax.xml.namespace.QName RAT$10 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "RAT");
    private static final javax.xml.namespace.QName RSCP$12 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "RSCP");
    private static final javax.xml.namespace.QName RXLEV$14 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "RXLEV");
    private static final javax.xml.namespace.QName REQUESTCITY$16 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "RequestCity");
    private static final javax.xml.namespace.QName REQUESTFORMAT$18 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "RequestFormat");
    private static final javax.xml.namespace.QName SAC$20 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "SAC");
    private static final javax.xml.namespace.QName SWITCHADDRESS$22 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Altus.CellDBLookup.Drivers.Common", "SwitchAddress");
    
    
    /**
     * Gets the "CellID" element
     */
    public int getCellID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELLID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CellID" element
     */
    public org.apache.xmlbeans.XmlInt xgetCellID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CELLID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "CellID" element
     */
    public boolean isSetCellID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELLID$0) != 0;
        }
    }
    
    /**
     * Sets the "CellID" element
     */
    public void setCellID(int cellID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELLID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CELLID$0);
            }
            target.setIntValue(cellID);
        }
    }
    
    /**
     * Sets (as xml) the "CellID" element
     */
    public void xsetCellID(org.apache.xmlbeans.XmlInt cellID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CELLID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CELLID$0);
            }
            target.set(cellID);
        }
    }
    
    /**
     * Unsets the "CellID" element
     */
    public void unsetCellID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELLID$0, 0);
        }
    }
    
    /**
     * Gets the "IMEI" element
     */
    public java.lang.String getIMEI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMEI$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IMEI" element
     */
    public org.apache.xmlbeans.XmlString xgetIMEI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMEI$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IMEI" element
     */
    public boolean isNilIMEI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMEI$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IMEI" element
     */
    public boolean isSetIMEI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMEI$2) != 0;
        }
    }
    
    /**
     * Sets the "IMEI" element
     */
    public void setIMEI(java.lang.String imei)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMEI$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMEI$2);
            }
            target.setStringValue(imei);
        }
    }
    
    /**
     * Sets (as xml) the "IMEI" element
     */
    public void xsetIMEI(org.apache.xmlbeans.XmlString imei)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMEI$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMEI$2);
            }
            target.set(imei);
        }
    }
    
    /**
     * Nils the "IMEI" element
     */
    public void setNilIMEI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMEI$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMEI$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IMEI" element
     */
    public void unsetIMEI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMEI$2, 0);
        }
    }
    
    /**
     * Gets the "LAC" element
     */
    public int getLAC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAC$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "LAC" element
     */
    public org.apache.xmlbeans.XmlInt xgetLAC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LAC$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LAC" element
     */
    public boolean isSetLAC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LAC$4) != 0;
        }
    }
    
    /**
     * Sets the "LAC" element
     */
    public void setLAC(int lac)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAC$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAC$4);
            }
            target.setIntValue(lac);
        }
    }
    
    /**
     * Sets (as xml) the "LAC" element
     */
    public void xsetLAC(org.apache.xmlbeans.XmlInt lac)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LAC$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LAC$4);
            }
            target.set(lac);
        }
    }
    
    /**
     * Unsets the "LAC" element
     */
    public void unsetLAC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LAC$4, 0);
        }
    }
    
    /**
     * Gets the "MCC" element
     */
    public int getMCC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MCC$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MCC" element
     */
    public org.apache.xmlbeans.XmlInt xgetMCC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MCC$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "MCC" element
     */
    public boolean isSetMCC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MCC$6) != 0;
        }
    }
    
    /**
     * Sets the "MCC" element
     */
    public void setMCC(int mcc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MCC$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MCC$6);
            }
            target.setIntValue(mcc);
        }
    }
    
    /**
     * Sets (as xml) the "MCC" element
     */
    public void xsetMCC(org.apache.xmlbeans.XmlInt mcc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MCC$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MCC$6);
            }
            target.set(mcc);
        }
    }
    
    /**
     * Unsets the "MCC" element
     */
    public void unsetMCC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MCC$6, 0);
        }
    }
    
    /**
     * Gets the "MNC" element
     */
    public int getMNC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNC$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MNC" element
     */
    public org.apache.xmlbeans.XmlInt xgetMNC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MNC$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "MNC" element
     */
    public boolean isSetMNC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MNC$8) != 0;
        }
    }
    
    /**
     * Sets the "MNC" element
     */
    public void setMNC(int mnc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNC$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNC$8);
            }
            target.setIntValue(mnc);
        }
    }
    
    /**
     * Sets (as xml) the "MNC" element
     */
    public void xsetMNC(org.apache.xmlbeans.XmlInt mnc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MNC$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MNC$8);
            }
            target.set(mnc);
        }
    }
    
    /**
     * Unsets the "MNC" element
     */
    public void unsetMNC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MNC$8, 0);
        }
    }
    
    /**
     * Gets the "RAT" element
     */
    public java.lang.String getRAT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RAT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RAT" element
     */
    public org.apache.xmlbeans.XmlString xgetRAT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RAT$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RAT" element
     */
    public boolean isNilRAT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RAT$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RAT" element
     */
    public boolean isSetRAT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RAT$10) != 0;
        }
    }
    
    /**
     * Sets the "RAT" element
     */
    public void setRAT(java.lang.String rat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RAT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RAT$10);
            }
            target.setStringValue(rat);
        }
    }
    
    /**
     * Sets (as xml) the "RAT" element
     */
    public void xsetRAT(org.apache.xmlbeans.XmlString rat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RAT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RAT$10);
            }
            target.set(rat);
        }
    }
    
    /**
     * Nils the "RAT" element
     */
    public void setNilRAT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RAT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RAT$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RAT" element
     */
    public void unsetRAT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RAT$10, 0);
        }
    }
    
    /**
     * Gets the "RSCP" element
     */
    public java.lang.String getRSCP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RSCP$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RSCP" element
     */
    public org.apache.xmlbeans.XmlString xgetRSCP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RSCP$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RSCP" element
     */
    public boolean isNilRSCP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RSCP$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RSCP" element
     */
    public boolean isSetRSCP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RSCP$12) != 0;
        }
    }
    
    /**
     * Sets the "RSCP" element
     */
    public void setRSCP(java.lang.String rscp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RSCP$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RSCP$12);
            }
            target.setStringValue(rscp);
        }
    }
    
    /**
     * Sets (as xml) the "RSCP" element
     */
    public void xsetRSCP(org.apache.xmlbeans.XmlString rscp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RSCP$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RSCP$12);
            }
            target.set(rscp);
        }
    }
    
    /**
     * Nils the "RSCP" element
     */
    public void setNilRSCP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RSCP$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RSCP$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RSCP" element
     */
    public void unsetRSCP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RSCP$12, 0);
        }
    }
    
    /**
     * Gets the "RXLEV" element
     */
    public java.lang.String getRXLEV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RXLEV$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RXLEV" element
     */
    public org.apache.xmlbeans.XmlString xgetRXLEV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RXLEV$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RXLEV" element
     */
    public boolean isNilRXLEV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RXLEV$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RXLEV" element
     */
    public boolean isSetRXLEV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RXLEV$14) != 0;
        }
    }
    
    /**
     * Sets the "RXLEV" element
     */
    public void setRXLEV(java.lang.String rxlev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RXLEV$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RXLEV$14);
            }
            target.setStringValue(rxlev);
        }
    }
    
    /**
     * Sets (as xml) the "RXLEV" element
     */
    public void xsetRXLEV(org.apache.xmlbeans.XmlString rxlev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RXLEV$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RXLEV$14);
            }
            target.set(rxlev);
        }
    }
    
    /**
     * Nils the "RXLEV" element
     */
    public void setNilRXLEV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RXLEV$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RXLEV$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RXLEV" element
     */
    public void unsetRXLEV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RXLEV$14, 0);
        }
    }
    
    /**
     * Gets the "RequestCity" element
     */
    public java.lang.String getRequestCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTCITY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestCity" element
     */
    public org.apache.xmlbeans.XmlString xgetRequestCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTCITY$16, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RequestCity" element
     */
    public boolean isNilRequestCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTCITY$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RequestCity" element
     */
    public boolean isSetRequestCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTCITY$16) != 0;
        }
    }
    
    /**
     * Sets the "RequestCity" element
     */
    public void setRequestCity(java.lang.String requestCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTCITY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTCITY$16);
            }
            target.setStringValue(requestCity);
        }
    }
    
    /**
     * Sets (as xml) the "RequestCity" element
     */
    public void xsetRequestCity(org.apache.xmlbeans.XmlString requestCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTCITY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTCITY$16);
            }
            target.set(requestCity);
        }
    }
    
    /**
     * Nils the "RequestCity" element
     */
    public void setNilRequestCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTCITY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTCITY$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RequestCity" element
     */
    public void unsetRequestCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTCITY$16, 0);
        }
    }
    
    /**
     * Gets the "RequestFormat" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat.Enum getRequestFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTFORMAT$18, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestFormat" element
     */
    public org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat xgetRequestFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat)get_store().find_element_user(REQUESTFORMAT$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "RequestFormat" element
     */
    public boolean isSetRequestFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTFORMAT$18) != 0;
        }
    }
    
    /**
     * Sets the "RequestFormat" element
     */
    public void setRequestFormat(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat.Enum requestFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTFORMAT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTFORMAT$18);
            }
            target.setEnumValue(requestFormat);
        }
    }
    
    /**
     * Sets (as xml) the "RequestFormat" element
     */
    public void xsetRequestFormat(org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat requestFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat target = null;
            target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat)get_store().find_element_user(REQUESTFORMAT$18, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.altus_celldblookup_drivers_common.CellDBRequestFormat)get_store().add_element_user(REQUESTFORMAT$18);
            }
            target.set(requestFormat);
        }
    }
    
    /**
     * Unsets the "RequestFormat" element
     */
    public void unsetRequestFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTFORMAT$18, 0);
        }
    }
    
    /**
     * Gets the "SAC" element
     */
    public int getSAC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAC$20, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SAC" element
     */
    public org.apache.xmlbeans.XmlInt xgetSAC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SAC$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "SAC" element
     */
    public boolean isSetSAC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAC$20) != 0;
        }
    }
    
    /**
     * Sets the "SAC" element
     */
    public void setSAC(int sac)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAC$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAC$20);
            }
            target.setIntValue(sac);
        }
    }
    
    /**
     * Sets (as xml) the "SAC" element
     */
    public void xsetSAC(org.apache.xmlbeans.XmlInt sac)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SAC$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SAC$20);
            }
            target.set(sac);
        }
    }
    
    /**
     * Unsets the "SAC" element
     */
    public void unsetSAC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAC$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWITCHADDRESS$22, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWITCHADDRESS$22, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWITCHADDRESS$22, 0);
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
            return get_store().count_elements(SWITCHADDRESS$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWITCHADDRESS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SWITCHADDRESS$22);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWITCHADDRESS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SWITCHADDRESS$22);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWITCHADDRESS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SWITCHADDRESS$22);
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
            get_store().remove_element(SWITCHADDRESS$22, 0);
        }
    }
}
