public class Coin {
    private Integer value;
    private Integer code;

    public Coin(Integer code, Integer value) {
        this.value = value;
        this.code = code;
    }

    public int getValue() {
        return value;
    }

    public Integer getCode() {
        return code;
    }
}
