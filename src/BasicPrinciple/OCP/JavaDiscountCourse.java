package BasicPrinciple.OCP;

public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }



    public Double getOriginPrice() {
        return super.getPrice() ;   // 继承父类方法，获取原价
    }


    @Override
    public Double getPrice() {
        return super.getPrice() * 0.63 ;   // 打63折
    }
}
