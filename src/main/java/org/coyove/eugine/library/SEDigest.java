package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.security.MessageDigest;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEDigest extends SExpression {
    private SExpression argument;

    private ALGORITHM func;
    public enum ALGORITHM {SHA1, SHA256, MD5}

    private RETURN ret;
    public enum RETURN {STRING, BYTES}

    public SEDigest() {
    }

    public SEDigest(Atom ha, List<SExpression> args, ALGORITHM f, RETURN r) {
        super(ha, args, 1);

        argument = args.head();
        func = f;
        ret = r;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue v = argument.evaluate(env);
        MessageDigest md;

        try {
            switch (func) {
                case SHA1:
                    md = MessageDigest.getInstance("SHA-1");
                    break;
                case SHA256:
                    md = MessageDigest.getInstance("SHA-256");
                    break;
                default:
                    md = MessageDigest.getInstance(func.toString());
            }
            byte[] result;

            if (v instanceof SString) {
                result = md.digest(v.<String>get().getBytes("UTF-8"));
            } else if (v instanceof SObject && v.underlying instanceof byte[]) {
                result = md.digest(((byte[]) v.underlying));
            } else {
                return new SNull();
            }

            if (ret == RETURN.STRING) {
                return new SString(Utils.bytesToHexString(result));
            } else {
                return new SObject(result);
            }
        } catch (Exception ex) {
            throw new VMException(7029, "algorithm not implemented: " + ex, headAtom);
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEDigest ret = new SEDigest();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.argument = this.argument.deepClone();
        ret.func = this.func;
        ret.ret = this.ret;

        return ret;
    }
}
