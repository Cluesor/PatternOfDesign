package BasicPrinciple.LSP.NoLSP;

public class Square extends Rectangle {
    private long length;


    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(long height) {
        super.setHeight(height);
    }

    @Override
    public long getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(long width) {
        super.setWidth(width);
    }
}
