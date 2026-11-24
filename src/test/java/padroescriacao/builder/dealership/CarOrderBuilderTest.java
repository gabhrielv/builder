package padroescriacao.builder.dealership;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarOrderBuilderTest {

    @Test
    void shouldReturnExceptionForOrderWithoutNumber() {
        try {
            CarOrderBuilder carOrderBuilder = new CarOrderBuilder();
            CarOrder carOrder = carOrderBuilder
                    .setModel("Model 1")
                    .setEmail("customer1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid order number", e.getMessage());
        }
    }

    @Test
    void shouldReturnExceptionForOrderWithoutModel() {
        try {
            CarOrderBuilder carOrderBuilder = new CarOrderBuilder();
            CarOrder carOrder = carOrderBuilder
                    .setOrderNumber(1)
                    .setEmail("customer1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid model", e.getMessage());
        }
    }

    @Test
    void shouldReturnValidOrder() {
        CarOrderBuilder carOrderBuilder = new CarOrderBuilder();
        CarOrder carOrder = carOrderBuilder
                .setOrderNumber(1)
                .setModel("Model 1")
                .setEmail("customer1@email.com")
                .build();

        assertNotNull(carOrder);
    }
}