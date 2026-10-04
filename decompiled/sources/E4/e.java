package E4;

import D4.Y;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final /* synthetic */ class e extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final e f1937k = new e(Y.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override // kotlin.jvm.internal.o, l4.InterfaceC1442u
    public final Object get(Object obj) {
        return Integer.valueOf(((Y) obj).a);
    }

    @Override // kotlin.jvm.internal.o, l4.InterfaceC1433l
    public final void set(Object obj, Object obj2) {
        ((Y) obj).a = ((Number) obj2).intValue();
    }
}
