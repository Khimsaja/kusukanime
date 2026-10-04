package D6;

import f6.C0920r;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class I extends c0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1666d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f1667e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1668f;

    public /* synthetic */ I(Method method, int i7, int i8) {
        this.f1666d = i8;
        this.f1667e = method;
        this.f1668f = i7;
    }

    @Override // D6.c0
    public final void a(S s7, Object obj) {
        switch (this.f1666d) {
            case 0:
                C0920r c0920r = (C0920r) obj;
                if (c0920r == null) {
                    throw c0.o(this.f1667e, this.f1668f, "Headers parameter must not be null.", new Object[0]);
                }
                D4.S s8 = s7.f1693f;
                s8.getClass();
                int size = c0920r.size();
                for (int i7 = 0; i7 < size; i7++) {
                    s8.i(c0920r.h(i7), c0920r.m(i7));
                }
                return;
            default:
                if (obj == null) {
                    throw c0.o(this.f1667e, this.f1668f, "@Url parameter is null.", new Object[0]);
                }
                s7.f1690c = obj.toString();
                return;
        }
    }
}
