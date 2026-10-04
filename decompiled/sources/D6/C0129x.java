package D6;

import H5.C0270k;
import com.kusukanime.data.KusuApi;
import f6.C0890D;

/* renamed from: D6.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129x implements InterfaceC0114h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1769k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0270k f1770l;

    public /* synthetic */ C0129x(C0270k c0270k, int i7) {
        this.f1769k = i7;
        this.f1770l = c0270k;
    }

    @Override // D6.InterfaceC0114h
    public final void a(InterfaceC0111e interfaceC0111e, Throwable th) {
        switch (this.f1769k) {
            case 0:
                kotlin.jvm.internal.l.f("call", interfaceC0111e);
                this.f1770l.resumeWith(P3.r.r(th));
                break;
            case 1:
                kotlin.jvm.internal.l.f("call", interfaceC0111e);
                this.f1770l.resumeWith(P3.r.r(th));
                break;
            default:
                kotlin.jvm.internal.l.f("call", interfaceC0111e);
                this.f1770l.resumeWith(P3.r.r(th));
                break;
        }
    }

    @Override // D6.InterfaceC0114h
    public final void d(InterfaceC0111e interfaceC0111e, V v5) {
        switch (this.f1769k) {
            case 0:
                kotlin.jvm.internal.l.f("call", interfaceC0111e);
                boolean zE = v5.a.e();
                C0270k c0270k = this.f1770l;
                if (!zE) {
                    c0270k.resumeWith(P3.r.r(new r(v5)));
                    break;
                } else {
                    Object obj = v5.f1733b;
                    if (obj != null) {
                        c0270k.resumeWith(obj);
                        break;
                    } else {
                        C0890D c0890dJ = interfaceC0111e.j();
                        c0890dJ.getClass();
                        Object objCast = C0127v.class.cast(c0890dJ.f11478e.get(C0127v.class));
                        kotlin.jvm.internal.l.c(objCast);
                        c0270k.resumeWith(P3.r.r(new O3.g("Response from " + KusuApi.class.getName() + '.' + ((C0127v) objCast).f1765b.getName() + " was null but response body type was declared as non-null")));
                        break;
                    }
                }
            case 1:
                kotlin.jvm.internal.l.f("call", interfaceC0111e);
                boolean zE2 = v5.a.e();
                C0270k c0270k2 = this.f1770l;
                if (!zE2) {
                    c0270k2.resumeWith(P3.r.r(new r(v5)));
                    break;
                } else {
                    c0270k2.resumeWith(v5.f1733b);
                    break;
                }
            default:
                kotlin.jvm.internal.l.f("call", interfaceC0111e);
                this.f1770l.resumeWith(v5);
                break;
        }
    }
}
