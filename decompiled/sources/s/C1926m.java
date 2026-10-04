package s;

import D.C0076u;
import java.util.concurrent.CancellationException;
import p.AbstractC1745d;
import p.C1761m;
import p.C1772x;

/* renamed from: s.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1926m extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public kotlin.jvm.internal.u f15342k;

    /* renamed from: l, reason: collision with root package name */
    public C1761m f15343l;

    /* renamed from: m, reason: collision with root package name */
    public int f15344m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f15345n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1928n f15346o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1950y0 f15347p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1926m(float f5, C1928n c1928n, C1950y0 c1950y0, S3.c cVar) {
        super(2, cVar);
        this.f15345n = f5;
        this.f15346o = c1928n;
        this.f15347p = c1950y0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1926m(this.f15345n, this.f15346o, this.f15347p, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1926m) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        float f5;
        C1761m c1761m;
        kotlin.jvm.internal.u uVar;
        C1772x c1772x;
        C0076u c0076u;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15344m;
        if (i7 == 0) {
            P3.r.Y(obj);
            f5 = this.f15345n;
            if (Math.abs(f5) > 1.0f) {
                kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
                uVar2.f12717k = f5;
                kotlin.jvm.internal.u uVar3 = new kotlin.jvm.internal.u();
                C1761m c1761mB = AbstractC1745d.b(0.0f, f5);
                try {
                    C1928n c1928n = this.f15346o;
                    c1772x = c1928n.a;
                    c0076u = new C0076u(uVar3, this.f15347p, uVar2, c1928n, 3);
                    this.f15342k = uVar2;
                    this.f15343l = c1761mB;
                    this.f15344m = 1;
                } catch (CancellationException unused) {
                    c1761m = c1761mB;
                    uVar = uVar2;
                    uVar.f12717k = ((Number) c1761m.a()).floatValue();
                    f5 = uVar.f12717k;
                    return new Float(f5);
                }
                if (AbstractC1745d.f(c1761mB, c1772x, false, c0076u, this) == aVar) {
                    return aVar;
                }
                uVar = uVar2;
                f5 = uVar.f12717k;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1761m = this.f15343l;
            uVar = this.f15342k;
            try {
                P3.r.Y(obj);
            } catch (CancellationException unused2) {
                uVar.f12717k = ((Number) c1761m.a()).floatValue();
                f5 = uVar.f12717k;
                return new Float(f5);
            }
            f5 = uVar.f12717k;
        }
        return new Float(f5);
    }
}
