public class Senior {
    private String id;
    private int token;
    private int initialToken;
    public Senior(String id, int token) {
        this.id = id;
        this.token = token;
        this.initialToken = token;
    }

    public String getId() {
        return id;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }
}
