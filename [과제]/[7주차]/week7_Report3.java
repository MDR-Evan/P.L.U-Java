/* 방울꽃이 사랑하는 나비는 방울꽃의 달콤한 향기만을 쫒아 날아들었고 방울꽃의 꽃잎이 지자 금방 날아가 버렸지요.
하지만 달팽이는 자신의 등껍질이 햇빛에 마르도록 방울꽃의 곁을 지켰다는 사랑 이야기입니다.
이 달팽이가 이번에는 3m 깊이의 우물에 빠지게 되었습니다.
하루 이틀 꽃잎이 지는 방울꽃은 일주일이면 꽃잎이 모두 떨어져 시들어버리게 됩니다.
달팽이가 낮 동안에 열심히 우물을 기어 올라가면 55cm를 올라가고 쉬는 밤중에는 13cm를 미끄러지게 됩니다.
과연 이 달팽이는 방울꽃이 시들기 전에 그 곁을 지킬 수 있을까요? */
public class week7_Report3 {
    public static void main(String[] args) {
        /**
         * 1. 1일차에 55Cm만큼 올라감
         * 2. 300cm를 넘었는가? (Y/N)
         * Y : #일동안 #Cm을 올라 방울꽃 ~~
         * N : 밤동안 13Cm만큼 떨어짐 -> 1
         * */
        int day = 1;
        for (int j = 0; j < 300 ; day++){
            j += 55;
            if (j >= 300 && day <= 7) {
                System.out.printf("%d일에 걸쳐 %dCm를 기어 올라가 방울꽃을 살려냈습니다.",day,j);
            } else if (day > 7){
                System.out.printf("7일안에 300Cm를 달성하지 못해 방울꽃을 지켜내지 못했습니다.\n소요시간 : %d 일\n이동거리 : %d Cm",day,j);
            } else {
                j = j - 13;
            }
        }
    }
}
