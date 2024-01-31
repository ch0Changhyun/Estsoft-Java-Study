package classFive2;
public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.initDog("뽀삐",1);

        Dog dog2 = new Dog();
        dog2.initDog("",10);

        Dog dog3 = new Dog();
        dog3.initDog("또순이",5);

        Dog[] dogList = {dog1, dog2, dog3};

        for (Dog dog : dogList){
            System.out.println("이름 : "+dog.dogName+", 나이 : "+ dog.dogAge);
        }

    }
}
//package classFive2;
//
//public class DogMain {
//    public static void main(String[] args) {
//        Dog dog1 = new Dog();
//        dog1.dogName = "뽀삐";
//        dog1.dogAge = 1;
//
//        Dog dog2 = new Dog();
//        dog2.dogName = "dkwl";
//        dog2.dogAge = 10;
//
//        Dog dog3 = new Dog();
//        dog3.dogName = "또순이";
//        dog3.dogAge = 5;
//
//        Dog[] dogList = {dog1, dog2, dog3};
//
//        for (Dog dog : dogList){
//            System.out.println("이름 : "+dog.dogName+", 나이 : "+ dog.dogAge);
//        }
//
//    }
//}