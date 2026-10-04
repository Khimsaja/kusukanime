package u4;

/* renamed from: u4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2113t extends S {
    public final W4.e a;

    /* renamed from: b, reason: collision with root package name */
    public final q5.e f16340b;

    public C2113t(W4.e eVar, q5.e eVar2) {
        kotlin.jvm.internal.l.f("underlyingType", eVar2);
        this.a = eVar;
        this.f16340b = eVar2;
    }

    @Override // u4.S
    public final boolean a(W4.e eVar) {
        return this.a.equals(eVar);
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.a + ", underlyingType=" + this.f16340b + ')';
    }
}
