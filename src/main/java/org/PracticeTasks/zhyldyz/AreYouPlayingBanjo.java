package org.PracticeTasks.zhyldyz;

public class AreYouPlayingBanjo {
    public static void main(String[] args) {
        areYouPlayingBanjo("Riki");
        areYouPlayingBanjo("Heli");
    }
    public static String areYouPlayingBanjo(String name) {
        if (name.startsWith("R")||name.startsWith("r")){
            System.out.println(name+ " plays banjo");
        } System.out.println(name+ " does not play banjo");
        return name;
    }
}
