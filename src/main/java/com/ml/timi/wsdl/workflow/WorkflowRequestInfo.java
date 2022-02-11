
package com.ml.timi.wsdl.workflow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WorkflowRequestInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WorkflowRequestInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forwardButtonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isnextflow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastOperateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastOperatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mustInputRemark" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="needAffirmance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="receiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectButtonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subbackButtonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submitButtonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subnobackButtonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowBaseInfo" type="{http://webservices.workflow.weaver}WorkflowBaseInfo" minOccurs="0"/>
 *         &lt;element name="workflowDetailTableInfos" type="{http://webservices.workflow.weaver}ArrayOfWorkflowDetailTableInfo" minOccurs="0"/>
 *         &lt;element name="workflowHtmlShow" type="{webservices.services.weaver.com.cn}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="workflowHtmlTemplete" type="{webservices.services.weaver.com.cn}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="workflowMainTableInfo" type="{http://webservices.workflow.weaver}WorkflowMainTableInfo" minOccurs="0"/>
 *         &lt;element name="workflowPhrases" type="{webservices.services.weaver.com.cn}ArrayOfArrayOfString" minOccurs="0"/>
 *         &lt;element name="workflowRequestLogs" type="{http://webservices.workflow.weaver}ArrayOfWorkflowRequestLog" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowRequestInfo", namespace = "http://webservices.workflow.weaver", propOrder = {
    "canEdit",
    "canView",
    "createTime",
    "creatorId",
    "creatorName",
    "currentNodeId",
    "currentNodeName",
    "forwardButtonName",
    "isnextflow",
    "lastOperateTime",
    "lastOperatorName",
    "messageType",
    "mustInputRemark",
    "needAffirmance",
    "receiveTime",
    "rejectButtonName",
    "remark",
    "requestId",
    "requestLevel",
    "requestName",
    "secLevel",
    "status",
    "subbackButtonName",
    "submitButtonName",
    "subnobackButtonName",
    "workflowBaseInfo",
    "workflowDetailTableInfos",
    "workflowHtmlShow",
    "workflowHtmlTemplete",
    "workflowMainTableInfo",
    "workflowPhrases",
    "workflowRequestLogs"
})
public class WorkflowRequestInfo {

