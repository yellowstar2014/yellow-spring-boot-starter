package com.yellow;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yellow
 * @date 2019/8/30 9:23
 * 温馨提醒:
 * 代码千万行，
 * 注释第一行。
 * 命名不规范，
 * 同事两行泪。
 */
public class DemoClass implements IDemoClass {

    @Autowired
    private YDemoProperties demoProperties;

    public void wellcome() {
        String name = demoProperties.getName();
        System.out.println("wellcome my horse "+ name);
    }
}
