package classFive;

public class mainFive {
    public static void main(String[] args) {
        CarData data = new CarData();
        data.isOn = true;
        System.out.println("자동차 시동을 겁니다.");
        data.speed++;
        System.out.println("차량 속도 : " + data.speed);
        data.speed--;
        System.out.println("차량 속도 : " + data.speed);
        data.speed++;
        System.out.println("차량 속도 : " + data.speed);
        System.out.println("차량 상태를 확인합니다.");
        if(data.isOn){
            System.out.println("차량 시동 on, speed"+ data.speed);
        } else{
            System.out.println("차량 시동 off");
        }
        data.isOn = false;
        System.out.println("자동차 시동을 끕니다.");
    }
}
