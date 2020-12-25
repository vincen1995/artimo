package com.skymemo.artimo.entity.common;

import java.time.LocalDateTime;

public class CommonLog {
    private Long id;

    private Long sourceId;

    private String appCode;

    private String moduleCode;

    private String tableCode;

    private String opType;

    private String opResult;

    private Long opDataId;

    private LocalDateTime utcCreate;

    private LocalDateTime utcUpdate;

    private Long userId;

    private Long opUserId;

    private String opUserName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode == null ? null : appCode.trim();
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode == null ? null : moduleCode.trim();
    }

    public String getTableCode() {
        return tableCode;
    }

    public void setTableCode(String tableCode) {
        this.tableCode = tableCode == null ? null : tableCode.trim();
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType == null ? null : opType.trim();
    }

    public String getOpResult() {
        return opResult;
    }

    public void setOpResult(String opResult) {
        this.opResult = opResult == null ? null : opResult.trim();
    }

    public Long getOpDataId() {
        return opDataId;
    }

    public void setOpDataId(Long opDataId) {
        this.opDataId = opDataId;
    }

    public LocalDateTime getUtcCreate() {
        return utcCreate;
    }

    public void setUtcCreate(LocalDateTime utcCreate) {
        this.utcCreate = utcCreate;
    }

    public LocalDateTime getUtcUpdate() {
        return utcUpdate;
    }

    public void setUtcUpdate(LocalDateTime utcUpdate) {
        this.utcUpdate = utcUpdate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(Long opUserId) {
        this.opUserId = opUserId;
    }

    public String getOpUserName() {
        return opUserName;
    }

    public void setOpUserName(String opUserName) {
        this.opUserName = opUserName == null ? null : opUserName.trim();
    }
}