package study.hz.com.accumulation.presenter.contract;


import study.hz.com.accumulation.base.BasePresenter;
import study.hz.com.accumulation.base.BaseView;

public interface MainContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {
    }
}
