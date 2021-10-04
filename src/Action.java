public class Action {
    public static String calculate(Number a, Number b,String action) throws Exception {
        int result;

        switch (action) {
            case "+":
                result =a.getValue()+b.getValue();
                break;
            case "-":
                result = a.getValue()-b.getValue();
                break;
            case "*":
                result = a.getValue()*b.getValue();
                break;
            case "/":
                result = a.getValue()/b.getValue();
                break;
            default:
                throw new Exception("Что-то пошло не так. Пожалуйста попробуйте ещё раз");
        }

        if (a.getType() == NumbType.ROMAN) {
            return NumberService.toRomanNumber(result);
        } else return String.valueOf(result);
    }
}
