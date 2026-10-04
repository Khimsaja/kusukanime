package O;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import m.C1472B;

/* renamed from: O.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520u0 extends U3.j implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public List f7207k;

    /* renamed from: l, reason: collision with root package name */
    public List f7208l;

    /* renamed from: m, reason: collision with root package name */
    public List f7209m;

    /* renamed from: n, reason: collision with root package name */
    public C1472B f7210n;

    /* renamed from: o, reason: collision with root package name */
    public C1472B f7211o;

    /* renamed from: p, reason: collision with root package name */
    public C1472B f7212p;

    /* renamed from: q, reason: collision with root package name */
    public Set f7213q;

    /* renamed from: r, reason: collision with root package name */
    public C1472B f7214r;

    /* renamed from: s, reason: collision with root package name */
    public int f7215s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ U f7216t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0522v0 f7217u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0520u0(C0522v0 c0522v0, S3.c cVar) {
        super(3, cVar);
        this.f7217u = c0522v0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(O.C0522v0 r22, java.util.List r23, java.util.List r24, java.util.List r25, m.C1472B r26, m.C1472B r27, m.C1472B r28, m.C1472B r29) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0520u0.b(O.v0, java.util.List, java.util.List, java.util.List, m.B, m.B, m.B, m.B):void");
    }

    public static final void d(List list, C0522v0 c0522v0) {
        list.clear();
        synchronized (c0522v0.f7221b) {
            try {
                ArrayList arrayList = c0522v0.f7229j;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    list.add((X) arrayList.get(i7));
                }
                c0522v0.f7229j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        C0520u0 c0520u0 = new C0520u0(this.f7217u, (S3.c) obj3);
        c0520u0.f7216t = (U) obj2;
        c0520u0.invokeSuspend(O3.C.a);
        return T3.a.f9048k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0125 -> B:44:0x012d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01be -> B:12:0x0094). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0520u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
