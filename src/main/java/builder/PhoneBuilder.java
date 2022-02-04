package builder;

public class PhoneBuilder {
    private final Phone phone;

    public PhoneBuilder() {
        phone = new Phone();
    }

    public PhoneBuilder setModel(String model) {
        phone.setModel(model);
        return this;
    }

    public PhoneBuilder setProcessor(Processor processor) {
        phone.setProcessor(processor);
        return this;
    }

    public PhoneBuilder setPrice(Long price) {
        phone.setPrice(price);
        return this;
    }

    public PhoneBuilder setFaceId(Boolean faceId) {
        phone.setFaceId(faceId);
        return this;
    }

    public Phone build() {
        return phone;
    }
}