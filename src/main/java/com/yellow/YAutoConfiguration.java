package com.yellow;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**自动配置bean，存入ico容器
 * @author yellow
 * @date 2019/8/30 9:40
 * 温馨提醒:
 * 代码千万行，
 * 注释第一行。
 * 命名不规范，
 * 同事两行泪。
 */
@Configuration//标记当前类为一个配置类，让spring去扫描它
@ConditionalOnClass(IDemoClass.class)//当IDemoClass存在时，才去装配该类
@EnableConfigurationProperties(YDemoProperties.class)
public class YAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean//bean不存在，则才创建bean
    public IDemoClass demoClass(){
        return new DemoClass();
    }
}
