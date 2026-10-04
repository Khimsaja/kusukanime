package f6;

import f.AbstractC0841b;
import java.util.regex.Pattern;
import w6.C2224i;
import w6.InterfaceC2226k;

/* renamed from: f6.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896J extends AbstractC0897K {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11509k;

    /* renamed from: l, reason: collision with root package name */
    public final long f11510l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f11511m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC2226k f11512n;

    public /* synthetic */ C0896J(Object obj, long j7, InterfaceC2226k interfaceC2226k, int i7) {
        this.f11509k = i7;
        this.f11511m = obj;
        this.f11510l = j7;
        this.f11512n = interfaceC2226k;
    }

    @Override // f6.AbstractC0897K
    public final long b() {
        switch (this.f11509k) {
        }
        return this.f11510l;
    }

    @Override // f6.AbstractC0897K
    public final C0925w e() {
        Object obj = this.f11511m;
        switch (this.f11509k) {
            case 0:
                return (C0925w) obj;
            default:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = C0925w.f11614e;
                return AbstractC0841b.m(str);
        }
    }

    @Override // f6.AbstractC0897K
    public final InterfaceC2226k g() {
        switch (this.f11509k) {
            case 0:
                return (C2224i) this.f11512n;
            default:
                return (w6.C) this.f11512n;
        }
    }
}
