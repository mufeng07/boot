package com.mufeng.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @description: 定制静态日志基础类
 * @author: mufeng
 * @create: 2020/4/7 10:26
 */
public class BaseLogger {
    static {
        InputStream in = BaseLogger.class.getClassLoader().getResourceAsStream("log4j.properties");
        Properties properties=new Properties();
        try {
            properties.load(in);
            PropertyConfigurator.configure(properties);
            in.close();
            logger = Logger.getLogger("Logger");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Logger logger;
    static final String FQCN = BaseLogger.class.getName();
    public static void info(String msg, Object... args){
        if(logger.isInfoEnabled()){
            FormattingTuple ft = MessageFormatter.arrayFormat(msg, args);
            logger.log(FQCN, Level.INFO,ft.getMessage(),ft.getThrowable());
        }
    }
}
