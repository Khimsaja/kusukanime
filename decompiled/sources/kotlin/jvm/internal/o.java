package kotlin.jvm.internal;

import o4.AbstractC1694t;

/* loaded from: classes.dex */
public class o extends n {
    public o(Class cls, String str, String str2, int i7) {
        super(AbstractC1403c.NO_RECEIVER, cls, str, str2, i7);
    }

    public Object get(Object obj) {
        return ((AbstractC1694t) getGetter()).call(obj);
    }

    public void set(Object obj, Object obj2) throws J1.n {
        ((AbstractC1694t) getSetter()).call(obj, obj2);
    }
}
