package io.heweiming.boot.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_role
 *
 * @mbg.generated do_not_delete_during_merge Sun Sep 24 20:14:47 CST 2017
 */
public class Role implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.id
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.role_no
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private String roleNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.name
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.description
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.state
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private String state;

    /**
     * Database Column Remarks:
     *   激活的
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.activated
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private Boolean activated;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.created_by
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private String createdBy;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.created_date
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private LocalDateTime createdDate;

    /**
     * Database Column Remarks:
     *   最后修改人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.last_modified_by
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private String lastModifiedBy;

    /**
     * Database Column Remarks:
     *   最后修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.last_modified_date
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private LocalDateTime lastModifiedDate;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.remark
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_role
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.id
     *
     * @return the value of t_role.id
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Role withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.id
     *
     * @param id the value for t_role.id
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.role_no
     *
     * @return the value of t_role.role_no
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public String getRoleNo() {
        return roleNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Role withRoleNo(String roleNo) {
        this.setRoleNo(roleNo);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.role_no
     *
     * @param roleNo the value for t_role.role_no
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.name
     *
     * @return the value of t_role.name
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Role withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.name
     *
     * @param name the value for t_role.name
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.description
     *
     * @return the value of t_role.description
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Role withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.description
     *
     * @param description the value for t_role.description
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.state
     *
     * @return the value of t_role.state
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Role withState(String state) {
        this.setState(state);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.state
     *
     * @param state the value for t_role.state
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.activated
     *
     * @return the value of t_role.activated
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Boolean getActivated() {
        return activated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Role withActivated(Boolean activated) {
        this.setActivated(activated);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.activated
     *
     * @param activated the value for t_role.activated
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.created_by
     *
     * @return the value of t_role.created_by
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Role withCreatedBy(String createdBy) {
        this.setCreatedBy(createdBy);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.created_by
     *
     * @param createdBy the value for t_role.created_by
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.created_date
     *
     * @return the value of t_role.created_date
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Role withCreatedDate(LocalDateTime createdDate) {
        this.setCreatedDate(createdDate);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.created_date
     *
     * @param createdDate the value for t_role.created_date
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.last_modified_by
     *
     * @return the value of t_role.last_modified_by
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Role withLastModifiedBy(String lastModifiedBy) {
        this.setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.last_modified_by
     *
     * @param lastModifiedBy the value for t_role.last_modified_by
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.last_modified_date
     *
     * @return the value of t_role.last_modified_date
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Role withLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.last_modified_date
     *
     * @param lastModifiedDate the value for t_role.last_modified_date
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.remark
     *
     * @return the value of t_role.remark
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Role withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.remark
     *
     * @param remark the value for t_role.remark
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}