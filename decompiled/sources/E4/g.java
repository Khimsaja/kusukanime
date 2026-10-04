package E4;

import D4.d0;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final /* synthetic */ class g extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f1939k = 0;

    static {
        new g(d0.class, "flags", "getFlags$kotlin_metadata()I", 0);
    }

    @Override // kotlin.jvm.internal.o, l4.InterfaceC1442u
    public final Object get(Object obj) {
        return Integer.valueOf(((d0) obj).a);
    }

    @Override // kotlin.jvm.internal.o, l4.InterfaceC1433l
    public final void set(Object obj, Object obj2) {
        ((d0) obj).a = ((Number) obj2).intValue();
    }
}
