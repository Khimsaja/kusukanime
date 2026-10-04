package B6;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class e implements z6.b {

    /* renamed from: k, reason: collision with root package name */
    public final String f552k;

    /* renamed from: l, reason: collision with root package name */
    public volatile z6.b f553l;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f554m;

    /* renamed from: n, reason: collision with root package name */
    public Method f555n;

    /* renamed from: o, reason: collision with root package name */
    public A6.a f556o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedBlockingQueue f557p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f558q;

    public e(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z7) {
        this.f552k = str;
        this.f557p = linkedBlockingQueue;
        this.f558q = z7;
    }

    @Override // z6.b
    public final boolean a() {
        return l().a();
    }

    @Override // z6.b
    public final boolean b() {
        return l().b();
    }

    @Override // z6.b
    public final void c(String str, Throwable th) {
        l().c(str, th);
    }

    @Override // z6.b
    public final void d(String str) {
        l().d(str);
    }

    @Override // z6.b
    public final void e(String str) {
        l().e(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e.class == obj.getClass() && this.f552k.equals(((e) obj).f552k);
    }

    @Override // z6.b
    public final boolean f() {
        return l().f();
    }

    @Override // z6.b
    public final boolean g(int i7) {
        return l().g(i7);
    }

    @Override // z6.b
    public final boolean h() {
        return l().h();
    }

    public final int hashCode() {
        return this.f552k.hashCode();
    }

    @Override // z6.b
    public final void i(String str) {
        l().i(str);
    }

    @Override // z6.b
    public final boolean j() {
        return l().j();
    }

    @Override // z6.b
    public final void k(Throwable th) {
        l().k(th);
    }

    public final z6.b l() {
        if (this.f553l != null) {
            return this.f553l;
        }
        if (this.f558q) {
            return b.f549k;
        }
        if (this.f556o == null) {
            A6.a aVar = new A6.a();
            aVar.f258k = this;
            aVar.f259l = this.f557p;
            this.f556o = aVar;
        }
        return this.f556o;
    }

    public final boolean m() {
        Boolean bool = this.f554m;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f555n = this.f553l.getClass().getMethod("log", A6.c.class);
            this.f554m = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f554m = Boolean.FALSE;
        }
        return this.f554m.booleanValue();
    }
}
