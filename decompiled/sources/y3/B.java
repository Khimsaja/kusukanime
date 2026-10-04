package y3;

import O.Z;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.media3.exoplayer.ExoPlayer;
import f6.AbstractC0915m;
import s.AbstractC1899G;
import s.C1894B;
import s.C1896D;
import s0.C1955C;
import z5.C2508m;

/* loaded from: classes.dex */
public final class B extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18236k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f18237l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f18238m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f18239n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f18240o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f18241p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z f18242q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Context context, ExoPlayer exoPlayer, Z z7, Z z8, Z z9, S3.c cVar) {
        super(2, cVar);
        this.f18238m = context;
        this.f18239n = exoPlayer;
        this.f18240o = z7;
        this.f18241p = z8;
        this.f18242q = z9;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        B b4 = new B(this.f18238m, this.f18239n, this.f18240o, this.f18241p, this.f18242q, cVar);
        b4.f18237l = obj;
        return b4;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((C1955C) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Activity activity;
        C1955C c1955c = (C1955C) this.f18237l;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f18236k;
        O3.C c2 = O3.C.a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return c2;
        }
        P3.r.Y(obj);
        C2508m c2508m = C.a;
        Context baseContext = this.f18238m;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (baseContext instanceof Activity) {
                activity = (Activity) baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        uVar.f12717k = -1.0f;
        kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
        uVar2.f12717k = -1.0f;
        ExoPlayer exoPlayer = this.f18239n;
        A3.j jVar = new A3.j(c1955c, exoPlayer, activity, uVar, uVar2, 3);
        Z5.A a = new Z5.A(15, uVar, uVar2);
        C2411A c2411a = new C2411A(c1955c, uVar, activity, uVar2, exoPlayer, this.f18240o, this.f18241p, this.f18242q);
        this.f18237l = null;
        this.f18236k = 1;
        float f5 = AbstractC1899G.a;
        Object objF = AbstractC0915m.f(c1955c, new C1896D(jVar, c2411a, a, C1894B.f15064n, null), this);
        if (objF != aVar) {
            objF = c2;
        }
        return objF == aVar ? aVar : c2;
    }
}
