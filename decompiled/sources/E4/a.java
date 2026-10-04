package E4;

import D4.M;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final /* synthetic */ class a extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final a f1933k = new a(M.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override // kotlin.jvm.internal.o, l4.InterfaceC1442u
    public final Object get(Object obj) {
        return Integer.valueOf(((M) obj).a);
    }

    @Override // kotlin.jvm.internal.o, l4.InterfaceC1433l
    public final void set(Object obj, Object obj2) {
        ((M) obj).a = ((Number) obj2).intValue();
    }
}
