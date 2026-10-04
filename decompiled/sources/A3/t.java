package A3;

import H1.C0221b;
import H5.C0270k;
import K5.Y;
import O.C0522v0;
import O.EnumC0511p0;
import O3.C;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f187l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f188m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f189n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i7, Object obj, Object obj2) {
        super(1);
        this.f187l = i7;
        this.f189n = obj;
        this.f188m = obj2;
    }

    private final Object a(Object obj) {
        C0221b c0221b = (C0221b) this.f189n;
        Object obj2 = c0221b.f3405l;
        C0270k c0270k = (C0270k) this.f188m;
        synchronized (obj2) {
            ((ArrayList) c0221b.f3406m).remove(c0270k);
        }
        return C.a;
    }

    private final Object b(Object obj) {
        Throwable th = (Throwable) obj;
        C0522v0 c0522v0 = (C0522v0) this.f189n;
        Object obj2 = c0522v0.f7221b;
        Throwable th2 = (Throwable) this.f188m;
        synchronized (obj2) {
            if (th2 == null) {
                th2 = null;
            } else if (th != null) {
                try {
                    if (th instanceof CancellationException) {
                        th = null;
                    }
                    if (th != null) {
                        q0.c.j(th2, th);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            c0522v0.f7223d = th2;
            Y y7 = c0522v0.f7237r;
            EnumC0511p0 enumC0511p0 = EnumC0511p0.f7154k;
            y7.getClass();
            y7.i(null, enumC0511p0);
        }
        return C.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x085b  */
    @Override // e4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.t.invoke(java.lang.Object):java.lang.Object");
    }
}
