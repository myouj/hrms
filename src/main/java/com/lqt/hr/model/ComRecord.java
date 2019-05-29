package com.lqt.hr.model;

import java.util.Date;

public class ComRecord {
    private Integer id;

    private String name;

    private Integer rgNumber;

    private String rgAddress;

    private String representative;

    private String range;

    private String type;

    private String rgAssets;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getRgNumber() {
        return rgNumber;
    }

    public void setRgNumber(Integer rgNumber) {
        this.rgNumber = rgNumber;
    }

    public String getRgAddress() {
        return rgAddress;
    }

    public void setRgAddress(String rgAddress) {
        this.rgAddress = rgAddress == null ? null : rgAddress.trim();
    }

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative == null ? null : representative.trim();
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range == null ? null : range.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getRgAssets() {
        return rgAssets;
    }

    public void setRgAssets(String rgAssets) {
        this.rgAssets = rgAssets == null ? null : rgAssets.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}