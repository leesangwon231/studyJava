package JavaSin2.Collection;

import java.util.LinkedList;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class QueueSample {
    public static void main(String[] args) {
        QueueSample qSample = new QueueSample();
        qSample.checkLinkedList();
    }

    public void checkLinkedList(){
        LinkedList<String> a = new LinkedList<String>();

        a.add("A");
        a.addFirst("B");
        System.out.println(a);
        a.offerFirst("C");
        System.out.println(a);
        a.addLast("D");
        System.out.println(a);
        a.push("E");
        System.out.println(a);
        a.pop();
        System.out.println(a);
        a.remove("A");
        System.out.println(a);
    }
}
