package sunrise.crm.ui.iadmin.massloader;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface XWorksheet {
	String name() default "";
	int rowOffset() default 0;
	int columnOffset() default 0;
}
