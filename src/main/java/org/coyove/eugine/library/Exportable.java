package org.coyove.eugine.library;

import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.value.SDict;

/**
 * Created by coyove on 2016/11/16.
 */
public interface Exportable {
    void export(ExecEnvironment env);

    class Utils {
        public static SDict buildTopRoute(ExecEnvironment env, String... names) {
            SDict network = (SDict) env.get(names[0]);
            if (network == null) {
                network = new SDict();
                env.put(names[0], network);
            }

            for (int i = 1; i < names.length; i++) {
                SDict tmp = (SDict) network.get(names[i]);
                if (tmp == null) {
                    tmp = new SDict();
                    network.put(names[i], tmp);
                }

                network = tmp;
            }

            return network;
        }
    }
}
