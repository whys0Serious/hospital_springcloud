package com.qf.domain;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/11/9
 * \* Time: 10:29
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class FileSystem {

    private String fileId;

    private String filePath;

    private long fileSize;

    private String fileName;

    private String fileType;

    public String getFileId() {
        return fileId;
    }

    public String getFilePath() {
        return filePath;
    }

    public long getFileSize() {
        return fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

}