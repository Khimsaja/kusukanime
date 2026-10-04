package X4;

import java.io.Serializable;
import java.util.Collections;

/* renamed from: X4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0618o extends AbstractC0605b implements Serializable {
    public static C0617n g(AbstractC0615l abstractC0615l, AbstractC0618o abstractC0618o, int i7, O o7, Class cls) {
        return new C0617n(abstractC0615l, Collections.EMPTY_LIST, abstractC0618o, new C0616m(i7, o7, true), cls);
    }

    public static C0617n h(AbstractC0615l abstractC0615l, Serializable serializable, AbstractC0618o abstractC0618o, int i7, Q q6, Class cls) {
        return new C0617n(abstractC0615l, serializable, abstractC0618o, new C0616m(i7, q6, false), cls);
    }
}
