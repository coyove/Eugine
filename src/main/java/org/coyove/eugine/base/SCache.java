package org.coyove.eugine.base;

import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;

/**
 * Created by zezhong on 2016/11/19.
 */
public class SCache {
    private static short MAX_SLOTS = 25600;
    public static SValue[] slots = new SValue[MAX_SLOTS];
    public static ExecEnvironment[] slotsEnv = new ExecEnvironment[MAX_SLOTS];
    public static String[] slotsName = new String[MAX_SLOTS];

    public static short curPointer = -1;

    public static synchronized short put(SValue v, ExecEnvironment env, String n) throws EgException {
        curPointer++;
        if (curPointer >= MAX_SLOTS) {
            curPointer = 0;
            throw new EgException(9998, "z");
        }

        slots[curPointer] = v;
        slotsEnv[curPointer] = env;
        slotsName[curPointer] = n;

        return curPointer;
    }
}
