package io.heweiming.boot.service.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_operation_log
 *
 * @mbg.generated do_not_delete_during_merge Sat Sep 23 23:42:48 CST 2017
 */
public class OperationLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_log.id
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_log.operation_type
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    private String operationType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_log.operation_module
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    private String operationModule;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_log.operation_content
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    private String operationContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_log.user_id
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_log.operation_time
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    private LocalDateTime operationTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_log.operation_ip
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    private String operationIp;

    /**
     * Database Column Remarks:
     *   激活的
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_log.activated
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    private Boolean activated;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_log.created_by
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    private String createdBy;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_log.created_date
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    private LocalDateTime createdDate;

    /**
     * Database Column Remarks:
     *   最后修改人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_log.last_modified_by
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    private String lastModifiedBy;

    /**
     * Database Column Remarks:
     *   最后修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_log.last_modified_date
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    private LocalDateTime lastModifiedDate;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_log.remark
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_log.id
     *
     * @return the value of t_operation_log.id
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public OperationLog withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_log.id
     *
     * @param id the value for t_operation_log.id
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_log.operation_type
     *
     * @return the value of t_operation_log.operation_type
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public OperationLog withOperationType(String operationType) {
        this.setOperationType(operationType);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_log.operation_type
     *
     * @param operationType the value for t_operation_log.operation_type
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_log.operation_module
     *
     * @return the value of t_operation_log.operation_module
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public String getOperationModule() {
        return operationModule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public OperationLog withOperationModule(String operationModule) {
        this.setOperationModule(operationModule);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_log.operation_module
     *
     * @param operationModule the value for t_operation_log.operation_module
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public void setOperationModule(String operationModule) {
        this.operationModule = operationModule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_log.operation_content
     *
     * @return the value of t_operation_log.operation_content
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public String getOperationContent() {
        return operationContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public OperationLog withOperationContent(String operationContent) {
        this.setOperationContent(operationContent);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_log.operation_content
     *
     * @param operationContent the value for t_operation_log.operation_content
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public void setOperationContent(String operationContent) {
        this.operationContent = operationContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_log.user_id
     *
     * @return the value of t_operation_log.user_id
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public OperationLog withUserId(Integer userId) {
        this.setUserId(userId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_log.user_id
     *
     * @param userId the value for t_operation_log.user_id
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_log.operation_time
     *
     * @return the value of t_operation_log.operation_time
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public LocalDateTime getOperationTime() {
        return operationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public OperationLog withOperationTime(LocalDateTime operationTime) {
        this.setOperationTime(operationTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_log.operation_time
     *
     * @param operationTime the value for t_operation_log.operation_time
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public void setOperationTime(LocalDateTime operationTime) {
        this.operationTime = operationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_log.operation_ip
     *
     * @return the value of t_operation_log.operation_ip
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public String getOperationIp() {
        return operationIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public OperationLog withOperationIp(String operationIp) {
        this.setOperationIp(operationIp);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_log.operation_ip
     *
     * @param operationIp the value for t_operation_log.operation_ip
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public void setOperationIp(String operationIp) {
        this.operationIp = operationIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_log.activated
     *
     * @return the value of t_operation_log.activated
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public Boolean getActivated() {
        return activated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public OperationLog withActivated(Boolean activated) {
        this.setActivated(activated);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_log.activated
     *
     * @param activated the value for t_operation_log.activated
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_log.created_by
     *
     * @return the value of t_operation_log.created_by
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public OperationLog withCreatedBy(String createdBy) {
        this.setCreatedBy(createdBy);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_log.created_by
     *
     * @param createdBy the value for t_operation_log.created_by
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_log.created_date
     *
     * @return the value of t_operation_log.created_date
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public OperationLog withCreatedDate(LocalDateTime createdDate) {
        this.setCreatedDate(createdDate);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_log.created_date
     *
     * @param createdDate the value for t_operation_log.created_date
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_log.last_modified_by
     *
     * @return the value of t_operation_log.last_modified_by
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public OperationLog withLastModifiedBy(String lastModifiedBy) {
        this.setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_log.last_modified_by
     *
     * @param lastModifiedBy the value for t_operation_log.last_modified_by
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_log.last_modified_date
     *
     * @return the value of t_operation_log.last_modified_date
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public OperationLog withLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_log.last_modified_date
     *
     * @param lastModifiedDate the value for t_operation_log.last_modified_date
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_log.remark
     *
     * @return the value of t_operation_log.remark
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public OperationLog withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_log.remark
     *
     * @param remark the value for t_operation_log.remark
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 23:42:48 CST 2017
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}