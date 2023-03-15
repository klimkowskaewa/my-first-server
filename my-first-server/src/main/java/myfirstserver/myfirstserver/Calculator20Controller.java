package myfirstserver.myfirstserver;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator20")
public class Calculator20Controller {

    // POST /calculator20/count
    // "a" : 123
    // "b" : 90
    // "operations" : "ADD" ...

    enum MathOperations {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE,
        POWER
    }

    public static class Calculation  {
        private int a;
        private int b;
        private MathOperations mathOperations;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public MathOperations getMathOperations() {
            return mathOperations;
        }

        public void setMathOperations(MathOperations mathOperations) {
            this.mathOperations = mathOperations;
        }
    }

    @PostMapping("/count")
    public int policz (@RequestBody Calculation calculation) {
        switch (calculation.mathOperations) {

            case ADD:
                return calculation.a + calculation.b;
            case SUBTRACT:
                return calculation.a - calculation.b;
            case MULTIPLY:
                return calculation.a * calculation.b;
            case DIVIDE:
                return calculation.a / calculation.b;
            case POWER:
                return (int) Math.pow(calculation.a, calculation.b);
            default:
                return 0;
        }
    }
}