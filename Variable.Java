public abstract class AbstractVariable {
    public static boolean isNull(Object variable) {
        return variable == null;
    }

    public static boolean isNotNull(Object variable) {
        return variable != null;
    }

    public static boolean isEqual(Object variable1, Object variable2) {
        return variable1.equals(variable2);
    }

    public static boolean isNotEqual(Object variable1, Object variable2) {
        return !variable1.equals(variable2);
    }

    public static boolean isGreaterThan(int value1, int value2) {
        return value1 > value2;
    }

    public static boolean isLessThan(int value1, int value2) {
        return value1 < value2;
    }
}
