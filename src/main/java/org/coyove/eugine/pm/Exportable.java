package org.coyove.eugine.pm;

import org.coyove.eugine.base.SKeywords;

import java.util.HashMap;

/**
 * Created by coyove on 2016/11/16.
 */
public interface Exportable {
    void export(HashMap<String, SKeywords.CallableKeyword> lookup);
}
