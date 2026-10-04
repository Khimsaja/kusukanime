package n5;

import u4.InterfaceC2102h;

/* renamed from: n5.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1582t extends T {

    /* renamed from: b, reason: collision with root package name */
    public final u4.Q[] f13411b;

    /* renamed from: c, reason: collision with root package name */
    public final Q[] f13412c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13413d;

    public C1582t(u4.Q[] qArr, Q[] qArr2, boolean z7) {
        kotlin.jvm.internal.l.f("parameters", qArr);
        kotlin.jvm.internal.l.f("arguments", qArr2);
        this.f13411b = qArr;
        this.f13412c = qArr2;
        this.f13413d = z7;
    }

    @Override // n5.T
    public final boolean b() {
        return this.f13413d;
    }

    @Override // n5.T
    public final Q d(AbstractC1586x abstractC1586x) {
        InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
        u4.Q q6 = interfaceC2102hF instanceof u4.Q ? (u4.Q) interfaceC2102hF : null;
        if (q6 != null) {
            int index = q6.getIndex();
            u4.Q[] qArr = this.f13411b;
            if (index < qArr.length && kotlin.jvm.internal.l.a(qArr[index].v(), q6.v())) {
                return this.f13412c[index];
            }
        }
        return null;
    }

    @Override // n5.T
    public final boolean e() {
        return this.f13412c.length == 0;
    }
}
