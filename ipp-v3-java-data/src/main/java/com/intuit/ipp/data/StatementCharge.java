//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.23 at 02:36:16 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Financial transaction representing a request for
 * 				payment for goods or services that have been sold.
 * 			
 * 
 * <p>Java class for StatementCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementCharge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}Transaction">
 *       &lt;sequence>
 *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomerRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="RemitToRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="ARAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="ClassRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BilledDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StatementChargeEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementCharge", propOrder = {
    "credit",
    "customerRef",
    "remitToRef",
    "arAccountRef",
    "classRef",
    "dueDate",
    "billedDate",
    "totalAmt",
    "statementChargeEx"
})
public class StatementCharge
    extends Transaction
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Credit")
    protected Boolean credit;
    @XmlElement(name = "CustomerRef")
    protected ReferenceType customerRef;
    @XmlElement(name = "RemitToRef")
    protected ReferenceType remitToRef;
    @XmlElement(name = "ARAccountRef")
    protected ReferenceType arAccountRef;
    @XmlElement(name = "ClassRef")
    protected ReferenceType classRef;
    @XmlElement(name = "DueDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date dueDate;
    @XmlElement(name = "BilledDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date billedDate;
    @XmlElement(name = "TotalAmt")
    protected BigDecimal totalAmt;
    @XmlElement(name = "StatementChargeEx")
    protected IntuitAnyType statementChargeEx;

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCredit(Boolean value) {
        this.credit = value;
    }

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCustomerRef(ReferenceType value) {
        this.customerRef = value;
    }

    /**
     * Gets the value of the remitToRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRemitToRef() {
        return remitToRef;
    }

    /**
     * Sets the value of the remitToRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRemitToRef(ReferenceType value) {
        this.remitToRef = value;
    }

    /**
     * Gets the value of the arAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getARAccountRef() {
        return arAccountRef;
    }

    /**
     * Sets the value of the arAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setARAccountRef(ReferenceType value) {
        this.arAccountRef = value;
    }

    /**
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setClassRef(ReferenceType value) {
        this.classRef = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(Date value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the billedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBilledDate() {
        return billedDate;
    }

    /**
     * Sets the value of the billedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilledDate(Date value) {
        this.billedDate = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmt(BigDecimal value) {
        this.totalAmt = value;
    }

    /**
     * Gets the value of the statementChargeEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getStatementChargeEx() {
        return statementChargeEx;
    }

    /**
     * Sets the value of the statementChargeEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setStatementChargeEx(IntuitAnyType value) {
        this.statementChargeEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final StatementCharge that = ((StatementCharge) object);
        {
            Boolean lhsCredit;
            lhsCredit = this.isCredit();
            Boolean rhsCredit;
            rhsCredit = that.isCredit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "credit", lhsCredit), LocatorUtils.property(thatLocator, "credit", rhsCredit), lhsCredit, rhsCredit, (this.credit!= null), (that.credit!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsCustomerRef;
            lhsCustomerRef = this.getCustomerRef();
            ReferenceType rhsCustomerRef;
            rhsCustomerRef = that.getCustomerRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerRef", lhsCustomerRef), LocatorUtils.property(thatLocator, "customerRef", rhsCustomerRef), lhsCustomerRef, rhsCustomerRef, (this.customerRef!= null), (that.customerRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsRemitToRef;
            lhsRemitToRef = this.getRemitToRef();
            ReferenceType rhsRemitToRef;
            rhsRemitToRef = that.getRemitToRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remitToRef", lhsRemitToRef), LocatorUtils.property(thatLocator, "remitToRef", rhsRemitToRef), lhsRemitToRef, rhsRemitToRef, (this.remitToRef!= null), (that.remitToRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsARAccountRef;
            lhsARAccountRef = this.getARAccountRef();
            ReferenceType rhsARAccountRef;
            rhsARAccountRef = that.getARAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arAccountRef", lhsARAccountRef), LocatorUtils.property(thatLocator, "arAccountRef", rhsARAccountRef), lhsARAccountRef, rhsARAccountRef, (this.arAccountRef!= null), (that.arAccountRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsClassRef;
            lhsClassRef = this.getClassRef();
            ReferenceType rhsClassRef;
            rhsClassRef = that.getClassRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classRef", lhsClassRef), LocatorUtils.property(thatLocator, "classRef", rhsClassRef), lhsClassRef, rhsClassRef, (this.classRef!= null), (that.classRef!= null))) {
                return false;
            }
        }
        {
            Date lhsDueDate;
            lhsDueDate = this.getDueDate();
            Date rhsDueDate;
            rhsDueDate = that.getDueDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dueDate", lhsDueDate), LocatorUtils.property(thatLocator, "dueDate", rhsDueDate), lhsDueDate, rhsDueDate, (this.dueDate!= null), (that.dueDate!= null))) {
                return false;
            }
        }
        {
            Date lhsBilledDate;
            lhsBilledDate = this.getBilledDate();
            Date rhsBilledDate;
            rhsBilledDate = that.getBilledDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billedDate", lhsBilledDate), LocatorUtils.property(thatLocator, "billedDate", rhsBilledDate), lhsBilledDate, rhsBilledDate, (this.billedDate!= null), (that.billedDate!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalAmt;
            lhsTotalAmt = this.getTotalAmt();
            BigDecimal rhsTotalAmt;
            rhsTotalAmt = that.getTotalAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalAmt", lhsTotalAmt), LocatorUtils.property(thatLocator, "totalAmt", rhsTotalAmt), lhsTotalAmt, rhsTotalAmt, (this.totalAmt!= null), (that.totalAmt!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsStatementChargeEx;
            lhsStatementChargeEx = this.getStatementChargeEx();
            IntuitAnyType rhsStatementChargeEx;
            rhsStatementChargeEx = that.getStatementChargeEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statementChargeEx", lhsStatementChargeEx), LocatorUtils.property(thatLocator, "statementChargeEx", rhsStatementChargeEx), lhsStatementChargeEx, rhsStatementChargeEx, (this.statementChargeEx!= null), (that.statementChargeEx!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Boolean theCredit;
            theCredit = this.isCredit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "credit", theCredit), currentHashCode, theCredit, (this.credit!= null));
        }
        {
            ReferenceType theCustomerRef;
            theCustomerRef = this.getCustomerRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerRef", theCustomerRef), currentHashCode, theCustomerRef, (this.customerRef!= null));
        }
        {
            ReferenceType theRemitToRef;
            theRemitToRef = this.getRemitToRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remitToRef", theRemitToRef), currentHashCode, theRemitToRef, (this.remitToRef!= null));
        }
        {
            ReferenceType theARAccountRef;
            theARAccountRef = this.getARAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arAccountRef", theARAccountRef), currentHashCode, theARAccountRef, (this.arAccountRef!= null));
        }
        {
            ReferenceType theClassRef;
            theClassRef = this.getClassRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classRef", theClassRef), currentHashCode, theClassRef, (this.classRef!= null));
        }
        {
            Date theDueDate;
            theDueDate = this.getDueDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dueDate", theDueDate), currentHashCode, theDueDate, (this.dueDate!= null));
        }
        {
            Date theBilledDate;
            theBilledDate = this.getBilledDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billedDate", theBilledDate), currentHashCode, theBilledDate, (this.billedDate!= null));
        }
        {
            BigDecimal theTotalAmt;
            theTotalAmt = this.getTotalAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalAmt", theTotalAmt), currentHashCode, theTotalAmt, (this.totalAmt!= null));
        }
        {
            IntuitAnyType theStatementChargeEx;
            theStatementChargeEx = this.getStatementChargeEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statementChargeEx", theStatementChargeEx), currentHashCode, theStatementChargeEx, (this.statementChargeEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
