package Y2;

import android.content.Context;
import d3.C0797i;
import d3.C0799k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {
    public final C0797i a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10127b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10128c;

    /* renamed from: d, reason: collision with root package name */
    public final C0797i f10129d;

    /* renamed from: e, reason: collision with root package name */
    public final e3.h f10130e;

    /* renamed from: f, reason: collision with root package name */
    public final S2.c f10131f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10132g;

    public j(C0797i c0797i, ArrayList arrayList, int i7, C0797i c0797i2, e3.h hVar, S2.c cVar, boolean z7) {
        this.a = c0797i;
        this.f10127b = arrayList;
        this.f10128c = i7;
        this.f10129d = c0797i2;
        this.f10130e = hVar;
        this.f10131f = cVar;
        this.f10132g = z7;
    }

    public final void a(C0797i c0797i, h hVar) {
        Context context = c0797i.a;
        C0797i c0797i2 = this.a;
        if (context != c0797i2.a) {
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's context.").toString());
        }
        if (c0797i.f11276b == C0799k.a) {
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot set the request's data to null.").toString());
        }
        if (c0797i.f11277c != c0797i2.f11277c) {
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's target.").toString());
        }
        if (c0797i.f11295u != c0797i2.f11295u) {
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (c0797i.f11296v == c0797i2.f11296v) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(d3.C0797i r13, U3.c r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof Y2.i
            if (r0 == 0) goto L13
            r0 = r14
            Y2.i r0 = (Y2.i) r0
            int r1 = r0.f10126o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10126o = r1
            goto L18
        L13:
            Y2.i r0 = new Y2.i
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f10124m
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f10126o
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            Y2.h r13 = r0.f10123l
            Y2.j r0 = r0.f10122k
            P3.r.Y(r14)
            goto L6c
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            P3.r.Y(r14)
            java.util.ArrayList r6 = r12.f10127b
            int r14 = r12.f10128c
            if (r14 <= 0) goto L47
            int r2 = r14 + (-1)
            java.lang.Object r2 = r6.get(r2)
            Y2.h r2 = (Y2.h) r2
            r12.a(r13, r2)
        L47:
            java.lang.Object r2 = r6.get(r14)
            Y2.h r2 = (Y2.h) r2
            int r7 = r14 + 1
            Y2.j r4 = new Y2.j
            d3.i r5 = r12.a
            S2.c r10 = r12.f10131f
            e3.h r9 = r12.f10130e
            boolean r11 = r12.f10132g
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.f10122k = r12
            r0.f10123l = r2
            r0.f10126o = r3
            java.lang.Object r14 = r2.d(r4, r0)
            if (r14 != r1) goto L6a
            return r1
        L6a:
            r0 = r12
            r13 = r2
        L6c:
            d3.j r14 = (d3.AbstractC0798j) r14
            d3.i r1 = r14.b()
            r0.a(r1, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.j.b(d3.i, U3.c):java.lang.Object");
    }
}
