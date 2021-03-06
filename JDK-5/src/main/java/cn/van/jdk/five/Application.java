package cn.van.jdk.five;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: Application
 *
 * @author: Van
 * Date:     2019-12-22 23:17
 * Description: JDK 1.5 示例代码启动类
 * Version： V1.0
 */
@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
        log.info("Application start!");
    }
}
