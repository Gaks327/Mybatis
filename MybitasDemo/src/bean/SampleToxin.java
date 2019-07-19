package bean;

public class SampleToxin {
    public SampleToxinInfo getInfo() {
		return info;
	}

	public void setInfo(SampleToxinInfo info) {
		this.info = info;
	}

	private Integer id;

    private Integer toxinId;

    private Float toxinCount;

    private Integer sampleInfoId;

    private SampleToxinInfo info;
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getToxinId() {
        return toxinId;
    }

    public void setToxinId(Integer toxinId) {
        this.toxinId = toxinId;
    }

    public Float getToxinCount() {
        return toxinCount;
    }

    public void setToxinCount(Float toxinCount) {
        this.toxinCount = toxinCount;
    }

    public Integer getSampleInfoId() {
        return sampleInfoId;
    }

    public void setSampleInfoId(Integer sampleInfoId) {
        this.sampleInfoId = sampleInfoId;
    }
}