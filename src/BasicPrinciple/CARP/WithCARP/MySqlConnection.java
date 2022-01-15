package BasicPrinciple.CARP.WithCARP;

public class MySqlConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySql database";
    }
}
