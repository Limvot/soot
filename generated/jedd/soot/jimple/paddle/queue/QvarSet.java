package soot.jimple.paddle.queue;

import soot.util.*;
import soot.jimple.paddle.bdddomains.*;
import soot.jimple.paddle.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public final class QvarSet extends Qvar {
    private LinkedList readers = new LinkedList();
    
    public void add(VarNode _var) {
        Rvar.Tuple in = new Rvar.Tuple(_var);
        for (Iterator it = readers.iterator(); it.hasNext(); ) {
            RvarSet reader = (RvarSet) it.next();
            reader.add(in);
        }
    }
    
    public void add(final jedd.internal.RelationContainer in) { throw new RuntimeException(); }
    
    public Rvar reader() {
        Rvar ret = new RvarSet();
        readers.add(ret);
        return ret;
    }
    
    public QvarSet() { super(); }
}