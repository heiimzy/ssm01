package cn.ekgc.www.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class Announcements {
    private Integer id;
    private String title;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime publishTime = LocalDateTime.now();

    public Announcements() {
    }

    public Announcements(Integer id, String title, String content, LocalDateTime publishTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.publishTime =  publishTime;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取
     * @return publishTime
     */
    public LocalDateTime getPublishTime() {
        return publishTime;
    }

    /**
     * 设置
     * @param publishTime
     */
    public void setPublishTime(LocalDateTime publishTime) {
        this.publishTime = publishTime;
    }

    public String toString() {
        return "Materials{id = " + id + ", title = " + title + ", content = " + content + ", publishTime = " + publishTime + "}";
    }
}
