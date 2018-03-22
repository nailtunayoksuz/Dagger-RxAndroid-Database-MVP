package tr.com.nuevo.dagger_rxandroid_database_mvp.base;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import tr.com.nuevo.dagger_rxandroid_database_mvp.mvp.view.BaseView;

/**
 * Created by nuevomacpro13 on 22.03.2018.
 */

public class BasePresenter<V extends BaseView> {

    @Inject protected V mView;

    protected V getmView() {
        return mView;
    }

    protected <T> void subcribe(Observable<T> observable, Observer<T> observer){
        observable.subscribeOn(Schedulers.newThread()).toSingle().observeOn(AndroidSchedulers.mainThread()).subscribe(observer);
    }
}
