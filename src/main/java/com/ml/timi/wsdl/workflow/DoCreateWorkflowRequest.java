
package com.ml.timi.wsdl.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="in0" type="{http://webservices.workflow.weaver}WorkflowRequestInfo"/>
 *         &lt;element name="in1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "in0",
    "in1"
})
@XmlRootElement(name = "doCreateWorkflowRequest")
public class DoCreateWorkflowRequest {

    @XmlElement(required = true, nillable = true)
    protected WorkflowRequestInfo in0;
    protected int in1;

    /**
     * ��ȡin0���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WorkflowRequestInfo }
     *     
     */
    public WorkflowRequestInfo getIn0() {
        return in0;
    }

    /**
     * ����in0���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowRequestInfo }
     *     
     */
    public void setIn0(WorkflowRequestInfo value) {
        this.in0 = value;
    }

    /**
     * ��ȡin1���Ե�ֵ��
     * 
     */
    public int getIn1() {
        return in1;
    }

    /**
     * ����in1���Ե�ֵ��
     * 
     */
    public void setIn1(int value) {
        this.in1 = value;
    }

}