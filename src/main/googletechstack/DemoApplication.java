package src.main.googletechstack;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class DemoApplication {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DemoModule());
        DemoUserService demoUserService = injector.getInstance(DemoUserService.class);
        DemoUserModel demoUser = demoUserService.getDemoUser();
        System.out.println(demoUser);
    }
}
