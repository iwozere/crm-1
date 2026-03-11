package sunrise.crm.order.dto;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Objects;

public class SerialDto {
	 private String serialNo;
	private static Log log = LogFactory.getLog(SerialDto.class);

	public SerialDto(String serialNo) {		
		this.serialNo = serialNo;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SerialDto serialDto = (SerialDto) o;

		if (!Objects.equals(this.serialNo, serialDto.serialNo)) {
			log.debug("SerialNo is not equal.");
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(serialNo);
	}
}
