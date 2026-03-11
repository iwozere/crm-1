package sunrise.crm.to.inbound.customer;

import java.util.Arrays;

public class XSapAccEventHistoryResponseTO {
	
	private String errorMessage = null;
	
	private XSapAccountEventTO[] events = new XSapAccountEventTO[0];
	
	/**
	 * @return the errorMessage
	 */
	public final String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the events
	 */
	public final XSapAccountEventTO[] getEvents() {
		return events;
	}

	/**
	 * @param events the events to set
	 */
	public final void setEvents(XSapAccountEventTO[] events) {
		this.events = events;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "XSapAccEventHistoryResponseTO [errorMessage=" + errorMessage
				+ ", events=" + Arrays.toString(events) + "]";
	}		
	
}
