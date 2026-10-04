package E4;

import D4.Z;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final /* synthetic */ class d extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f1936k = 0;

    static {
        new d(Z.class, "flags", "getFlags$kotlin_metadata()I", 0);
    }

    @Override // kotlin.jvm.internal.o, l4.InterfaceC1442u
    public final Object get(Object obj) {
        return Integer.valueOf(((Z) obj).a);
    }

    @Override // kotlin.jvm.internal.o, l4.InterfaceC1433l
    public final void set(Object obj, Object obj2) {
        ((Z) obj).a = ((Number) obj2).intValue();
    }
}
