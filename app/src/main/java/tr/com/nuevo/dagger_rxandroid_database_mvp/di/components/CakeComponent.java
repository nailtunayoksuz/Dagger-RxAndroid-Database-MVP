package tr.com.nuevo.dagger_rxandroid_database_mvp.di.components;

import dagger.Component;
import tr.com.nuevo.dagger_rxandroid_database_mvp.di.module.CakeModule;
import tr.com.nuevo.dagger_rxandroid_database_mvp.di.scope.PerActivity;
import tr.com.nuevo.dagger_rxandroid_database_mvp.modules.home.MainActivity;

/**
 * Created by nuevomacpro13 on 22.03.2018.
 */

@PerActivity
@Component(modules = CakeModule.class , dependencies = ApplicationComponent.class)
public interface CakeComponent {
    void  inject(MainActivity activity);
}
