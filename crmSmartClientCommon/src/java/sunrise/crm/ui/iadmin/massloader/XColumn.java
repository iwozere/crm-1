package sunrise.crm.ui.iadmin.massloader;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface XColumn {
	int id() default 0;
	String name() default "";
	boolean required() default false;

}
