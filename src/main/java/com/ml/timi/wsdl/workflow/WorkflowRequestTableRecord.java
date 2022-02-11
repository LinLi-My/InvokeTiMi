
package com.ml.timi.wsdl.workflow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WorkflowRequestTableRecord complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WorkflowRequestTableRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="workflowRequestTableFields" type="{http://webservices.workflow.weaver}ArrayOfWorkflowRequestTableField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowRequestTableRecord", namespace = "http://webservices.workflow.weaver", propOrder = {
    "recordOrder",
    "workflowRequestTableFields"
})
public class WorkflowRequestTableRecord {

    protected Integer recordOrder;
    @XmlElementRef(name = "workflowRequestTableFields", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWorkflowRequestTableField> workflowRequestTableFields;

    /**
     * ��ȡrecordOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecordOrder() {
        return recordOrder;
    }

    /**
     * ����recordOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecordOrder(Integer value) {
        this.recordOrder = value;
    }

    /**
     * ��ȡworkflowRequestTableFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkflowRequestTableField }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWorkflowRequestTableField> getWorkflowRequestTableFields() {
        return workflowRequestTableFields;
    }

    /**
     * ����workflowRequestTableFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkflowRequestTableField }{@code >}
     *     
     */
    public void setWorkflowRequestTableFields(JAXBElement<ArrayOfWorkflowRequestTableField> value) {
        this.workflowRequestTableFields = value;
    }

}
