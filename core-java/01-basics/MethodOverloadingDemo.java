public class MethodOverloadingDemo {
    public void print(String message){
        System.out.println("String:"+message);

    }
    public void print(String message, int times){
    if(times <= 0){
        System.out.println("Invalid repetition count");
        return;
    }

    for(int i = 0; i < times; i++){
        System.out.println(message);
    }
}

    public static void main(String[] args){
        MethodOverloadingDemo demo=new MethodOverloadingDemo();
        demo.print("Hello");
        demo.print("hello",-3);
    }
}
