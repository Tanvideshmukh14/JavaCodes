package OOPInJava;

import java.time.LocalDateTime;

class MobilePhone{
    private Long mobilePhoneId;
    private String brandName;
    private String modelName;
    private Integer ram;
    private Integer rom;
    private Float price;
    private Long batteryCapacity;
    private String processorName;
    private LocalDateTime manufacturingDate;

    public MobilePhone(){

    }
    public MobilePhone(Long mobilePhoneId,
                     String brandName,
                     String modelName,
                     Integer ram,
                     Integer rom,
                     Float price,
                     Long batteryCapacity,
                     String processorName,
                     LocalDateTime manufacturingDate
    ){
        this.mobilePhoneId = mobilePhoneId;
        this.brandName = brandName;
        this.modelName = modelName;
        this.ram = ram;
        this.rom = rom;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
        this.processorName = processorName;
        this.manufacturingDate =manufacturingDate;
    }

    public Long getMobilePhoneId() {
        return mobilePhoneId;
    }

    public void setMobilePhoneId(Long mobilePhoneId) {
        this.mobilePhoneId = mobilePhoneId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getRom() {
        return rom;
    }

    public void setRom(Integer rom) {
        this.rom = rom;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Long batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public LocalDateTime getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDateTime manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    @Override
    public String toString() {
        return "Mobile Phone Details : " + this.brandName + "...." + this.modelName + "...." + this.ram + "...." +
                this.rom + "...." + this.price+"...." +this.batteryCapacity +"...." + this.manufacturingDate;

    }
}


public class Example10 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();

    }
}
