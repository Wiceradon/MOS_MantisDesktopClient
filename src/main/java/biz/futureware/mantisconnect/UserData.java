/**
 * UserData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package biz.futureware.mantisconnect;

public class UserData  implements java.io.Serializable {
    private biz.futureware.mantisconnect.AccountData account_data;

    private java.math.BigInteger access_level;

    private java.lang.String timezone;

    public UserData() {
    }

    public UserData(
           biz.futureware.mantisconnect.AccountData account_data,
           java.math.BigInteger access_level,
           java.lang.String timezone) {
           this.account_data = account_data;
           this.access_level = access_level;
           this.timezone = timezone;
    }


    /**
     * Gets the account_data value for this UserData.
     * 
     * @return account_data
     */
    public biz.futureware.mantisconnect.AccountData getAccount_data() {
        return account_data;
    }


    /**
     * Sets the account_data value for this UserData.
     * 
     * @param account_data
     */
    public void setAccount_data(biz.futureware.mantisconnect.AccountData account_data) {
        this.account_data = account_data;
    }


    /**
     * Gets the access_level value for this UserData.
     * 
     * @return access_level
     */
    public java.math.BigInteger getAccess_level() {
        return access_level;
    }


    /**
     * Sets the access_level value for this UserData.
     * 
     * @param access_level
     */
    public void setAccess_level(java.math.BigInteger access_level) {
        this.access_level = access_level;
    }


    /**
     * Gets the timezone value for this UserData.
     * 
     * @return timezone
     */
    public java.lang.String getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this UserData.
     * 
     * @param timezone
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserData)) return false;
        UserData other = (UserData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account_data==null && other.getAccount_data()==null) || 
             (this.account_data!=null &&
              this.account_data.equals(other.getAccount_data()))) &&
            ((this.access_level==null && other.getAccess_level()==null) || 
             (this.access_level!=null &&
              this.access_level.equals(other.getAccess_level()))) &&
            ((this.timezone==null && other.getTimezone()==null) || 
             (this.timezone!=null &&
              this.timezone.equals(other.getTimezone())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccount_data() != null) {
            _hashCode += getAccount_data().hashCode();
        }
        if (getAccess_level() != null) {
            _hashCode += getAccess_level().hashCode();
        }
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://futureware.biz/mantisconnect", "UserData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://futureware.biz/mantisconnect", "AccountData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("access_level");
        elemField.setXmlName(new javax.xml.namespace.QName("", "access_level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
