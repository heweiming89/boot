package io.heweiming.boot.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 
 */
@Table(name="t_product_sales_manager")
public class TProductSalesManager implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 产品SKU
     */
    private String sku;

    /**
     * 销售经理ID
     */
    private Integer sales_manager_id;

    /**
     * 销售经理姓名
     */
    private String sales_manager_name;

    /**
     * 经理类型
     */
    private Byte type;

    /**
     * 创建时间
     */
    private Date create_date;

    /**
     * 创建人
     */
    @NotEmpty
    private String create_user_id;

    /**
     * 创建用户名
     */
    private String create_username;

    /**
     * 修改时间
     */
    private Date modify_date;

    /**
     * 修改人
     */
    @NotEmpty
    private String modify_user_id;

    /**
     * 修改用户名
     */
    private String modify_username;

    /**
     * 删除时间
     */
    private Date delete_date;

    /**
     * 删除人
     */
    private String delete_user_id;

    /**
     * 删除用户名
     */
    private String delete_username;

    /**
     * 是否删除
     */
    @NotEmpty
    private Boolean is_deleted;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getSales_manager_id() {
        return sales_manager_id;
    }

    public void setSales_manager_id(Integer sales_manager_id) {
        this.sales_manager_id = sales_manager_id;
    }

    public String getSales_manager_name() {
        return sales_manager_name;
    }

    public void setSales_manager_name(String sales_manager_name) {
        this.sales_manager_name = sales_manager_name;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(String create_user_id) {
        this.create_user_id = create_user_id;
    }

    public String getCreate_username() {
        return create_username;
    }

    public void setCreate_username(String create_username) {
        this.create_username = create_username;
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }

    public String getModify_user_id() {
        return modify_user_id;
    }

    public void setModify_user_id(String modify_user_id) {
        this.modify_user_id = modify_user_id;
    }

    public String getModify_username() {
        return modify_username;
    }

    public void setModify_username(String modify_username) {
        this.modify_username = modify_username;
    }

    public Date getDelete_date() {
        return delete_date;
    }

    public void setDelete_date(Date delete_date) {
        this.delete_date = delete_date;
    }

    public String getDelete_user_id() {
        return delete_user_id;
    }

    public void setDelete_user_id(String delete_user_id) {
        this.delete_user_id = delete_user_id;
    }

    public String getDelete_username() {
        return delete_username;
    }

    public void setDelete_username(String delete_username) {
        this.delete_username = delete_username;
    }

    public Boolean getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TProductSalesManager other = (TProductSalesManager) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getSales_manager_id() == null ? other.getSales_manager_id() == null : this.getSales_manager_id().equals(other.getSales_manager_id()))
            && (this.getSales_manager_name() == null ? other.getSales_manager_name() == null : this.getSales_manager_name().equals(other.getSales_manager_name()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getCreate_user_id() == null ? other.getCreate_user_id() == null : this.getCreate_user_id().equals(other.getCreate_user_id()))
            && (this.getCreate_username() == null ? other.getCreate_username() == null : this.getCreate_username().equals(other.getCreate_username()))
            && (this.getModify_date() == null ? other.getModify_date() == null : this.getModify_date().equals(other.getModify_date()))
            && (this.getModify_user_id() == null ? other.getModify_user_id() == null : this.getModify_user_id().equals(other.getModify_user_id()))
            && (this.getModify_username() == null ? other.getModify_username() == null : this.getModify_username().equals(other.getModify_username()))
            && (this.getDelete_date() == null ? other.getDelete_date() == null : this.getDelete_date().equals(other.getDelete_date()))
            && (this.getDelete_user_id() == null ? other.getDelete_user_id() == null : this.getDelete_user_id().equals(other.getDelete_user_id()))
            && (this.getDelete_username() == null ? other.getDelete_username() == null : this.getDelete_username().equals(other.getDelete_username()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getSales_manager_id() == null) ? 0 : getSales_manager_id().hashCode());
        result = prime * result + ((getSales_manager_name() == null) ? 0 : getSales_manager_name().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getCreate_user_id() == null) ? 0 : getCreate_user_id().hashCode());
        result = prime * result + ((getCreate_username() == null) ? 0 : getCreate_username().hashCode());
        result = prime * result + ((getModify_date() == null) ? 0 : getModify_date().hashCode());
        result = prime * result + ((getModify_user_id() == null) ? 0 : getModify_user_id().hashCode());
        result = prime * result + ((getModify_username() == null) ? 0 : getModify_username().hashCode());
        result = prime * result + ((getDelete_date() == null) ? 0 : getDelete_date().hashCode());
        result = prime * result + ((getDelete_user_id() == null) ? 0 : getDelete_user_id().hashCode());
        result = prime * result + ((getDelete_username() == null) ? 0 : getDelete_username().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sku=").append(sku);
        sb.append(", sales_manager_id=").append(sales_manager_id);
        sb.append(", sales_manager_name=").append(sales_manager_name);
        sb.append(", type=").append(type);
        sb.append(", create_date=").append(create_date);
        sb.append(", create_user_id=").append(create_user_id);
        sb.append(", create_username=").append(create_username);
        sb.append(", modify_date=").append(modify_date);
        sb.append(", modify_user_id=").append(modify_user_id);
        sb.append(", modify_username=").append(modify_username);
        sb.append(", delete_date=").append(delete_date);
        sb.append(", delete_user_id=").append(delete_user_id);
        sb.append(", delete_username=").append(delete_username);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}