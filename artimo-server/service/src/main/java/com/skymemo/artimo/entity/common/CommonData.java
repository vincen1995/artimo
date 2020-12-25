package com.skymemo.artimo.entity.common;

public class CommonData {
    private Long id;

    private Long parentId;

    private Byte hasChild;

    private Byte dataSort;

    private String dataType;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Byte getHasChild() {
        return hasChild;
    }

    public void setHasChild(Byte hasChild) {
        this.hasChild = hasChild;
    }

    public Byte getDataSort() {
        return dataSort;
    }

    public void setDataSort(Byte dataSort) {
        this.dataSort = dataSort;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}