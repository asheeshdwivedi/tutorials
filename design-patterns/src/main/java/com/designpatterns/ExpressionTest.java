
/**
 *  A client can evaluate expression by calling e.getValue() where e is the Expression.
 * expression examples :
 *   1. 3+5*2/8+7
 *   2. 3 + 5
 *   3. 4 / 2
 *   5. 3 * 5
 *   6. 5 - 2
 *   valid orators can be used on expression are only "Addition , Subtraction , Multiplication  , Division "
 */

/*
    Modify the program , so that client can configure any expression as described above.
 */
interface Expression {

    double getValue();
}

class Constant implements Expression {

    private final double value;

    public Constant( double value ) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}

public class ExpressionTest {

    public static void main( String[] args ) {
        /*Expression e = / AdderExpression
        e.getValue().equals( 2+3 );*/
    }
}


