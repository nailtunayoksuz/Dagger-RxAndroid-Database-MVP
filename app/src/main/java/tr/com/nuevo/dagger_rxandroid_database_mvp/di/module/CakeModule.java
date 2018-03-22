package tr.com.nuevo.dagger_rxandroid_database_mvp.di.module;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import tr.com.nuevo.dagger_rxandroid_database_mvp.api.CakeApiService;
import tr.com.nuevo.dagger_rxandroid_database_mvp.di.scope.PerActivity;
import tr.com.nuevo.dagger_rxandroid_database_mvp.mvp.view.MainView;

/**
 * Created by nuevomacpro13 on 22.03.2018.
 */
@Module
public class CakeModule {
    private MainView mView;

    public CakeModule(MainView view) {
        mView = view;
    }

    @PerActivity
    @Provides
    CakeApiService provideCakeApiService(Retrofit retrofit){
        return retrofit.create(CakeApiService.class);
    }

    @PerActivity
    @Provides
    MainView provideView(){
        return mView;
    }
}
