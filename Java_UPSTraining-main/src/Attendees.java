import java.util.HashSet;

public class Attendees {
   static HashSet<Integer>checkset =new HashSet<>();;

    public static void checkin(int id){
        if(!checkset.contains(id)){
            checkset.add(id);
        }
    }
    public  static boolean isCheckedIn(int id){
        if(checkset.contains(id)){
            return true;
        }
        return false;
    }
    public static void removeCheckIn(int id){
        checkset.remove(id);
    }
    public  static  void displayAllCheckedIn(){
        for(int attendees : checkset){
            System.out.print(attendees +" ");
        }
    }
    public  static void main (String[]args){

      Attendees.checkin(56);
      Attendees.checkin(56);
      Attendees.checkin(70);
      Attendees.checkin(34);
      Attendees.checkin(65);
      Attendees.checkin(89);
      System.out.println(Attendees.isCheckedIn(34));
      System.out.println(Attendees.isCheckedIn(90));
      Attendees.removeCheckIn(34);
      Attendees.displayAllCheckedIn();
    }

}
