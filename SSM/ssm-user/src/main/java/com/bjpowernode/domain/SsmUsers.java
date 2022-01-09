package com.bjpowernode.domain;

public class SsmUsers {
    private String userId;
    private String cardType;
    private String cardNo;
    private String userName;
    private String userSex;
    private String userAge;
    private String userRole;

    @Override
    public String toString() {
        return "SsmUsers{" +
                "userId='" + userId + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userAge='" + userAge + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public SsmUsers setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getCardType() {
        return cardType;
    }

    public SsmUsers setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }

    public String getCardNo() {
        return cardNo;
    }

    public SsmUsers setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public SsmUsers setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserSex() {
        return userSex;
    }

    public SsmUsers setUserSex(String userSex) {
        this.userSex = userSex;
        return this;
    }

    public String getUserAge() {
        return userAge;
    }

    public SsmUsers setUserAge(String userAge) {
        this.userAge = userAge;
        return this;
    }

    public String getUserRole() {
        return userRole;
    }

    public SsmUsers setUserRole(String userRole) {
        this.userRole = userRole;
        return this;
    }

    public SsmUsers() {
    }
}
