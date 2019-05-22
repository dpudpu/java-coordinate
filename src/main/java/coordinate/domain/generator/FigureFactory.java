package coordinate.domain.generator;

import coordinate.domain.Figure;
import coordinate.domain.Points;
import coordinate.domain.Square;
import coordinate.domain.Triangle;

public enum FigureFactory {
    TRIANGLE(3, Triangle::new),
    SQUARE(4, Square::new);

    private final int numberOfPoints;
    private final FigureGenerator figureGenerator;

    FigureFactory(final int numberOfPoints, final FigureGenerator figureGenerator) {
        this.numberOfPoints = numberOfPoints;
        this.figureGenerator = figureGenerator;
    }

    public static Figure generate(Points points) {
        for (FigureFactory type : FigureFactory.values()) {
            if (type.numberOfPoints == points.size()) {
                return type.figureGenerator.create(points);
            }
        }
        throw new IllegalArgumentException("삼각형 또는 사각형만");
    }
}