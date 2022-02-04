package builder;

public class Main {
    public static void main(String[] args) {
        PhoneBuilder builder = new PhoneBuilder();
        Phone phone = builder.setModel("IPhone 6s")
                .setProcessor(Processor.BIONIC)
                .setFaceId(Boolean.FALSE)
                .setPrice(350L)
                .build();
    }
}