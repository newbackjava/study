package object;

public class TVUse {
    public static void main(String[] args) {
        //TV 2대 필요
        TV tv1 = new TV();
        //실제 사용할 대상(객체)를 생성
        //객체 생성
        tv1.ch = 1;
        tv1.vol = 10;
        tv1.onOff = true;
        tv1.유튜브보다();

        TV tv2 = new TV();
        tv2.ch = 2;
        tv2.vol = 20;
        tv2.onOff = false;
        tv2.유튜브보다();
    }
}
