package study.hz.com.accumulation.presenter.contract;

import android.content.Context;

import java.util.List;

import study.hz.com.accumulation.base.BasePresenter;
import study.hz.com.accumulation.base.BaseView;
import study.hz.com.accumulation.model.bean.GankItemBean;

/**
 * Description: WelfareContract
 * Creator: yxc
 * date: 2016/10/24 12:34
 */
public interface WelfareContract {
    interface View extends BaseView<Presenter> {

        boolean isActive();

        void refreshFaild(String msg);

        void loadMoreFaild(String msg);

        Context getContext();

        void showContent(List<GankItemBean> list);

        void showMoreContent(List<GankItemBean> list);
    }

    interface Presenter extends BasePresenter {
        void onRefresh();

        void loadMore();
    }
}
