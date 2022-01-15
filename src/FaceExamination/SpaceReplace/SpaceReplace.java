package FaceExamination.SpaceReplace;


/*
* 字符串替换
* */
public class SpaceReplace {

    private static String  SPReplace(String str){
        return str.replace(" ", "%20");


    }

    public static void main(String[] args) {
        System.out.println(SPReplace("hello world, dude"));
    }

}
