package src.main.googletechstack;

import com.google.inject.Singleton;

@Singleton
public class DemoUserService {

    public DemoUserModel getDemoUser() {
        return DemoUserModel.builder().setName("Adam").setAge(5).build();
    }
}
