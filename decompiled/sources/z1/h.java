package z1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class h implements g {

    /* renamed from: b, reason: collision with root package name */
    public e f18963b;

    /* renamed from: c, reason: collision with root package name */
    public e f18964c;

    /* renamed from: d, reason: collision with root package name */
    public e f18965d;

    /* renamed from: e, reason: collision with root package name */
    public e f18966e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f18967f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f18968g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18969h;

    public h() {
        ByteBuffer byteBuffer = g.a;
        this.f18967f = byteBuffer;
        this.f18968g = byteBuffer;
        e eVar = e.f18959e;
        this.f18965d = eVar;
        this.f18966e = eVar;
        this.f18963b = eVar;
        this.f18964c = eVar;
    }

    @Override // z1.g
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f18968g;
        this.f18968g = g.a;
        return byteBuffer;
    }

    @Override // z1.g
    public boolean b() {
        return this.f18966e != e.f18959e;
    }

    @Override // z1.g
    public final void c() {
        this.f18969h = true;
        i();
    }

    @Override // z1.g
    public boolean d() {
        return this.f18969h && this.f18968g == g.a;
    }

    @Override // z1.g
    public final e f(e eVar) {
        this.f18965d = eVar;
        this.f18966e = g(eVar);
        return b() ? this.f18966e : e.f18959e;
    }

    @Override // z1.g
    public final void flush() {
        this.f18968g = g.a;
        this.f18969h = false;
        this.f18963b = this.f18965d;
        this.f18964c = this.f18966e;
        h();
    }

    public abstract e g(e eVar);

    public final ByteBuffer k(int i7) {
        if (this.f18967f.capacity() < i7) {
            this.f18967f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f18967f.clear();
        }
        ByteBuffer byteBuffer = this.f18967f;
        this.f18968g = byteBuffer;
        return byteBuffer;
    }

    @Override // z1.g
    public final void reset() {
        flush();
        this.f18967f = g.a;
        e eVar = e.f18959e;
        this.f18965d = eVar;
        this.f18966e = eVar;
        this.f18963b = eVar;
        this.f18964c = eVar;
        j();
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }
}
