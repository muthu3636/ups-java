public class Mainbox {
    public static void main(String[]args){
        Box<Integer>intb=new Box<>(5);
        Box <String>strb=new Box<>("suji");
        intb.add(50);
        strb.add("swea");
        System.out.println("Integer value : " + intb.getItem());
        System.out.println("String value : " + strb.getItem());
    }
}
