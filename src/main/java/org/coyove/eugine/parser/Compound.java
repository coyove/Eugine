package org.coyove.eugine.parser;

import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class Compound extends Base {
    public List<Base> atoms = new List<Base>();

    public Compound() {}

    public Compound(List<Base> a) {
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
