package cn.dreampie.orm.transaction;

import cn.dreampie.orm.DS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.sql.Connection;

/**
 * Created by ice on 14-12-30.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Transaction {
  String[] name() default DS.DEFAULT_DS_NAME;

  int[] level() default Connection.TRANSACTION_READ_COMMITTED;
}
