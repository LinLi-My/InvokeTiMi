
package com.ml.timi.wsdl.workflow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WorkflowRequestTableField complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WorkflowRequestTableField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="browserurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fieldDBType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldHtmlType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fieldShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldShowValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filedHtmlShow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mand" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="selectnames" type="{webservices.services.weaver.com.cn}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="selectvalues" type="{webservices.services.weaver.com.cn}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="view" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowRequestTableField", namespace = "http://webservices.workflow.weaver", propOrder = {
    "browserurl",
    "edit",
    "fieldDBType",
    "fieldFormName",
    "fieldHtmlType",
    "fieldId",
    "fieldName",
    "fieldOrder",
    "fieldShowName",
    "fieldShowValue",
    "fieldType",
    "fieldValue",
    "filedHtmlShow",
    "mand",
    "selectnames",
    "selectvalues",
    "view"
})
public class WorkflowRequestTableField {

    @XmlElementRef(name = "browserurl", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> browserurl;
    protected Boolean edit;
    @XmlElementRef(name = "fieldDBType", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldDBType;
    @XmlElementRef(name = "fieldFormName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldFormName;
    @XmlElementRef(name = "fieldHtmlType", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldHtmlType;
    @XmlElementRef(name = "fieldId", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldId;
    @XmlElementRef(name = "fieldName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldName;
    protected Integer fieldOrder;
    @XmlElementRef(name = "fieldShowName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldShowName;
    @XmlElementRef(name = "fieldShowValue", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldShowValue;
    @XmlElementRef(name = "fieldType", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldType;
    @XmlElementRef(name = "fieldValue", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldValue;
    @XmlElementRef(name = "filedHtmlShow", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filedHtmlShow;
    protected Boolean mand;
    @XmlElementRef(name = "selectnames", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfString> selectnames;
    @XmlElementRef(name = "selectvalues", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfString> selectvalues;
    protected Boolean view;

    /**
     * ��ȡbrowserurl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrowserurl() {
        return browserurl;
    }

    /**
     * ����browserurl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrowserurl(JAXBElement<String> value) {
        this.browserurl = value;
    }

    /**
     * ��ȡedit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEdit() {
        return edit;
    }

    /**
     * ����edit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEdit(Boolean value) {
        this.edit = value;
    }

    /**
     * ��ȡfieldDBType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldDBType() {
        return fieldDBType;
    }

    /**
     * ����fieldDBType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldDBType(JAXBElement<String> value) {
        this.fieldDBType = value;
    }

    /**
     * ��ȡfieldFormName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldFormName() {
        return fieldFormName;
    }

    /**
     * ����fieldFormName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldFormName(JAXBElement<String> value) {
        this.fieldFormName = value;
    }

    /**
     * ��ȡfieldHtmlType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldHtmlType() {
        return fieldHtmlType;
    }

    /**
     * ����fieldHtmlType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldHtmlType(JAXBElement<String> value) {
        this.fieldHtmlType = value;
    }

    /**
     * ��ȡfieldId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldId() {
        return fieldId;
    }

    /**
     * ����fieldId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldId(JAXBElement<String> value) {
        this.fieldId = value;
    }

    /**
     * ��ȡfieldName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldName() {
        return fieldName;
    }

    /**
     * ����fieldName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldName(JAXBElement<String> value) {
        this.fieldName = value;
    }

    /**
     * ��ȡfieldOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFieldOrder() {
        return fieldOrder;
    }

    /**
     * ����fieldOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFieldOrder(Integer value) {
        this.fieldOrder = value;
    }

    /**
     * ��ȡfieldShowName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldShowName() {
        return fieldShowName;
    }

    /**
     * ����fieldShowName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldShowName(JAXBElement<String> value) {
        this.fieldShowName = value;
    }

    /**
     * ��ȡfieldShowValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldShowValue() {
        return fieldShowValue;
    }

    /**
     * ����fieldShowValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldShowValue(JAXBElement<String> value) {
        this.fieldShowValue = value;
    }

    /**
     * ��ȡfieldType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldType() {
        return fieldType;
    }

    /**
     * ����fieldType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldType(JAXBElement<String> value) {
        this.fieldType = value;
    }

    /**
     * ��ȡfieldValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldValue() {
        return fieldValue;
    }

    /**
     * ����fieldValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldValue(JAXBElement<String> value) {
        this.fieldValue = value;
    }

    /**
     * ��ȡfiledHtmlShow���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiledHtmlShow() {
        return filedHtmlShow;
    }

    /**
     * ����filedHtmlShow���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiledHtmlShow(JAXBElement<String> value) {
        this.filedHtmlShow = value;
    }

    /**
     * ��ȡmand���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMand() {
        return mand;
    }

    /**
     * ����mand���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMand(Boolean value) {
        this.mand = value;
    }

    /**
     * ��ȡselectnames���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getSelectnames() {
        return selectnames;
    }

    /**
     * ����selectnames���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setSelectnames(JAXBElement<ArrayOfString> value) {
        this.selectnames = value;
    }

    /**
     * ��ȡselectvalues���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getSelectvalues() {
        return selectvalues;
    }

    /**
     * ����selectvalues���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setSelectvalues(JAXBElement<ArrayOfString> value) {
        this.selectvalues = value;
    }

    /**
     * ��ȡview���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isView() {
        return view;
    }

    /**
     * ����view���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setView(Boolean value) {
        this.view = value;
    }

}
