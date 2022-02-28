package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RuoYiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println(
            "               __                                      __                 \n"
                + "              |  \\                                    |  \\                \n"
                + " ______ ____   \\$$ _______    ______         ________ | $$____   __    __ \n"
                + "|      \\    \\ |  \\|       \\  /      \\       |        \\| $$    \\ |  \\  |  \\\n"
                + "| $$$$$$\\$$$$\\| $$| $$$$$$$\\|  $$$$$$\\       \\$$$$$$$$| $$$$$$$\\| $$  | $$\n"
                + "| $$ | $$ | $$| $$| $$  | $$| $$  | $$        /    $$ | $$  | $$| $$  | $$\n"
                + "| $$ | $$ | $$| $$| $$  | $$| $$__| $$       /  $$$$_ | $$  | $$| $$__/ $$\n"
                + "| $$ | $$ | $$| $$| $$  | $$ \\$$    $$      |  $$    \\| $$  | $$ \\$$    $$\n"
                + " \\$$  \\$$  \\$$ \\$$ \\$$   \\$$ _\\$$$$$$$       \\$$$$$$$$ \\$$   \\$$  \\$$$$$$ \n"
                + "                            |  \\__| $$                                    \n"
                + "                             \\$$    $$                                    \n"
                + "                              \\$$$$$$                                     ");
    }
}