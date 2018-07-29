package com.tahamalas.lazyrecyclervie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewsResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("branch_name")
    @Expose
    private String branchName;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("likes")
    @Expose
    private Integer likes;
    @SerializedName("loves")
    @Expose
    private Integer loves;
    @SerializedName("branch_id")
    @Expose
    private Integer branchId;

    @SerializedName("liked")
    @Expose
    private Integer liked;

    @SerializedName("loved")
    @Expose
    private Integer loved;

    private int favorite;

    public int isFavorite() {
        return favorite;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }

    public Integer getLiked() {
        return liked;
    }

    public void setLiked(Integer liked) {
        this.liked = liked;
    }

    public Integer getLoved() {
        return loved;
    }

    public void setLoved(Integer loved) {
        this.loved = loved;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getLoves() {
        return loves;
    }

    public void setLoves(Integer loves) {
        this.loves = loves;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

}
