/*
 * Copyright (c) 2022.
 * Automation Framework Selenium - Anh Tester
 */

package com.anhtester.mail;

import com.anhtester.constants.FrameworkConstants;

/**
 * Data for Sending email after execution
 */
public class EmailConfig {

    //Nhớ tạo mật khẩu app (App Password) cho Gmail mới gửi được nhen
    //Nếu dùng mail của Hosting thì bình thường
    //Enable Override Report and Send mail in config file => src/test/resources/config/config.properties
    //OVERRIDE_REPORTS=yes
    //send_email_to_users=yes 587

    public static final String SERVER = "smtp.hostinger.com";
    public static final String PORT = "587";

    public static final String FROM = "hariharan@thinktime.in";
    public static final String PASSWORD = "Thinktime@01";

    public static final String[] TO = {"shankar@thinktime.in"};
    
//    public static final String SERVER = "smtp.gmail.com";
//    public static final String PORT = "465";
//
//    public static final String FROM = "gowrishankarsakthivel1999@gmail.com";
//    public static final String PASSWORD = "Shankar.sakthi";
//
//    public static final String[] TO = {"hariharan80980@gmail.com"};
    public static final String SUBJECT = FrameworkConstants.REPORT_TITLE;
}