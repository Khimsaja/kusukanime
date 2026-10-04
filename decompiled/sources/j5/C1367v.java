package j5;

/* renamed from: j5.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1367v extends AbstractC1368w {

    /* renamed from: d, reason: collision with root package name */
    public final W4.c f12477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1367v(W4.c cVar, T4.g gVar, T4.i iVar, P4.g gVar2) {
        super(gVar, iVar, gVar2);
        kotlin.jvm.internal.l.f("fqName", cVar);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        this.f12477d = cVar;
    }

    @Override // j5.AbstractC1368w
    public final W4.c a() {
        return this.f12477d;
    }
}
