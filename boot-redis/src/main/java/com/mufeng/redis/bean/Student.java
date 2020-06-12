package com.mufeng.redis.bean;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/3/17 16:43
 */
@Data
@Table(name = "student")
public class Student {
    @Id
    private String sno;
    private String sname;
    private String ssex;
    private Date sbirthday;
    private String sclass;

}
