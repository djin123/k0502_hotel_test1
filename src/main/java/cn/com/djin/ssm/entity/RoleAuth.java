package cn.com.djin.ssm.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *  角色权限关系实体封装类
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class RoleAuth {
    /** 主键 */
    private Integer id;

    /** 角色id */
    private Integer roleId;

    /** 权限id */
    private Integer authId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    @Override
    public String toString() {
        return "RoleAuth{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", authId=" + authId +
                '}';
    }
}