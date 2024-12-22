import java.util.Hashtable;
public class Main {
    public static void main(String[] args) {
        HashTab ht = HashTab.hashTabInit();
        ht.hashTabAdd("cat");
        ht.hashTabAdd("dog");
        ht.hashTabAdd("parrot");
        ht.hashTabAdd("rabbit");
        ht.hashTabAdd("bunny");
        ht.hashTabAdd("frog");
        ht.hashTabAdd("fish");
        ht.hashTabAdd("sparrow");
        ht.hashTabValue();
        System.out.println(ht.hashTabLookup(52));
        ht.hashTabDelete(46);
        ht.hashTabValue();
    }
}