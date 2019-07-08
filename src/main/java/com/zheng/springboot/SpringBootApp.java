package com.zheng.springboot;

import com.zheng.springboot.config.MyExternalConfiguration;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

/**
 * @Author zhenglian
 * @Date 2019/7/4
 */
@SpringBootApplication
@Import({MyExternalConfiguration.class})
public class SpringBootApp {
    public static void main(String[] args) {
//        System.setProperty("spring.main.banner-mode", "console");// off / console / log
//        System.setProperty("spring.banner.location", "custom-banner.txt");
//        SpringApplication.run(SpringBootApp.class, args);
        // 流式编程
        new SpringApplicationBuilder()
                .sources(SpringBootApp.class)
//                .listeners(new MyListener())
                .bannerMode(Banner.Mode.CONSOLE)
                .properties("name=SpringApplicationBuilder.properties")
                .run(args);
    }
}
