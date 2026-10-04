package f6;

import f.AbstractC0841b;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import w6.C2224i;
import w6.InterfaceC2225j;

/* renamed from: f6.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0917o extends AbstractC0893G {

    /* renamed from: c, reason: collision with root package name */
    public static final C0925w f11589c;
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11590b;

    static {
        Pattern pattern = C0925w.f11614e;
        f11589c = AbstractC0841b.k("application/x-www-form-urlencoded");
    }

    public C0917o(ArrayList arrayList, ArrayList arrayList2) {
        kotlin.jvm.internal.l.f("encodedNames", arrayList);
        kotlin.jvm.internal.l.f("encodedValues", arrayList2);
        this.a = g6.b.w(arrayList);
        this.f11590b = g6.b.w(arrayList2);
    }

    public final long a(InterfaceC2225j interfaceC2225j, boolean z7) throws EOFException {
        C2224i c2224iA;
        if (z7) {
            c2224iA = new C2224i();
        } else {
            kotlin.jvm.internal.l.c(interfaceC2225j);
            c2224iA = interfaceC2225j.a();
        }
        List list = this.a;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (i7 > 0) {
                c2224iA.g0(38);
            }
            c2224iA.k0((String) list.get(i7));
            c2224iA.g0(61);
            c2224iA.k0((String) this.f11590b.get(i7));
        }
        if (!z7) {
            return 0L;
        }
        long j7 = c2224iA.f17156l;
        c2224iA.b();
        return j7;
    }

    @Override // f6.AbstractC0893G
    public final long contentLength() {
        return a(null, true);
    }

    @Override // f6.AbstractC0893G
    public final C0925w contentType() {
        return f11589c;
    }

    @Override // f6.AbstractC0893G
    public final void writeTo(InterfaceC2225j interfaceC2225j) throws EOFException {
        a(interfaceC2225j, false);
    }
}
