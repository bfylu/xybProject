package com.xyb.ai.model.ai;

import java.io.Serializable;
import java.util.Date;

public class Demo implements Serializable {
    private Integer id;

    private String name1;

    private Date dt;

    private String descname;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1 == null ? null : name1.trim();
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public String getDescname() {
        return descname;
    }

    public void setDescname(String descname) {
        this.descname = descname == null ? null : descname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name1=").append(name1);
        sb.append(", dt=").append(dt);
        sb.append(", descname=").append(descname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}