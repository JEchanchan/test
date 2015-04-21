/**
 * @Date 2015年3月20日  上午11:22:36
 * @author 张亚飞
 * @email verphen@163.com
 */

package com.yunlu.test;

import org.apache.commons.mail.HtmlEmail;


public class EmailTest {
	public static void main(String[] args) {
		//邮件服务器测试方法
		sendYunluEmail();
		//QQ邮件测试方法 
//		sendQqEmail();
	}
	
	public static void sendYunluEmail(){
		String subject = "面试邀请"; // 主题
		HtmlEmail email = new HtmlEmail();
		email.setHostName("124.192.148.36"); // 设置发信的smtp服务器
//		email.setHostName("mail.yunlu.me");
		email.setSubject(subject); // 设置邮件主题
		email.setAuthentication("noreplay@mail.yunlu.me","Yunlu201*");// SMTP服务器认证,设置帐号、密码
		email.setCharset("utf-8"); // 设置邮件字符集
		try {
			email.addTo("noreplay@mail.yunlu.me", "effine"); // 设置收件人帐号和收件人
			email.setFrom("noreplay@mail.yunlu.me","wu wang"); // 设置发信的邮件帐号和发信人
			email.setHtmlMsg("邮件内容 email content"); // 设置邮件正文，此方法这里的样式可以显示出来
			email.send();
			System.err.println("邮件发送成功");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void sendQqEmail(){
		String subject = "面试邀请"; // 主题
		HtmlEmail email = new HtmlEmail();
		email.setHostName("smtp.163.com");
		email.setSubject(subject); // 设置邮件主题
		email.setAuthentication("verphen@163.com","你的邮箱密码");// SMTP服务器认证,设置帐号、密码
		email.setCharset("utf-8"); // 设置邮件字符集
		try {
			email.addTo("zhangyf@yunlu.info", "effine"); // 设置收件人帐号和收件人
			email.setFrom("verphen@163.com","effine"); // 设置发信的邮件帐号和发信人
			email.setHtmlMsg("邮件内容 email content"); // 设置邮件正文，此方法这里的样式可以显示出来
			email.send();
			System.err.println("邮件发送成功");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
