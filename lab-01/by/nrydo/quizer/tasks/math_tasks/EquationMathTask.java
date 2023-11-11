package by.nrydo.quizer.tasks.math_tasks;

import by.nrydo.quizer.Result;

public class EquationMathTask extends AbstractMathTask {
    public EquationMathTask(int y, int z, Operation operation, boolean is_x_left) {

        String operation_symbol = switch (operation) {
            case SUM -> "+";
            case Difference -> "-";
            case Multiplication -> "*";
            case Division -> "/";
        };
        this.text = (is_x_left ? "x" : y) + operation_symbol + (is_x_left ? y : "x") + "=" + z;

        this.answer = Integer.toString(switch (operation) {
            case SUM -> z - y;
            case Difference -> is_x_left ? y + z : y - z;
            case Multiplication -> z / y;
            case Division -> is_x_left ? y * z : y / z;
        });
    }
}
