package com.drawnblue.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "au_user")
public class User {
    /**
     * 主键ID
     */
    @Id
    private Long id;

    /**
     * 登录账号
     */
    @Column(name = "loginCode")
    private String logincode;

    /**
     * 登录密码（初始密码为证件号码后六位）
     */
    private String password;

    /**
     * 二级密码（初始密码为证件号码后六位）
     */
    private String password2;

    /**
     * 用户真实姓名
     */
    @Column(name = "userName")
    private String username;

    /**
     * 性别
     */
    private String sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 证件类型id
     */
    @Column(name = "cardType")
    private String cardtype;

    /**
     * 证件类型名称
     */
    @Column(name = "cardTypeName")
    private String cardtypename;

    /**
     * 证件号码
     */
    @Column(name = "idCard")
    private String idcard;

    /**
     * 收货国家
     */
    private String country;

    /**
     * 手机
     */
    private String mobile;

    /**
     * email
     */
    private String email;

    /**
     * 收获地址
     */
    @Column(name = "userAddress")
    private String useraddress;

    /**
     * 邮编
     */
    @Column(name = "postCode")
    private String postcode;

    /**
     * 注册时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 推荐人id（默认为当前登录用户id）
     */
    @Column(name = "referId")
    private Long referid;

    /**
     * 推荐人编码（默认为当前登录用户loginCode）
     */
    @Column(name = "referCode")
    private String refercode;

    /**
     * 所属角色ID
     */
    @Column(name = "roleId")
    private Long roleid;

    /**
     * 所属角色名称
     */
    @Column(name = "roleName")
    private String rolename;

    /**
     * 用户类型id
     */
    @Column(name = "userType")
    private String usertype;

    /**
     * 用户类型名称
     */
    @Column(name = "userTypeName")
    private String usertypename;

    /**
     * 是否启用（1、启用2、未启用）
     */
    @Column(name = "isStart")
    private Integer isstart;

    /**
     * 最新更新时间
     */
    @Column(name = "lastUpdateTime")
    private Date lastupdatetime;

    /**
     * 最后登录时间
     */
    @Column(name = "lastLoginTime")
    private Date lastlogintime;

    /**
     * 开户卡号
     */
    @Column(name = "bankAccount")
    private String bankaccount;

    /**
     * 开户行
     */
    @Column(name = "bankName")
    private String bankname;

    /**
     * 开户人
     */
    @Column(name = "accountHolder")
    private String accountholder;

    /**
     * 身份证照片存放路径
     */
    @Column(name = "idCardPicPath")
    private String idcardpicpath;

    /**
     * 银行卡照片存放路径
     */
    @Column(name = "bankPicPath")
    private String bankpicpath;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取登录账号
     *
     * @return loginCode - 登录账号
     */
    public String getLogincode() {
        return logincode;
    }

    /**
     * 设置登录账号
     *
     * @param logincode 登录账号
     */
    public void setLogincode(String logincode) {
        this.logincode = logincode;
    }

    /**
     * 获取登录密码（初始密码为证件号码后六位）
     *
     * @return password - 登录密码（初始密码为证件号码后六位）
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置登录密码（初始密码为证件号码后六位）
     *
     * @param password 登录密码（初始密码为证件号码后六位）
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取二级密码（初始密码为证件号码后六位）
     *
     * @return password2 - 二级密码（初始密码为证件号码后六位）
     */
    public String getPassword2() {
        return password2;
    }

    /**
     * 设置二级密码（初始密码为证件号码后六位）
     *
     * @param password2 二级密码（初始密码为证件号码后六位）
     */
    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    /**
     * 获取用户真实姓名
     *
     * @return userName - 用户真实姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户真实姓名
     *
     * @param username 用户真实姓名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取证件类型id
     *
     * @return cardType - 证件类型id
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     * 设置证件类型id
     *
     * @param cardtype 证件类型id
     */
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    /**
     * 获取证件类型名称
     *
     * @return cardTypeName - 证件类型名称
     */
    public String getCardtypename() {
        return cardtypename;
    }

    /**
     * 设置证件类型名称
     *
     * @param cardtypename 证件类型名称
     */
    public void setCardtypename(String cardtypename) {
        this.cardtypename = cardtypename;
    }

    /**
     * 获取证件号码
     *
     * @return idCard - 证件号码
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置证件号码
     *
     * @param idcard 证件号码
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获取收货国家
     *
     * @return country - 收货国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置收货国家
     *
     * @param country 收货国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取手机
     *
     * @return mobile - 手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机
     *
     * @param mobile 手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取email
     *
     * @return email - email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email
     *
     * @param email email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取收获地址
     *
     * @return userAddress - 收获地址
     */
    public String getUseraddress() {
        return useraddress;
    }

