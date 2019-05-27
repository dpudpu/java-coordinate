package coordinate.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lines {
    private final List<Line> lines;

    public Lines(final List<Line> lines) {
        this.lines = new ArrayList<>(lines);
    }


    public double getLength(int index){
        return lines.get(index).area();
    }

    public List<Double> lengths() {
        return lines.stream().mapToDouble(Line::area).boxed().collect(Collectors.toList());
    }
}
