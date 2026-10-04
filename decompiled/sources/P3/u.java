package P3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class u extends t {
    public static void d0(List list, Comparator comparator) {
        kotlin.jvm.internal.l.f("<this>", list);
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