    /**
     * 设置收获地址
     *
     * @param useraddress 收获地址
     */
    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    /**
     * 获取邮编
     *
     * @return postCode - 邮编
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 设置邮编
     *
     * @param postcode 邮编
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * 获取注册时间
     *
     * @return createTime - 注册时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置注册时间
     *
     * @param createtime 注册时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取推荐人id（默认为当前登录用户id）
     *
     * @return referId - 推荐人id（默认为当前登录用户id）
     */
    public Long getReferid() {
        return referid;
    }

    /**
     * 设置推荐人id（默认为当前登录用户id）
     *
     * @param referid 推荐人id（默认为当前登录用户id）
     */
    public void setReferid(Long referid) {
        this.referid = referid;
    }

    /**
     * 获取推荐人编码（默认为当前登录用户loginCode）
     *
     * @return referCode - 推荐人编码（默认为当前登录用户loginCode）
     */
    public String getRefercode() {
        return refercode;
    }

    /**
     * 设置推荐人编码（默认为当前登录用户loginCode）
     *
     * @param refercode 推荐人编码（默认为当前登录用户loginCode）
     */
    public void setRefercode(String refercode) {
        this.refercode = refercode;
    }

    /**
     * 获取所属角色ID
     *
     * @return roleId - 所属角色ID
     */
    public Long getRoleid() {
        return roleid;
    }

    /**
     * 设置所属角色ID
     *
     * @param roleid 所属角色ID
     */
    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取所属角色名称
     *
     * @return roleName - 所属角色名称
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * 设置所属角色名称
     *
     * @param rolename 所属角色名称
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
     * 获取用户类型id
     *
     * @return userType - 用户类型id
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * 设置用户类型id
     *
     * @param usertype 用户类型id
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    /**
     * 获取用户类型名称
     *
     * @return userTypeName - 用户类型名称
     */
    public String getUsertypename() {
        return usertypename;
    }

    /**
     * 设置用户类型名称
     *
     * @param usertypename 用户类型名称
     */
    public void setUsertypename(String usertypename) {
        this.usertypename = usertypename;
    }

    /**
     * 获取是否启用（1、启用2、未启用）
     *
     * @return isStart - 是否启用（1、启用2、未启用）
     */
    public Integer getIsstart() {
        return isstart;
    }

    /**
     * 设置是否启用（1、启用2、未启用）
     *
     * @param isstart 是否启用（1、启用2、未启用）
     */
    public void setIsstart(Integer isstart) {
        this.isstart = isstart;
    }

    /**
     * 获取最新更新时间
     *
     * @return lastUpdateTime - 最新更新时间
     */
    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    /**
     * 设置最新更新时间
     *
     * @param lastupdatetime 最新更新时间
     */
    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    /**
     * 获取最后登录时间
     *
     * @return lastLoginTime - 最后登录时间
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastlogintime 最后登录时间
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * 获取开户卡号
     *
     * @return bankAccount - 开户卡号
     */
    public String getBankaccount() {
        return bankaccount;
    }

    /**
     * 设置开户卡号
     *
     * @param bankaccount 开户卡号
     */
    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    /**
     * 获取开户行
     *
     * @return bankName - 开户行
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * 设置开户行
     *
     * @param bankname 开户行
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
     * 获取开户人
     *
     * @return accountHolder - 开户人
     */
    public String getAccountholder() {
        return accountholder;
    }

    /**
     * 设置开户人
     *
     * @param accountholder 开户人
     */
    public void setAccountholder(String accountholder) {
        this.accountholder = accountholder;
    }

    /**
     * 获取身份证照片存放路径
     *
     * @return idCardPicPath - 身份证照片存放路径
     */
    public String getIdcardpicpath() {
        return idcardpicpath;
    }

    /**
     * 设置身份证照片存放路径
     *
     * @param idcardpicpath 身份证照片存放路径
     */
    public void setIdcardpicpath(String idcardpicpath) {
        this.idcardpicpath = idcardpicpath;
    }

    /**
     * 获取银行卡照片存放路径
     *
     * @return bankPicPath - 银行卡照片存放路径
     */
    public String getBankpicpath() {
        return bankpicpath;
    }

    /**
     * 设置银行卡照片存放路径
     *
     * @param bankpicpath 银行卡照片存放路径
     */
    public void setBankpicpath(String bankpicpath) {
        this.bankpicpath = bankpicpath;
    }
}