/**
 * @Date 2014年10月13日  下午5:59:03
 * @author 张亚飞
 * @Copyright 云路科技  ©2014
 */

package com.yunlu.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public abstract class BaseTest {
	//public static ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
}
