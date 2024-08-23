package SystemDesign.LLD.DesingPatterns.Creational.Builder;

public final class BuilderClass {

    final String name;
    final int age;

    public BuilderClass(Builder builder) {
        this.name = builder.name;;
        this.age = builder.age;
    }

    public static class Builder {
        String name;
        int age;

        public Builder getBuilder() {
            return new Builder();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public BuilderClass build() {
            return new BuilderClass(this);
        }

    }
}
