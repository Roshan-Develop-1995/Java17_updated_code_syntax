public class SwitchCaseExample {

    //From Java 14 the switch case writing module has been updated to remove the previous boiler plate code
    // also it has introduced assignment of the case values to a variable
    //Syntax being

    /*int result = switch(variableToTest){
        case constantExpression1 -> 5;
        case constantExpression2, constantExpression3 ->{
            ...
            yield 10;
        }
        default -> 20;
    };*/

    //Example
    public static void main(String[] args) {
        int variable = 1;

        int result = switch(variable) {
            case 1 -> 5;
            case 2, 3 -> {
                System.out.println("In block");
                yield 10;
            }
            default -> 20;
        };

        System.out.println("result: "+result);
    }
}
