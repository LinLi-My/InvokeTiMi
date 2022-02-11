
package com.ml.timi.wsdl.workflow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WorkflowDetailTableInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WorkflowDetailTableInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tableDBName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tableFieldName" type="{webservices.services.weaver.com.cn}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="tableTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowRequestTableRecords" type="{http://webservices.workflow.weaver}ArrayOfWorkflowRequestTableRecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowDetailTableInfo", namespace = "http://webservices.workflow.weaver", propOrder = {
    "tableDBName",
    "tableFieldName",
    "tableTitle",
    "workflowRequestTableRecords"
})
public class WorkflowDetailTableInfo {

    @XmlElementRef(name = "tableDBName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tableDBName;
    @XmlElementRef(name = "tableFieldName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfString> tableFieldName;
    @XmlElementRef(name = "tableTitle", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tableTitle;
    @XmlElementRef(name = "workflowRequestTableRecords", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWorkflowRequestTableRecord> workflowRequestTableRecords;

    /**
     * ��ȡtableDBName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTableDBName() {
        return tableDBName;
    }

    /**
     * ����tableDBName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTableDBName(JAXBElement<String> value) {
        this.tableDBName = value;
    }

    /**
     * ��ȡtableFieldName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getTableFieldName() {
        return tableFieldName;
    }

    /**
     * ����tableFieldName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setTableFieldName(JAXBElement<ArrayOfString> value) {
        this.tableFieldName = value;
    }

    /**
     * ��ȡtableTitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTableTitle() {
        return tableTitle;
    }

    /**
     * ����tableTitle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTableTitle(JAXBElement<String> value) {
        this.tableTitle = value;
    }

    /**
     * ��ȡworkflowRequestTableRecords���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkflowRequestTableRecord }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWorkflowRequestTableRecord> getWorkflowRequestTableRecords() {
        return workflowRequestTableRecords;
    }

    /**
     * ����workflowRequestTableRecords���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkflowRequestTableRecord }{@code >}
     *     
     */
    public void setWorkflowRequestTableRecords(JAXBElement<ArrayOfWorkflowRequestTableRecord> value) {
        this.workflowRequestTableRecords = value;
    }

}
