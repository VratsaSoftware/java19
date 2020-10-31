package com.inveitix.movie_mock_app.di;

import com.inveitix.movie_mock_app.MovieMockApplication;
import com.inveitix.movie_mock_app.di.module.ActivityModule;
import com.inveitix.movie_mock_app.di.module.ContractsModule;
import com.inveitix.movie_mock_app.di.module.DataModule;
import com.inveitix.movie_mock_app.di.module.FragmentsModule;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = {
    AndroidSupportInjectionModule.class,
    AndroidInjectionModule.class,
    DataModule.class,
    ActivityModule.class,
    FragmentsModule.class,
    ContractsModule.class
})
public interface ApplicationComponent {

    void inject(MovieMockApplication movieMockApplication);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder applicationBind(MovieMockApplication application);

        ApplicationComponent build();
    }
}
