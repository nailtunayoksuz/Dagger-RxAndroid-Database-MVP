package tr.com.nuevo.dagger_rxandroid_database_mvp.modules.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import tr.com.nuevo.dagger_rxandroid_database_mvp.R;
import tr.com.nuevo.dagger_rxandroid_database_mvp.base.BaseActivity;
import tr.com.nuevo.dagger_rxandroid_database_mvp.mvp.presenter.CakePresenter;
import tr.com.nuevo.dagger_rxandroid_database_mvp.mvp.view.MainView;

public class MainActivity extends BaseActivity implements MainView{

    @Inject protected CakePresenter mPresenter;


    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);
        mPresenter.getCakes();
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void resolverDaggerDependency() {
        DaggerCakeComponent.builder.create();

    }
}
