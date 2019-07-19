package bean;

import java.util.Date;

public class User1 {
    public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	private Integer uId;

    private String uNum;

    private String uLoginname;

    private String uPassword;

    private String uRealname;

    private String uIdcard;

    private Integer uSex;

    private Date uBirthday;

    private String uPhone;

    private Integer uRoleid;

    private String uDeptname;

    private Integer uState;

    private Date uCreatetime;

    private Date uUpdatetime;

    private String uHandlepwd;

    private Date uLogintime;

    private String uLoginadress;

    private Integer uIsdel;

    private Role role;
    
    
    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuNum() {
        return uNum;
    }

    public void setuNum(String uNum) {
        this.uNum = uNum == null ? null : uNum.trim();
    }

    public String getuLoginname() {
        return uLoginname;
    }

    public void setuLoginname(String uLoginname) {
        this.uLoginname = uLoginname == null ? null : uLoginname.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuRealname() {
        return uRealname;
    }

    public void setuRealname(String uRealname) {
        this.uRealname = uRealname == null ? null : uRealname.trim();
    }

    public String getuIdcard() {
        return uIdcard;
    }

    public void setuIdcard(String uIdcard) {
        this.uIdcard = uIdcard == null ? null : uIdcard.trim();
    }

    public Integer getuSex() {
        return uSex;
    }

    public void setuSex(Integer uSex) {
        this.uSex = uSex;
    }

    public Date getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public Integer getuRoleid() {
        return uRoleid;
    }

    public void setuRoleid(Integer uRoleid) {
        this.uRoleid = uRoleid;
    }

    public String getuDeptname() {
        return uDeptname;
    }

    public void setuDeptname(String uDeptname) {
        this.uDeptname = uDeptname == null ? null : uDeptname.trim();
    }

    public Integer getuState() {
        return uState;
    }

    public void setuState(Integer uState) {
        this.uState = uState;
    }

    public Date getuCreatetime() {
        return uCreatetime;
    }

    public void setuCreatetime(Date uCreatetime) {
        this.uCreatetime = uCreatetime;
    }

    public Date getuUpdatetime() {
        return uUpdatetime;
    }

    public void setuUpdatetime(Date uUpdatetime) {
        this.uUpdatetime = uUpdatetime;
    }

    public String getuHandlepwd() {
        return uHandlepwd;
    }

    public void setuHandlepwd(String uHandlepwd) {
        this.uHandlepwd = uHandlepwd == null ? null : uHandlepwd.trim();
    }

    public Date getuLogintime() {
        return uLogintime;
    }

    public void setuLogintime(Date uLogintime) {
        this.uLogintime = uLogintime;
    }

    public String getuLoginadress() {
        return uLoginadress;
    }

    public void setuLoginadress(String uLoginadress) {
        this.uLoginadress = uLoginadress == null ? null : uLoginadress.trim();
    }

    public Integer getuIsdel() {
        return uIsdel;
    }

    public void setuIsdel(Integer uIsdel) {
        this.uIsdel = uIsdel;
    }
}