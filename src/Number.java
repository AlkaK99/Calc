public class Number {
    private int value;
    private NumbType type;

    Number(int value, NumbType type) {
        this.value = value;
        this.type = type;
    }

    int getValue() {
        return value;
    }

    NumbType getType() {
        return type;
    }
}
