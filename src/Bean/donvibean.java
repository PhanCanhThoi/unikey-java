package Bean;

public class donvibean {
	private String madv;
	private String tendv;
	
	public donvibean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public donvibean(String madv, String tendv) {
		super();
		this.madv = madv;
		this.tendv = tendv;
	}

	@Override
	
	public String toString() {
		return "donvibean [madv=" + madv + ", tendv=" + tendv + "]";
	}
	public String getMadv() {
		return madv;
	}
	public void setMadv(String madv) {
		this.madv = madv;
	}
	public String getTendv() {
		return tendv;
	}
	public void setTendv(String tendv) {
		this.tendv = tendv;
	}
}