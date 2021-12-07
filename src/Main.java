import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Message myMessage = Message.FAIL;
        myMessage.setScore(56);
        System.out.println(myMessage.failMessage());

//        Message [] allMessageType = Message.values();
//        for(Message m : allMessageType) {
//            System.out.println(m);
//        }

        if(myMessage.ordinal() == 0) {
            System.out.println("Congrats again!");
        }

        Dir myDir = Dir.EAST;
        System.out.println(myDir.moveX(10));
        System.out.println(myDir.moveY(10));

        Day mon = Day.MONDAY;
        System.out.println(mon + " is the " + mon.day + " day of a week. " + mon.message);


    }
}
