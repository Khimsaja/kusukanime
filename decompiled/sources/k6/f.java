package k6;

import H1.C0231l;
import f6.C0890D;
import f6.C0895I;
import f6.InterfaceC0923u;
import f6.InterfaceC0924v;
import j6.i;
import java.util.ArrayList;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class f implements InterfaceC0923u {
    public final i a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12698b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12699c;

    /* renamed from: d, reason: collision with root package name */
    public final C0231l f12700d;

    /* renamed from: e, reason: collision with root package name */
    public final C0890D f12701e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12702f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12703g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12704h;

    /* renamed from: i, reason: collision with root package name */
    public int f12705i;

    public f(i iVar, ArrayList arrayList, int i7, C0231l c0231l, C0890D c0890d, int i8, int i9, int i10) {
        l.f("call", iVar);
        l.f("request", c0890d);
        this.a = iVar;
        this.f12698b = arrayList;
        this.f12699c = i7;
        this.f12700d = c0231l;
        this.f12701e = c0890d;
        this.f12702f = i8;
        this.f12703g = i9;
        this.f12704h = i10;
    }

    public static f a(f fVar, int i7, C0231l c0231l, C0890D c0890d, int i8) {
        if ((i8 & 1) != 0) {
            i7 = fVar.f12699c;
        }
        int i9 = i7;
        if ((i8 & 2) != 0) {
            c0231l = fVar.f12700d;
        }
        C0231l c0231l2 = c0231l;
        if ((i8 & 4) != 0) {
            c0890d = fVar.f12701e;
        }
        C0890D c0890d2 = c0890d;
        int i10 = fVar.f12702f;
        int i11 = fVar.f12703g;
        int i12 = fVar.f12704h;
        fVar.getClass();
        l.f("request", c0890d2);
        return new f(fVar.a, fVar.f12698b, i9, c0231l2, c0890d2, i10, i11, i12);
    }

    public final C0895I b(C0890D c0890d) {
        l.f("request", c0890d);
        ArrayList arrayList = this.f12698b;
        int size = arrayList.size();
        int i7 = this.f12699c;
        if (i7 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f12705i++;
        C0231l c0231l = this.f12700d;
        if (c0231l != null) {
            if (!((j6.e) c0231l.f3532n).b(c0890d.a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must retain the same host and port").toString());
            }
            if (this.f12705i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i8 = i7 + 1;
        f fVarA = a(this, i8, null, c0890d, 58);
        InterfaceC0924v interfaceC0924v = (InterfaceC0924v) arrayList.get(i7);
        C0895I c0895iIntercept = interfaceC0924v.intercept(fVarA);
        if (c0895iIntercept == null) {
            throw new NullPointerException("interceptor " + interfaceC0924v + " returned null");
        }
        if (c0231l != null && i8 < arrayList.size() && fVarA.f12705i != 1) {
            throw new IllegalStateException(("network interceptor " + interfaceC0924v + " must call proceed() exactly once").toString());
        }
        if (c0895iIntercept.f11501q != null) {
            return c0895iIntercept;
        }
        throw new IllegalStateException(("interceptor " + interfaceC0924v + " returned a response with no body").toString());
    }
}
