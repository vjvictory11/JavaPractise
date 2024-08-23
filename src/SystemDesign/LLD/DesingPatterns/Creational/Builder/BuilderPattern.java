package SystemDesign.LLD.DesingPatterns.Creational.Builder;

public class BuilderPattern {
    public static void main(String[] args) {
        BuilderClass instance = new BuilderClass.Builder()
                .setAge(23)
                .setName("vijay")
                .build();

        System.out.println(instance.name);
        System.out.println(instance.age);
    }
}
