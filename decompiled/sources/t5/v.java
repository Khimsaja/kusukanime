package t5;

import e5.AbstractC0832b;

/* loaded from: classes.dex */
public abstract class v implements e {
    public final e4.k a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16143b;

    public v(String str, e4.k kVar) {
        this.a = kVar;
        this.f16143b = "must return ".concat(str);
    }

    @Override // t5.e
    public final /* bridge */ String a(J4.f fVar) {
        return AbstractC0832b.v(this, fVar);
    }

    @Override // t5.e
    public final boolean b(J4.f fVar) {
        return kotlin.jvm.internal.l.a(fVar.f17494q, this.a.invoke(d5.e.e(fVar)));
    }

    @Override // t5.e
    public final String c() {
        return this.f16143b;
    }
}
