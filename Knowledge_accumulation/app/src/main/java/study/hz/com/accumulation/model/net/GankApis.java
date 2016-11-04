package study.hz.com.accumulation.model.net;



import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;
import study.hz.com.accumulation.model.bean.GankHttpResponse;
import study.hz.com.accumulation.model.bean.GankItemBean;

/**
 * Created by codeest on 16/8/19.
 */

public interface GankApis {

    String HOST = "http://gank.io/api/";

    /**
     * 福利列表
     */
    @GET("data/福利/{num}/{page}")
    Observable<GankHttpResponse<List<GankItemBean>>> getGirlList(@Path("num") int num, @Path("page") int page);

}
