package bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Role {
   

	public List<Jurisdietion> getJurisdietions() {
		return jurisdietions;
	}

	public void setJurisdietions(List<Jurisdietion> jurisdietions) {
		this.jurisdietions = jurisdietions;
	}

	private Integer rId;

    private String rName;

    private Integer rState;

    private Integer rIsdel;

    private Date rCreatetime;

    
    private List<Jurisdietion> jurisdietions;
    
    
    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public Integer getrState() {
        return rState;
    }

    public void setrState(Integer rState) {
        this.rState = rState;
    }

    public Integer getrIsdel() {
        return rIsdel;
    }

    public void setrIsdel(Integer rIsdel) {
        this.rIsdel = rIsdel;
    }

    public Date getrCreatetime() {
        return rCreatetime;
    }

    public void setrCreatetime(Date rCreatetime) {
        this.rCreatetime = rCreatetime;
    }
}