package com.mufeng.mybatis.bean;

import lombok.Data;

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
    private String sno;
    private String sname;
    private String ssex;
    private Date sbirthday;
    private String sclass;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public Date getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(Date sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }
}
