
public class TriangleClassifier {
    public static String checkTriangle(double canhA, double canhB, double canhC){
        return checkTriangleTrue(canhA, canhB, canhC);
    }
    public static String checkTamGiacDeu(double canhA, double canhB, double canhC){
        boolean checkSideFirstSecond = canhA == canhB;
        boolean checkSideFirstThird = canhA == canhC;
        boolean checkSideSecondThird = canhB == canhC;
        if (checkSideFirstSecond && checkSideFirstThird && checkSideSecondThird) return "Tam Giác Đều";
        else return checkTamGiacCan(canhA, canhB, canhC);
    }
    public static String checkTamGiacCan(double canhA, double canhB, double canhC){
        boolean checkSideFirstSecond = canhA == canhB;
        boolean checkSideFirstThird = canhA == canhC;
        boolean checkSideSecondThird = canhB == canhC;
        if (checkSideFirstSecond || checkSideFirstThird || checkSideSecondThird) return "Tam Giác Cân";
        else return "Tam Giác Thường" ;
    }
    public static String checkTriangleTrue(double canhA, double canhB, double canhC){
        boolean checkFirstSide = canhB + canhC <= canhA;
        boolean checkSecondSide = canhA + canhC <= canhB;
        boolean checkThirdSide = canhA + canhB <= canhC;
        if (checkFirstSide || checkSecondSide || checkThirdSide) return "Không phải tam giác";
        else return checkTamGiacDeu(canhA, canhB, canhC);
    }
}