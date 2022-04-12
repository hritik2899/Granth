package Model;

public class Notification {
    private String userid;
    private String text;
    private String postid;
    private String isPost;
    private String id;
    private String receiver;

    public Notification() {
    }

    public Notification(String userid, String text, String postid, String isPost, String id, String receiver) {
        this.userid = userid;
        this.text = text;
        this.postid = postid;
        this.isPost = isPost;
        this.id = id;
        this.receiver = receiver;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getIsPost() {
        return isPost;
    }

    public void setIsPost(String isPost) {
        this.isPost = isPost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
