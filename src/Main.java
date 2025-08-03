import controller.SystemVoting;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SystemVoting sv= new SystemVoting();
        sv.register("john",1);
        sv.register("juci",4);
        sv.register("Alice",3);
        System.out.println(sv.getListCandidates());

        sv.OptionUser();


        }
    }
