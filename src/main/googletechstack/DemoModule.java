package src.main.googletechstack;

import com.google.inject.AbstractModule;

public class DemoModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DemoUserService.class);
    }
}
