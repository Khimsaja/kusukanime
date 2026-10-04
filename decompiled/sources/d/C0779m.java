package d;

import H.N;
import H5.A;
import O3.C;
import P3.r;
import e4.n;

/* renamed from: d.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779m extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0778l f11192k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f11193l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0779m(C0778l c0778l, boolean z7, S3.c cVar) {
        super(2, cVar);
        this.f11192k = c0778l;
        this.f11193l = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C0779m(this.f11192k, this.f11193l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C0779m c0779m = (C0779m) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        c0779m.invokeSuspend(c2);
        return c2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [e4.a, kotlin.jvm.internal.j] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        N n7;
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        C0778l c0778l = this.f11192k;
        boolean z7 = this.f11193l;
        if (!z7 && !c0778l.f11191g && c0778l.a && (n7 = c0778l.f11190f) != null) {
            n7.e();
        }
        c0778l.a = z7;
        ?? r32 = c0778l.f11094c;
        if (r32 != 0) {
            r32.invoke();
        }
        return C.a;
    }
}
