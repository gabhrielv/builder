package padroescriacao.builder.dealership;

import java.util.Date;

public class CarOrder {

    private int orderNumber;
    private String model;
    private Date deliveryDate;
    private String color;
    private String version;
    private String cpf;
    private String rg;
    private String tradeInCar;
    private String deliveryStreet;
    private int deliveryNumber;
    private String deliveryComplement;
    private String deliveryDistrict;
    private String deliveryCity;
    private String deliveryState;
    private String zipCode;
    private String email;
    private String phone;

    public CarOrder() {
        this.orderNumber = 0;
        this.model = "";
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTradeInCar() {
        return tradeInCar;
    }

    public void setTradeInCar(String tradeInCar) {
        this.tradeInCar = tradeInCar;
    }

    public String getDeliveryStreet() {
        return deliveryStreet;
    }

    public void setDeliveryStreet(String deliveryStreet) {
        this.deliveryStreet = deliveryStreet;
    }

    public int getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(int deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public String getDeliveryComplement() {
        return deliveryComplement;
    }

    public void setDeliveryComplement(String deliveryComplement) {
        this.deliveryComplement = deliveryComplement;
    }

    public String getDeliveryDistrict() {
        return deliveryDistrict;
    }

    public void setDeliveryDistrict(String deliveryDistrict) {
        this.deliveryDistrict = deliveryDistrict;
    }

    public String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(String deliveryState) {
        this.deliveryState = deliveryState;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
