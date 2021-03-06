package com.abood.blog;

import org.json.JSONException;
import org.json.JSONObject;
import java.util.Date;
public class Posts {

    private String pId;
    private String pUser;
    private Date Date;
    private String pDate;
    private String pQuestion;
    private String pType;
    private Boolean pAction;
    private String pImage;

    public Posts() {

        Date = new Date();

    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpUser() {
        return pUser;
    }

    public void setpUser(String pUser) {
        this.pUser = pUser;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public String getpDate() {
        return pDate;
    }

    public void setpDate(String pDate) {
        this.pDate = pDate;
    }

    public String getpQuestion() {
        return pQuestion;
    }

    public void setpQuestion(String pQuestion) {
        this.pQuestion = pQuestion;
    }

    public Boolean getpAction() {
        return pAction;
    }

    public void setpAction(Boolean pAction) {
        this.pAction = pAction;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getpImage() {
        return pImage;
    }

    public void setpImage(String pImage) {
        this.pImage = pImage;
    }

    static Posts createTask(JSONObject post) throws JSONException {

        Posts pPosts = new Posts();

        pPosts.setpId(post.getString("id"));
        pPosts.setpDate(post.getString("date"));
        pPosts.setpUser(post.getString("user"));
        pPosts.setpType(post.getString("type"));
        pPosts.setpQuestion(post.getString("question"));
        pPosts.setpImage(post.getString("image"));
//        pPosts.setpAction(post.getBoolean("action"));

        return  pPosts;

    }

}
