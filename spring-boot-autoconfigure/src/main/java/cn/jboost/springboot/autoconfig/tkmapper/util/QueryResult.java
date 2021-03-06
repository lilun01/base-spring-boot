package cn.jboost.springboot.autoconfig.tkmapper.util;

import java.util.Collections;
import java.util.List;

/**
 * paged data dto;
 *
 * @param <T>
 */
public class QueryResult<T> {


    public final long totalRecords;

    public final List<T> data;

    public QueryResult(long totalRecords, List<T> data) {
        super();
        this.totalRecords = totalRecords;
        this.data = data;
    }

    public QueryResult() {
        this.totalRecords = 0;
        this.data = Collections.emptyList();
    }




}
