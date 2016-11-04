package study.hz.com.accumulation.ui.activities;

import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import study.hz.com.accumulation.R;
import study.hz.com.accumulation.base.BaseActivity;
import study.hz.com.accumulation.presenter.WelfarePresenter;
import study.hz.com.accumulation.ui.view.WelfareView;

public class WelfareActivity extends BaseActivity {

    @BindView(R.id.welfare_view)
    WelfareView welfareView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welfare);
        unbinder = ButterKnife.bind(this);
        mPresenter = new WelfarePresenter(welfareView);
    }

}
