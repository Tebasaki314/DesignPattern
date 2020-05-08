package Composite.A2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory usrdir = new Directory("usr");
            rootdir.add(usrdir);

            System.out.println("");
            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            File diary = new File("diary.html", 100);
            yuki.add(diary);
            usrdir.add(yuki);

            System.out.println(diary.getFullpath());

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
