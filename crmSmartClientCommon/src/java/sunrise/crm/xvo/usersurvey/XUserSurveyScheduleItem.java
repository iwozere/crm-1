package sunrise.crm.xvo.usersurvey;

/**
 * Helper container
 * 
 * @author zehnder
 */
public class XUserSurveyScheduleItem {

	private String year;

	private int month;
	private int week;
	private int pos0;
	private int pos1;
	private int pos2;
	private int pos3;
	private int pos4;
	private int pos5;
	private int pos6;
	private String posStr0;
	private String posStr1;
	private String posStr2;
	private String posStr3;
	private String posStr4;
	private String posStr5;
	private String posStr6;

	public String getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getWeek() {
		return week;
	}

	public int getPos0() {
		return pos0;
	}

	public int getPos1() {
		return pos1;
	}

	public int getPos2() {
		return pos2;
	}

	public int getPos3() {
		return pos3;
	}

	public int getPos4() {
		return pos4;
	}

	public int getPos5() {
		return pos5;
	}

	public int getPos6() {
		return pos6;
	}

	public String getPosStr0() {
		return posStr0;
	}

	public String getPosStr1() {
		return posStr1;
	}

	public String getPosStr2() {
		return posStr2;
	}

	public String getPosStr3() {
		return posStr3;
	}

	public String getPosStr4() {
		return posStr4;
	}

	public String getPosStr5() {
		return posStr5;
	}

	public String getPosStr6() {
		return posStr6;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public void setPos0(int pos0) {
		this.pos0 = pos0;
	}

	public void setPos1(int pos1) {
		this.pos1 = pos1;
	}

	public void setPos2(int pos2) {
		this.pos2 = pos2;
	}

	public void setPos3(int pos3) {
		this.pos3 = pos3;
	}

	public void setPos4(int pos4) {
		this.pos4 = pos4;
	}

	public void setPos5(int pos5) {
		this.pos5 = pos5;
	}

	public void setPos6(int pos6) {
		this.pos6 = pos6;
	}

	public void setPosStr0(String posStr0) {
		this.posStr0 = posStr0;
	}

	public void setPosStr1(String posStr1) {
		this.posStr1 = posStr1;
	}

	public void setPosStr2(String posStr2) {
		this.posStr2 = posStr2;
	}

	public void setPosStr3(String posStr3) {
		this.posStr3 = posStr3;
	}

	public void setPosStr4(String posStr4) {
		this.posStr4 = posStr4;
	}

	public void setPosStr5(String posStr5) {
		this.posStr5 = posStr5;
	}

	public void setPosStr6(String posStr6) {
		this.posStr6 = posStr6;
	}

	public void setPos(int posKey, int posValue) {
		switch (posKey) {
		case 0:
			setPos0(posValue);
			setPosStr0(Integer.toString(posValue));
			break;
		case 1:
			setPos1(posValue);
			setPosStr1(Integer.toString(posValue));
			break;
		case 2:
			setPos2(posValue);
			setPosStr2(Integer.toString(posValue));
			break;
		case 3:
			setPos3(posValue);
			setPosStr3(Integer.toString(posValue));
			break;
		case 4:
			setPos4(posValue);
			setPosStr4(Integer.toString(posValue));
			break;
		case 5:
			setPos5(posValue);
			setPosStr5(Integer.toString(posValue));
			break;
		case 6:
			setPos6(posValue);
			setPosStr6(Integer.toString(posValue));
			break;
		default:
			break;
		}
	}

	public void setPosBlanks(int posKey, int posValue) {
		String valBlank = posValue == 0 ? "" : Integer.toString(posValue);
		switch (posKey) {
		case 0:
			setPos0(posValue);
			setPosStr0(valBlank);
			break;
		case 1:
			setPos1(posValue);
			setPosStr1(valBlank);
			break;
		case 2:
			setPos2(posValue);
			setPosStr2(valBlank);
			break;
		case 3:
			setPos3(posValue);
			setPosStr3(valBlank);
			break;
		case 4:
			setPos4(posValue);
			setPosStr4(valBlank);
			break;
		case 5:
			setPos5(posValue);
			setPosStr5(valBlank);
			break;
		case 6:
			setPos6(posValue);
			setPosStr6(valBlank);
			break;
		default:
			break;
		}
	}

	@Override
	public String toString() {
		return "XUserSurveyScheduleItem [year=" + year + ", month=" + month + ", week=" + week + ", pos0=" + pos0
				+ ", pos1=" + pos1 + ", pos2=" + pos2 + ", pos3=" + pos3 + ", pos4=" + pos4 + ", pos5=" + pos5
				+ ", pos6=" + pos6 + ", posStr0=" + posStr0 + ", posStr1=" + posStr1 + ", posStr2=" + posStr2
				+ ", posStr3=" + posStr3 + ", posStr4=" + posStr4 + ", posStr5=" + posStr5 + ", posStr6=" + posStr6
				+ "]";
	}

	
}
