package org.coyove.eugine.parser;

import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class Compound extends Base {
    public ListEx<Base> atoms = new ListEx<Base>();

    public Compound() {}

    public Compound(ListEx<Base> a) {
        atoms = a;
    }

    @Override
    public boolean equals(Object o) {
        // TODO
        return false;
    }

    @Override
    public Base clone()
    {
        Compound ret = new Compound();
        for (Base atom : this.atoms)
            ret.atoms.add(atom.clone());

        return ret;
    }
}
