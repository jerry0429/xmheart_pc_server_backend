package com.xmheart.model;

import java.util.Date;

public class XPWArticle {

    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_article.id
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_article.column_id
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	private Long columnId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_article.column_name
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	private String columnName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_article.title
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_article.url
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	private String url;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_article.img_url
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	private String imgUrl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_article.brief
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	private String brief;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_article.is_pinned
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	private Boolean isPinned;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_article.pin_order
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	private Byte pinOrder;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_article.tags
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	private String tags;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_article.is_published
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	private Boolean isPublished;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_article.publish_time
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	private Date publishTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_article.is_english
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	private Byte isEnglish;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_article.content
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	private String content;
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_article.id
	 * @return  the value of xpw_article.id
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_article.id
	 * @param id  the value for xpw_article.id
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_article.column_id
	 * @return  the value of xpw_article.column_id
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public Long getColumnId() {
		return columnId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_article.column_id
	 * @param columnId  the value for xpw_article.column_id
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public void setColumnId(Long columnId) {
		this.columnId = columnId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_article.column_name
	 * @return  the value of xpw_article.column_name
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_article.column_name
	 * @param columnName  the value for xpw_article.column_name
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_article.title
	 * @return  the value of xpw_article.title
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_article.title
	 * @param title  the value for xpw_article.title
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_article.url
	 * @return  the value of xpw_article.url
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_article.url
	 * @param url  the value for xpw_article.url
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_article.img_url
	 * @return  the value of xpw_article.img_url
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public String getImgUrl() {
		return imgUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_article.img_url
	 * @param imgUrl  the value for xpw_article.img_url
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_article.brief
	 * @return  the value of xpw_article.brief
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public String getBrief() {
		return brief;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_article.brief
	 * @param brief  the value for xpw_article.brief
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public void setBrief(String brief) {
		this.brief = brief;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_article.is_pinned
	 * @return  the value of xpw_article.is_pinned
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public Boolean getIsPinned() {
		return isPinned;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_article.is_pinned
	 * @param isPinned  the value for xpw_article.is_pinned
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public void setIsPinned(Boolean isPinned) {
		this.isPinned = isPinned;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_article.pin_order
	 * @return  the value of xpw_article.pin_order
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public Byte getPinOrder() {
		return pinOrder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_article.pin_order
	 * @param pinOrder  the value for xpw_article.pin_order
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public void setPinOrder(Byte pinOrder) {
		this.pinOrder = pinOrder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_article.tags
	 * @return  the value of xpw_article.tags
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public String getTags() {
		return tags;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_article.tags
	 * @param tags  the value for xpw_article.tags
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_article.is_published
	 * @return  the value of xpw_article.is_published
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public Boolean getIsPublished() {
		return isPublished;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_article.is_published
	 * @param isPublished  the value for xpw_article.is_published
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public void setIsPublished(Boolean isPublished) {
		this.isPublished = isPublished;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_article.publish_time
	 * @return  the value of xpw_article.publish_time
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public Date getPublishTime() {
		return publishTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_article.publish_time
	 * @param publishTime  the value for xpw_article.publish_time
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_article.is_english
	 * @return  the value of xpw_article.is_english
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public Byte getIsEnglish() {
		return isEnglish;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_article.is_english
	 * @param isEnglish  the value for xpw_article.is_english
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public void setIsEnglish(Byte isEnglish) {
		this.isEnglish = isEnglish;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_article.content
	 * @return  the value of xpw_article.content
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_article.content
	 * @param content  the value for xpw_article.content
	 * @mbg.generated  Sun Mar 11 22:24:33 CST 2018
	 */
	public void setContent(String content) {
		this.content = content;
	}

	public Long getFirstColumnId() {
        return firstColumnId;
    }

    public void setFirstColumnId(Long firstColumnId) {
        this.firstColumnId = firstColumnId;
    }

    public String getFirstColumnName() {
        return firstColumnName;
    }

    public void setFirstColumnName(String firstColumnName) {
        this.firstColumnName = firstColumnName;
    }

    private Long firstColumnId;
    private String firstColumnName;
}