    protected Boolean canEdit;
    protected Boolean canView;
    @XmlElementRef(name = "createTime", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createTime;
    @XmlElementRef(name = "creatorId", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creatorId;
    @XmlElementRef(name = "creatorName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creatorName;
    @XmlElementRef(name = "currentNodeId", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentNodeId;
    @XmlElementRef(name = "currentNodeName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentNodeName;
    @XmlElementRef(name = "forwardButtonName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forwardButtonName;
    @XmlElementRef(name = "isnextflow", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isnextflow;
    @XmlElementRef(name = "lastOperateTime", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastOperateTime;
    @XmlElementRef(name = "lastOperatorName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastOperatorName;
    @XmlElementRef(name = "messageType", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messageType;
    protected Boolean mustInputRemark;
    protected Boolean needAffirmance;
    @XmlElementRef(name = "receiveTime", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiveTime;
    @XmlElementRef(name = "rejectButtonName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rejectButtonName;
    @XmlElementRef(name = "remark", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remark;
    @XmlElementRef(name = "requestId", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestId;
    @XmlElementRef(name = "requestLevel", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestLevel;
    @XmlElementRef(name = "requestName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestName;
    @XmlElementRef(name = "secLevel", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secLevel;
    @XmlElementRef(name = "status", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "subbackButtonName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subbackButtonName;
    @XmlElementRef(name = "submitButtonName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> submitButtonName;
    @XmlElementRef(name = "subnobackButtonName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subnobackButtonName;
    @XmlElementRef(name = "workflowBaseInfo", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkflowBaseInfo> workflowBaseInfo;
    @XmlElementRef(name = "workflowDetailTableInfos", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWorkflowDetailTableInfo> workflowDetailTableInfos;
    @XmlElementRef(name = "workflowHtmlShow", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfString> workflowHtmlShow;
    @XmlElementRef(name = "workflowHtmlTemplete", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfString> workflowHtmlTemplete;
    @XmlElementRef(name = "workflowMainTableInfo", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkflowMainTableInfo> workflowMainTableInfo;
    @XmlElementRef(name = "workflowPhrases", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfArrayOfString> workflowPhrases;
    @XmlElementRef(name = "workflowRequestLogs", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWorkflowRequestLog> workflowRequestLogs;

    /**
     * ��ȡcanEdit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanEdit() {
        return canEdit;
    }

    /**
     * ����canEdit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanEdit(Boolean value) {
        this.canEdit = value;
    }

    /**
     * ��ȡcanView���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanView() {
        return canView;
    }

    /**
     * ����canView���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanView(Boolean value) {
        this.canView = value;
    }

    /**
     * ��ȡcreateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreateTime() {
        return createTime;
    }

    /**
     * ����createTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreateTime(JAXBElement<String> value) {
        this.createTime = value;
    }

    /**
     * ��ȡcreatorId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatorId() {
        return creatorId;
    }

    /**
     * ����creatorId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatorId(JAXBElement<String> value) {
        this.creatorId = value;
    }

    /**
     * ��ȡcreatorName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatorName() {
        return creatorName;
    }

    /**
     * ����creatorName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatorName(JAXBElement<String> value) {
        this.creatorName = value;
    }

    /**
     * ��ȡcurrentNodeId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentNodeId() {
        return currentNodeId;
    }

    /**
     * ����currentNodeId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentNodeId(JAXBElement<String> value) {
        this.currentNodeId = value;
    }

    /**
     * ��ȡcurrentNodeName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentNodeName() {
        return currentNodeName;
    }

    /**
     * ����currentNodeName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentNodeName(JAXBElement<String> value) {
        this.currentNodeName = value;
    }

    /**
     * ��ȡforwardButtonName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForwardButtonName() {
        return forwardButtonName;
    }

    /**
     * ����forwardButtonName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForwardButtonName(JAXBElement<String> value) {
        this.forwardButtonName = value;
    }

    /**
     * ��ȡisnextflow���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsnextflow() {
        return isnextflow;
    }

    /**
     * ����isnextflow���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsnextflow(JAXBElement<String> value) {
        this.isnextflow = value;
    }

    /**
     * ��ȡlastOperateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastOperateTime() {
        return lastOperateTime;
    }

    /**
     * ����lastOperateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastOperateTime(JAXBElement<String> value) {
        this.lastOperateTime = value;
    }

    /**
     * ��ȡlastOperatorName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastOperatorName() {
        return lastOperatorName;
    }

    /**
     * ����lastOperatorName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastOperatorName(JAXBElement<String> value) {
        this.lastOperatorName = value;
    }

    /**
     * ��ȡmessageType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessageType() {
        return messageType;
    }

    /**
     * ����messageType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessageType(JAXBElement<String> value) {
        this.messageType = value;
    }

    /**
     * ��ȡmustInputRemark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustInputRemark() {
        return mustInputRemark;
    }

    /**
     * ����mustInputRemark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustInputRemark(Boolean value) {
        this.mustInputRemark = value;
    }

    /**
     * ��ȡneedAffirmance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedAffirmance() {
        return needAffirmance;
    }

    /**
     * ����needAffirmance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedAffirmance(Boolean value) {
        this.needAffirmance = value;
    }

    /**
     * ��ȡreceiveTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiveTime() {
        return receiveTime;
    }

    /**
     * ����receiveTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiveTime(JAXBElement<String> value) {
        this.receiveTime = value;
    }

    /**
     * ��ȡrejectButtonName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRejectButtonName() {
        return rejectButtonName;
    }

    /**
     * ����rejectButtonName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRejectButtonName(JAXBElement<String> value) {
        this.rejectButtonName = value;
    }

    /**
     * ��ȡremark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemark() {
        return remark;
    }

    /**
     * ����remark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemark(JAXBElement<String> value) {
        this.remark = value;
    }

    /**
     * ��ȡrequestId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestId() {
        return requestId;
    }

    /**
     * ����requestId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestId(JAXBElement<String> value) {
        this.requestId = value;
    }

    /**
     * ��ȡrequestLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestLevel() {
        return requestLevel;
    }

    /**
     * ����requestLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestLevel(JAXBElement<String> value) {
        this.requestLevel = value;
    }

    /**
     * ��ȡrequestName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestName() {
        return requestName;
    }

    /**
     * ����requestName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestName(JAXBElement<String> value) {
        this.requestName = value;
    }

    /**
     * ��ȡsecLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecLevel() {
        return secLevel;
    }

    /**
     * ����secLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecLevel(JAXBElement<String> value) {
        this.secLevel = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * ��ȡsubbackButtonName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubbackButtonName() {
        return subbackButtonName;
    }

    /**
     * ����subbackButtonName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubbackButtonName(JAXBElement<String> value) {
        this.subbackButtonName = value;
    }

    /**
     * ��ȡsubmitButtonName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubmitButtonName() {
        return submitButtonName;
    }

    /**
     * ����submitButtonName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubmitButtonName(JAXBElement<String> value) {
        this.submitButtonName = value;
    }

    /**
     * ��ȡsubnobackButtonName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubnobackButtonName() {
        return subnobackButtonName;
    }

    /**
     * ����subnobackButtonName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubnobackButtonName(JAXBElement<String> value) {
        this.subnobackButtonName = value;
    }

    /**
     * ��ȡworkflowBaseInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkflowBaseInfo }{@code >}
     *     
     */
    public JAXBElement<WorkflowBaseInfo> getWorkflowBaseInfo() {
        return workflowBaseInfo;
    }

    /**
     * ����workflowBaseInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkflowBaseInfo }{@code >}
     *     
     */
    public void setWorkflowBaseInfo(JAXBElement<WorkflowBaseInfo> value) {
        this.workflowBaseInfo = value;
    }

    /**
     * ��ȡworkflowDetailTableInfos���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkflowDetailTableInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWorkflowDetailTableInfo> getWorkflowDetailTableInfos() {
        return workflowDetailTableInfos;
    }

    /**
     * ����workflowDetailTableInfos���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkflowDetailTableInfo }{@code >}
     *     
     */
    public void setWorkflowDetailTableInfos(JAXBElement<ArrayOfWorkflowDetailTableInfo> value) {
        this.workflowDetailTableInfos = value;
    }

    /**
     * ��ȡworkflowHtmlShow���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getWorkflowHtmlShow() {
        return workflowHtmlShow;
    }

    /**
     * ����workflowHtmlShow���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setWorkflowHtmlShow(JAXBElement<ArrayOfString> value) {
        this.workflowHtmlShow = value;
    }

    /**
     * ��ȡworkflowHtmlTemplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getWorkflowHtmlTemplete() {
        return workflowHtmlTemplete;
    }

    /**
     * ����workflowHtmlTemplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setWorkflowHtmlTemplete(JAXBElement<ArrayOfString> value) {
        this.workflowHtmlTemplete = value;
    }

    /**
     * ��ȡworkflowMainTableInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkflowMainTableInfo }{@code >}
     *     
     */
    public JAXBElement<WorkflowMainTableInfo> getWorkflowMainTableInfo() {
        return workflowMainTableInfo;
    }

    /**
     * ����workflowMainTableInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkflowMainTableInfo }{@code >}
     *     
     */
    public void setWorkflowMainTableInfo(JAXBElement<WorkflowMainTableInfo> value) {
        this.workflowMainTableInfo = value;
    }

    /**
     * ��ȡworkflowPhrases���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfArrayOfString> getWorkflowPhrases() {
        return workflowPhrases;
    }

    /**
     * ����workflowPhrases���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfString }{@code >}
     *     
     */
    public void setWorkflowPhrases(JAXBElement<ArrayOfArrayOfString> value) {
        this.workflowPhrases = value;
    }

    /**
     * ��ȡworkflowRequestLogs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkflowRequestLog }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWorkflowRequestLog> getWorkflowRequestLogs() {
        return workflowRequestLogs;
    }

    /**
     * ����workflowRequestLogs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkflowRequestLog }{@code >}
     *     
     */
    public void setWorkflowRequestLogs(JAXBElement<ArrayOfWorkflowRequestLog> value) {
        this.workflowRequestLogs = value;
    }

}
