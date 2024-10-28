package racingcar.controller;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.dto.RacingRequestDto;
import racingcar.model.Car;
import racingcar.model.Racing;
import racingcar.service.CarService;
import racingcar.service.RacingService;

public class RacingCarControllerTest {

    private RacingCarController racingCarController;
    private RacingService racingService;
    private CarService carService;

    @BeforeEach
    void setUp() {
        carService = new CarService();
        racingService = new RacingService();
        racingCarController = new RacingCarController();
    }

    @Test
    void 자동차_경주_통합_테스트() {
        // given
        RacingRequestDto racingRequestDto = new RacingRequestDto("pobi,woni,jun", 5);
        HashSet<Car> cars = carService.validateCarNames(racingRequestDto.getCarNames());
        Racing racing = new Racing();

        // when & then
        assertDoesNotThrow(() -> racingCarController.run());
        assertNotNull(cars);
        assertEquals(3, cars.size());
        assertNotNull(racing);
    }
}