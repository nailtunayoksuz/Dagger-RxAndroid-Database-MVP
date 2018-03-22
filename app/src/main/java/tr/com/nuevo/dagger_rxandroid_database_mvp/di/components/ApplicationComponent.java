package tr.com.nuevo.dagger_rxandroid_database_mvp.di.components;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;
import tr.com.nuevo.dagger_rxandroid_database_mvp.application.CakeApplication;
import tr.com.nuevo.dagger_rxandroid_database_mvp.di.module.ApplicationModule;

/**
 * Created by nuevomacpro13 on 22.03.2018.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    Retrofit exposeRetrofit();

    Context exposeContext();
}
