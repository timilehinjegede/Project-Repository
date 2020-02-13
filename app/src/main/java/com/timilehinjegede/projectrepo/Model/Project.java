package com.timilehinjegede.projectrepo.Model;

public class Project {

    private String title;
    private String description ;
    private String uploader ;
    private String uploaderImage ;
    private String category;
    private String file ;

    public Project(String title, String description, String uploader, String uploaderImage, String category, String file) {
        this.title = title;
        this.description = description;
        this.uploader = uploader;
        this.uploaderImage = uploaderImage;
        this.category = category;
        this.file = file;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public String getUploaderImage() {
        return uploaderImage;
    }

    public void setUploaderImage(String uploaderImage) {
        this.uploaderImage = uploaderImage;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
