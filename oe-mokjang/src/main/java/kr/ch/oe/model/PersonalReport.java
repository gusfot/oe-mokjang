/**
 * 
 */
package kr.ch.oe.model;

/**
 * @author gusfot
 *
 */
public class PersonalReport {
	/**
	 * id
	 */
	private long id;
	
	/**
	 * member
	 */
	private Member member;
	/**
	 * 그룹
	 */
	private Group group ;
	
	/**
	 * 주
	 */
	private long weeks;		//주
	/**
	 * 목장원 이름 
	 */
	private String memberNameMokjang;			//목장원 이름 
	
	/**
	 * 목장집회 참석 
	 */
	private int attendMokjang;					//목장집회 참석 
	
	/**
	 * 목장새등록자 
	 */
	private int enrollMokjang;
	
	/**
	 * 8주 참석자 
	 */
	private int attend8weeksMokjang;
	
	/**
	 * 목장등록 후 교회등록 
	 */
	private int enrollChurchAfterEnrollMokjang;
	
	/**
	 * 양육 1권 수료자 
	 */
	private int graduateNurtureMokjang;
	
	/**
	 * 학교양육 1권 수료자 
	 */
	private int graduateSchoolChurch;
	
	/**
	 * 교회 등록 
	 */
	private int enrollChurch;
	
	/**
	 * 교회 등록 후 목장참석 
	 */
	private int attendMokjangAfterChurch;
	
	private int enrollMokjangAfterEnrollChurch;
	
	/**
	 * 목장집회 1명 감소 
	 */
	private int decreaseAttendantMokjangChurch;
	
	/**
	 * 번식하여 나가는 분 
	 */
	private int sentChurch;
	
	/**
	 * 식당 봉사 
	 */
	private int restaurantServiceChurch;
	
	/**
	 * 목장 보고서
	 */
	private Report mokjangReport;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getWeeks() {
		return weeks;
	}

	public void setWeeks(long weeks) {
		this.weeks = weeks;
	}

	public String getMemberNameMokjang() {
		return memberNameMokjang;
	}

	public void setMemberNameMokjang(String memberNameMokjang) {
		this.memberNameMokjang = memberNameMokjang;
	}

	public int getAttendMokjang() {
		return attendMokjang;
	}

	public void setAttendMokjang(int attendMokjang) {
		this.attendMokjang = attendMokjang;
	}

	public int getEnrollMokjang() {
		return enrollMokjang;
	}

	public void setEnrollMokjang(int enrollMokjang) {
		this.enrollMokjang = enrollMokjang;
	}

	public int getAttend8weeksMokjang() {
		return attend8weeksMokjang;
	}

	public void setAttend8weeksMokjang(int attend8weeksMokjang) {
		this.attend8weeksMokjang = attend8weeksMokjang;
	}

	public int getEnrollChurchAfterEnrollMokjang() {
		return enrollChurchAfterEnrollMokjang;
	}

	public void setEnrollChurchAfterEnrollMokjang(int enrollChurchAfterEnrollMokjang) {
		this.enrollChurchAfterEnrollMokjang = enrollChurchAfterEnrollMokjang;
	}

	public int getGraduateNurtureMokjang() {
		return graduateNurtureMokjang;
	}

	public void setGraduateNurtureMokjang(int graduateNurtureMokjang) {
		this.graduateNurtureMokjang = graduateNurtureMokjang;
	}

	public int getGraduateSchoolChurch() {
		return graduateSchoolChurch;
	}

	public void setGraduateSchoolChurch(int graduateSchoolChurch) {
		this.graduateSchoolChurch = graduateSchoolChurch;
	}

	public int getEnrollChurch() {
		return enrollChurch;
	}

	public void setEnrollChurch(int enrollChurch) {
		this.enrollChurch = enrollChurch;
	}

	public int getAttendMokjangAfterChurch() {
		return attendMokjangAfterChurch;
	}

	public void setAttendMokjangAfterChurch(int attendMokjangAfterChurch) {
		this.attendMokjangAfterChurch = attendMokjangAfterChurch;
	}

	public int getDecreaseAttendantMokjangChurch() {
		return decreaseAttendantMokjangChurch;
	}

	public void setDecreaseAttendantMokjangChurch(int decreaseAttendantMokjangChurch) {
		this.decreaseAttendantMokjangChurch = decreaseAttendantMokjangChurch;
	}

	public int getSentChurch() {
		return sentChurch;
	}

	public void setSentChurch(int sentChurch) {
		this.sentChurch = sentChurch;
	}

	public int getRestaurantServiceChurch() {
		return restaurantServiceChurch;
	}

	public void setRestaurantServiceChurch(int restaurantServiceChurch) {
		this.restaurantServiceChurch = restaurantServiceChurch;
	}

	public Report getMokjangReport() {
		return mokjangReport;
	}

	public void setMokjangReport(Report mokjangReport) {
		this.mokjangReport = mokjangReport;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "PersonalReport [id=" + id + ", member=" + member + ", group="
				+ group + ", weeks=" + weeks + ", memberNameMokjang="
				+ memberNameMokjang + ", attendMokjang=" + attendMokjang
				+ ", enrollMokjang=" + enrollMokjang + ", attend8weeksMokjang="
				+ attend8weeksMokjang + ", enrollChurchAfterEnrollMokjang="
				+ enrollChurchAfterEnrollMokjang + ", graduateNurtureMokjang="
				+ graduateNurtureMokjang + ", graduateSchoolChurch="
				+ graduateSchoolChurch + ", enrollChurch=" + enrollChurch
				+ ", attendMokjangAfterChurch=" + attendMokjangAfterChurch
				+ ", decreaseAttendantMokjangChurch="
				+ decreaseAttendantMokjangChurch + ", sentChurch=" + sentChurch
				+ ", restaurantServiceChurch=" + restaurantServiceChurch
				+ ", mokjangReport=" + mokjangReport + "]";
	}

	public int getEnrollMokjangAfterEnrollChurch() {
		return enrollMokjangAfterEnrollChurch;
	}

	public void setEnrollMokjangAfterEnrollChurch(
			int enrollMokjangAfterEnrollChurch) {
		this.enrollMokjangAfterEnrollChurch = enrollMokjangAfterEnrollChurch;
	}
	
	
}
