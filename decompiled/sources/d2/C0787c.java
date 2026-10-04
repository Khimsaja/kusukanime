package d2;

import K2.C0298b;
import V1.A;
import V1.B;
import V1.u;
import V1.z;

/* renamed from: d2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0787c extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f11231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0298b f11232c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0787c(C0298b c0298b, A a, A a7) {
        super(a);
        this.f11232c = c0298b;
        this.f11231b = a7;
    }

    @Override // V1.u, V1.A
    public final z j(long j7) {
        z zVarJ = this.f11231b.j(j7);
        B b4 = zVarJ.a;
        long j8 = b4.a;
        long j9 = this.f11232c.f4551l;
        B b7 = new B(j8, b4.f9312b + j9);
        B b8 = zVarJ.f9439b;
        return new z(b7, new B(b8.a, b8.f9312b + j9));
    }
}
