package BasicPrinciple.SRP.WithSRP;

public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();    // 读取非文本文件时（如图片，声音，可执行文件）需要用字节数组来保存文件的内容
    void learnCourse();
    void RefundCourse();
}
