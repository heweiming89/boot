package io.heweiming.boot.web.util;

import java.util.Collections;
import java.util.List;

import io.heweiming.boot.bean.Page;
import io.heweiming.boot.web.datatables.DataTablesResponse;

/**
 * @author heweiming  2017年9月23日 下午5:20:01
 * @version 1.0.0
 * @description 
 */
public abstract class DataTablesUtils {

    public static void setDtResponseFromPage(Page<?> page, DataTablesResponse dtResponse) {
        List<?> data = page.getRecoreds();
        dtResponse.setData(data == null ? Collections.EMPTY_LIST : data);
        dtResponse.setRecordsFiltered(page.getTotal());
        dtResponse.setRecordsTotal(page.getTotal());
    }

}
