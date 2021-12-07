public enum Message {
    PASS("You passed!"),
    FAIL("You failed...");

    String msg;

    Integer score;

    Message(String message) {
        this.msg = message;
    }

    public void setScore(Integer s) {
        this.score = s;
    }

    public Integer getScore() {
        return score;
    }

    public String failMessage() {
        return "You only scored: " + getScore();
    }
}
