package coordinate.domain.generator;

import coordinate.domain.Point;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PointsGeneratorTest {

    @Test
    void 대쉬_없는_경우_테스트() {
        assertThrows(IllegalArgumentException.class, () -> new PointsGenerator("(1,2)(3,4)"));
    }

    @Test
    void generate_테스트() {
        assertThat(new PointsGenerator("(1,2)-(3,4)").generate())
                .isEqualTo(Arrays.asList(new Point(1, 2), new Point(3, 4)));
    }
}