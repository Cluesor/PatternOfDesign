package BasicPrinciple.CARP.WithCARP;

public class OracleConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "Oracle database";
    }
}
