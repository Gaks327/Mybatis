package bean;

import java.util.Date;

public class Jurisdietion {
    private Integer jId;

    private String jName;

    private Integer jState;

    private Integer jIsdel;

    private Date jCreatetime;

    private String jUrl;

    public Integer getjId() {
        return jId;
    }

    public void setjId(Integer jId) {
        this.jId = jId;
    }

    public String getjName() {
        return jName;
    }

    public void setjName(String jName) {
        this.jName = jName == null ? null : jName.trim();
    }

    public Integer getjState() {
        return jState;
    }

    public void setjState(Integer jState) {
        this.jState = jState;
    }

    public Integer getjIsdel() {
        return jIsdel;
    }

    public void setjIsdel(Integer jIsdel) {
        this.jIsdel = jIsdel;
    }

    public Date getjCreatetime() {
        return jCreatetime;
    }

    public void setjCreatetime(Date jCreatetime) {
        this.jCreatetime = jCreatetime;
    }

    public String getjUrl() {
        return jUrl;
    }

    public void setjUrl(String jUrl) {
        this.jUrl = jUrl == null ? null : jUrl.trim();
    }
}