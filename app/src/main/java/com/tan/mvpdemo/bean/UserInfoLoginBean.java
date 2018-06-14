package com.tan.mvpdemo.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by tanjun on 2018/5/31.
 * 登陆返回的用户信息
 */

public class UserInfoLoginBean implements Serializable {

    /**
     * permissionKey : ["zmxAPI:INSTALL","zmxAPI:MONITORS","zmxAPI:WARDEN"]
     * alias : bddedb41c5d8af7816c6bee0d1193388
     * userName : hq0001
     * userId : 14
     * token : afd71767e4fd78110c46ad0cba10e6cf
     */

    /** 极光alias */
    private String alias;
    /** 用户名 */
    private String userName;
    /** 用户id */
    private String userId;
    /** token */
    private String token;
    /** 权限列表 */
    private ArrayList<String> permissionKey;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ArrayList<String> getPermissionKey() {
        return permissionKey;
    }

    public void setPermissionKey(ArrayList<String> permissionKey) {
        this.permissionKey = permissionKey;
    }

    /** 极光托送alias *//*
    private String alias;
    *//** 返回的 *//*
    private String userName;
    *//** userId *//*
    private String userId;
    *//** token *//*
    private String token;
    *//** 权限列表 *//*
    private List<MenuPermissionBean> menuPermission;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<MenuPermissionBean> getMenuPermission() {
        return menuPermission;
    }

    public void setMenuPermission(List<MenuPermissionBean> menuPermission) {
        this.menuPermission = menuPermission;
    }

    public static class MenuPermissionBean {
        *//**
         * permissionKey : dytApi:ASSESS
         * permissionName : 车辆评估
         * dimensionKey : MENU
         * userId : 78
         * templateId : 10
         * tenantId : null
         * recStatus : A
         * createdBy : system
         * createdDate : 1505310275000
         * updatedBy : system
         * updatedDate : 1505310275000
         *//*

        private String permissionKey;
        private String permissionName;
        private String dimensionKey;
        private int userId;
        private int templateId;
        private Object tenantId;
        private String recStatus;
        private String createdBy;
        private long createdDate;
        private String updatedBy;
        private long updatedDate;

        public String getPermissionKey() {
            return permissionKey;
        }

        public void setPermissionKey(String permissionKey) {
            this.permissionKey = permissionKey;
        }

        public String getPermissionName() {
            return permissionName;
        }

        public void setPermissionName(String permissionName) {
            this.permissionName = permissionName;
        }

        public String getDimensionKey() {
            return dimensionKey;
        }

        public void setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getTemplateId() {
            return templateId;
        }

        public void setTemplateId(int templateId) {
            this.templateId = templateId;
        }

        public Object getTenantId() {
            return tenantId;
        }

        public void setTenantId(Object tenantId) {
            this.tenantId = tenantId;
        }

        public String getRecStatus() {
            return recStatus;
        }

        public void setRecStatus(String recStatus) {
            this.recStatus = recStatus;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public long getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(long createdDate) {
            this.createdDate = createdDate;
        }

        public String getUpdatedBy() {
            return updatedBy;
        }

        public void setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
        }

        public long getUpdatedDate() {
            return updatedDate;
        }

        public void setUpdatedDate(long updatedDate) {
            this.updatedDate = updatedDate;
        }
    }*/

}
