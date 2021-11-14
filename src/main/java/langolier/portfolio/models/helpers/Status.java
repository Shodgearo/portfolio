package langolier.portfolio.models.helpers;

public enum Status {
    PRODUCTION("production"),
    PLAN("plan"),
    DEVELOP("develop");

    private final String code;

    Status(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
