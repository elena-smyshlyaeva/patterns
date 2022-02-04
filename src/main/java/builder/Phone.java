package builder;

public class Phone {
    private String model;
    private Processor processor;
    private Long price;
    private Boolean faceId;

    public void setModel(String model) {
        this.model = model;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setFaceId(Boolean faceId) {
        this.faceId = faceId;
    }
}
