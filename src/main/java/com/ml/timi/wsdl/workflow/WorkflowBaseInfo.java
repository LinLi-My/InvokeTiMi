
package com.ml.timi.wsdl.workflow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WorkflowBaseInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WorkflowBaseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workflowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowBaseInfo", namespace = "http://webservices.workflow.weaver", propOrder = {
    "workflowId",
    "workflowName",
    "workflowTypeId",
    "workflowTypeName"
})
public class WorkflowBaseInfo {

    @XmlElementRef(name = "workflowId", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workflowId;
    @XmlElementRef(name = "workflowName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workflowName;
    @XmlElementRef(name = "workflowTypeId", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workflowTypeId;
    @XmlElementRef(name = "workflowTypeName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workflowTypeName;

    /**
     * ��ȡworkflowId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkflowId() {
        return workflowId;
    }

    /**
     * ����workflowId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkflowId(JAXBElement<String> value) {
        this.workflowId = value;
    }

    /**
     * ��ȡworkflowName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkflowName() {
        return workflowName;
    }

    /**
     * ����workflowName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkflowName(JAXBElement<String> value) {
        this.workflowName = value;
    }

    /**
     * ��ȡworkflowTypeId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkflowTypeId() {
        return workflowTypeId;
    }

    /**
     * ����workflowTypeId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkflowTypeId(JAXBElement<String> value) {
        this.workflowTypeId = value;
    }

    /**
     * ��ȡworkflowTypeName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkflowTypeName() {
        return workflowTypeName;
    }

    /**
     * ����workflowTypeName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkflowTypeName(JAXBElement<String> value) {
        this.workflowTypeName = value;
    }

}
