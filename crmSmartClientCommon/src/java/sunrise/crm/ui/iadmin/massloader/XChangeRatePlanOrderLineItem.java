package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET,
        columnOffset = XConstants.CHANGE_RATE_PLAN_ORDER_LINE_ITEMS_COLUMN_OFFSET,
        name = XConstants.CHANGE_RATE_PLAN)
public class XChangeRatePlanOrderLineItem {

        public String item;

        public String action;

        public String attribute;

        public String value;

        public void setitem(String item) {
            this.item = item;
        }

        public void setaction(String action) {
            this.action = action;
        }

        public void setattribute(String attribute) {
            this.attribute = attribute;
        }

        public void setvalue(String value) {
            this.value = value;
        }
    }
