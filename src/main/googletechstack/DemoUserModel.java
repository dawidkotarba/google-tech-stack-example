package src.main.googletechstack;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class DemoUserModel {
    public abstract String getName();

    public abstract int getAge();

    public static Builder builder() {
        return new AutoValue_DemoUserModel.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder setName(String value);

        abstract Builder setAge(int value);

        abstract DemoUserModel build();
    }
}