package io.heweiming.boot.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_role_menu
 *
 * @mbg.generated do_not_delete_during_merge Sun Sep 24 20:14:47 CST 2017
 */
public class RoleMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.id
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.role_id
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.menu_id
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private Integer menuId;

    /**
     * Database Column Remarks:
     *   激活的
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.activated
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private Boolean activated;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.created_by
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private String createdBy;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.created_date
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private LocalDateTime createdDate;

    /**
     * Database Column Remarks:
     *   最后修改人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.last_modified_by
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private String lastModifiedBy;

    /**
     * Database Column Remarks:
     *   最后修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.last_modified_date
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private LocalDateTime lastModifiedDate;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.remark
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_role_menu
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.id
     *
     * @return the value of t_role_menu.id
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public RoleMenu withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.id
     *
     * @param id the value for t_role_menu.id
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.role_id
     *
     * @return the value of t_role_menu.role_id
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public RoleMenu withRoleId(Integer roleId) {
        this.setRoleId(roleId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.role_id
     *
     * @param roleId the value for t_role_menu.role_id
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.menu_id
     *
     * @return the value of t_role_menu.menu_id
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public RoleMenu withMenuId(Integer menuId) {
        this.setMenuId(menuId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.menu_id
     *
     * @param menuId the value for t_role_menu.menu_id
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.activated
     *
     * @return the value of t_role_menu.activated
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public Boolean getActivated() {
        return activated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public RoleMenu withActivated(Boolean activated) {
        this.setActivated(activated);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.activated
     *
     * @param activated the value for t_role_menu.activated
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.created_by
     *
     * @return the value of t_role_menu.created_by
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public RoleMenu withCreatedBy(String createdBy) {
        this.setCreatedBy(createdBy);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.created_by
     *
     * @param createdBy the value for t_role_menu.created_by
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.created_date
     *
     * @return the value of t_role_menu.created_date
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public RoleMenu withCreatedDate(LocalDateTime createdDate) {
        this.setCreatedDate(createdDate);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.created_date
     *
     * @param createdDate the value for t_role_menu.created_date
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.last_modified_by
     *
     * @return the value of t_role_menu.last_modified_by
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public RoleMenu withLastModifiedBy(String lastModifiedBy) {
        this.setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.last_modified_by
     *
     * @param lastModifiedBy the value for t_role_menu.last_modified_by
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.last_modified_date
     *
     * @return the value of t_role_menu.last_modified_date
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public RoleMenu withLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.last_modified_date
     *
     * @param lastModifiedDate the value for t_role_menu.last_modified_date
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.remark
     *
     * @return the value of t_role_menu.remark
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public RoleMenu withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.remark
     *
     * @param remark the value for t_role_menu.remark
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Sun Sep 24 20:14:47 CST 2017
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}