package Exception;

class MyException1 extends RuntimeException {
    private int errorCode;

    public MyException1(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}

    