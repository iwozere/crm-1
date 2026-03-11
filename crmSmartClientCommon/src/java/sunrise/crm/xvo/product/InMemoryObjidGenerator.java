package sunrise.crm.xvo.product;

public class InMemoryObjidGenerator {
    private int nextObjid;
    public String generateObjid() {
        return ExecutionContext.IN_MEMORY_OBJID_PREFIX + (++this.nextObjid);
    }

}
