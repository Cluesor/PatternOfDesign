package BasicPrinciple.CARP.NoCARP;


public class ProductDAO extends DBConnection {
   private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn = dbConnection.getConnection();

        System.out.println("Use"+conn+"Add Product");


    }



}
