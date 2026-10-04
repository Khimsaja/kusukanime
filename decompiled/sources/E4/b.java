package E4;

import D4.Q;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final /* synthetic */ class b extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f1934k = 0;

    static {
        new b(Q.class, "flags", "getFlags$kotlin_metadata()I", 0);
    }

    @Override // kotlin.jvm.internal.o, l4.InterfaceC1442u
    public final Object get(Object obj) {
        return Integer.valueOf(((Q) obj).a);
    }

    @Override // kotlin.jvm.internal.o, l4.InterfaceC1433l
    public final void set(Object obj, Object obj2) {
        ((Q) obj).a = ((Number) obj2).intValue();
    }
}
