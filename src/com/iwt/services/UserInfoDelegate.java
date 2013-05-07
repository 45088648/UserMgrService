package com.iwt.services;

@javax.jws.WebService(targetNamespace = "http://services.iwt.com/", serviceName = "UserInfoService", portName = "UserInfoPort", wsdlLocation = "WEB-INF/wsdl/UserInfoService.wsdl")
public class UserInfoDelegate {

    com.iwt.services.UserInfo userInfo = new com.iwt.services.UserInfo();

    public String getUserInfo() {
        return userInfo.getUserInfo();
    }

}