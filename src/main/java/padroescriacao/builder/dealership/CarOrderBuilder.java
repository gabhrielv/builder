package padroescriacao.builder.dealership;

import java.util.Date;

public class CarOrderBuilder {

    private CarOrder carOrder;

    public CarOrderBuilder() {
        carOrder = new CarOrder();
    }

    public CarOrder build() {
        if (carOrder.getOrderNumber() == 0) {
            throw new IllegalArgumentException("Invalid order number");
        }
        if (carOrder.getModel().equals("")) {
            throw new IllegalArgumentException("Invalid model");
        }
        return carOrder;
    }

    public CarOrderBuilder setOrderNumber(int orderNumber) {
        carOrder.setOrderNumber(orderNumber);
        return this;
    }

    public CarOrderBuilder setModel(String model) {
        carOrder.setModel(model);
        return this;
    }

    public CarOrderBuilder setDeliveryDate(Date deliveryDate) {
        carOrder.setDeliveryDate(deliveryDate);
        return this;
    }

    public CarOrderBuilder setColor(String color) {
        carOrder.setColor(color);
        return this;
    }

    public CarOrderBuilder setVersion(String version) {
        carOrder.setVersion(version);
        return this;
    }

    public CarOrderBuilder setCpf(String cpf) {
        carOrder.setCpf(cpf);
        return this;
    }

    public CarOrderBuilder setRg(String rg) {
        carOrder.setRg(rg);
        return this;
    }

    public CarOrderBuilder setTradeInCar(String tradeInCar) {
        carOrder.setTradeInCar(tradeInCar);
        return this;
    }

    public CarOrderBuilder setDeliveryStreet(String deliveryStreet) {
        carOrder.setDeliveryStreet(deliveryStreet);
        return this;
    }

    public CarOrderBuilder setDeliveryNumber(int deliveryNumber) {
        carOrder.setDeliveryNumber(deliveryNumber);
        return this;
    }

    public CarOrderBuilder setDeliveryComplement(String deliveryComplement) {
        carOrder.setDeliveryComplement(deliveryComplement);
        return this;
    }

    public CarOrderBuilder setDeliveryDistrict(String deliveryDistrict) {
        carOrder.setDeliveryDistrict(deliveryDistrict);
        return this;
    }

    public CarOrderBuilder setDeliveryCity(String deliveryCity) {
        carOrder.setDeliveryCity(deliveryCity);
        return this;
    }

    public CarOrderBuilder setDeliveryState(String deliveryState) {
        carOrder.setDeliveryState(deliveryState);
        return this;
    }

    public CarOrderBuilder setZipCode(String zipCode) {
        carOrder.setZipCode(zipCode);
        return this;
    }

    public CarOrderBuilder setEmail(String email) {
        carOrder.setEmail(email);
        return this;
    }

    public CarOrderBuilder setPhone(String phone) {
        carOrder.setPhone(phone);
        return this;
    }

}
