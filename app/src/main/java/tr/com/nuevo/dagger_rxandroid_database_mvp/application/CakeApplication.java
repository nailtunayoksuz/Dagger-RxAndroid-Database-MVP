package tr.com.nuevo.dagger_rxandroid_database_mvp.application;

import android.app.Application;

/**
 * Created by nuevomacpro13 on 22.03.2018.
 */

public class CakeApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        initializeApplicationComponent();
    }

    private void initializeApplicationComponent() {
        DaggerApplicationComponent.builder.create();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
