package com.yellow;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**属性配置文件读取类
 * @author yellow
 * @date 2019/8/30 9:44
 * 温馨提醒:
 * 代码千万行，
 * 注释第一行。
 * 命名不规范，
 * 同事两行泪。
 */
@ConfigurationProperties(prefix = "spring.yellow")
public class YDemoProperties {
    private String name = "yellow";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
