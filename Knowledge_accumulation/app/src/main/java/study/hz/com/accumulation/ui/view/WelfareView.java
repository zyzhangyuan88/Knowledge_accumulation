package study.hz.com.accumulation.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

import com.google.common.base.Preconditions;

import java.util.List;

import butterknife.BindView;
import study.hz.com.accumulation.R;
import study.hz.com.accumulation.base.RootView;
import study.hz.com.accumulation.model.bean.GankItemBean;
import study.hz.com.accumulation.presenter.contract.WelfareContract;



public class WelfareView extends RootView<WelfareContract.Presenter> implements WelfareContract.View {


    @BindView(R.id.get_data)
    TextView getData;

    public WelfareView(Context context) {
        super(context);
    }

    public WelfareView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WelfareView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean isActive() {
        return mActive;
    }

    @Override
    public void refreshFaild(String msg) {
        Log.d("=======","========xxxxxx========refreshFaild");
    }

    @Override
    public void loadMoreFaild(String msg) {

    }

    @Override
    public void showContent(List<GankItemBean> list) {
        Log.d("=======","========xxxxxx========showContent"+list.size());
        getData.setText(list.get(0).getDesc());
    }

    @Override
    public void showMoreContent(List<GankItemBean> list) {
        Log.d("=======","=====xxxxxxx===========showMoreContent"+list.size());
        getData.setText(list.get(0).getDesc());
    }

    @Override
    public void setPresenter(WelfareContract.Presenter presenter) {
        mPresenter = Preconditions.checkNotNull(presenter);
    }

    @Override
    public void showError(String msg) {
        Log.d("=======","========xxxxxx========msg");
    }

    @Override
    protected void getLayout() {
        inflate(mContext, R.layout.activity_welfare_view, this);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initEvent() {

    }
}
