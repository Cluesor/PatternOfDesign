package BasicPrinciple.LSP.WithLSP;

public class Square implements QuardRectangle {

    private long length;  //正方形边长

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return 0;
    }

    @Override
    public long getHeight() {
        return 0;
    }
}
