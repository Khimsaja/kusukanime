package M;

import K5.C0338q;
import K5.InterfaceC0329h;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class D implements u.j {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6211b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final C0338q f6212c;

    public D(u.k kVar, long j7) {
        this.a = j7;
        this.f6212c = new C0338q(kVar.a, this, 2);
    }

    @Override // u.j
    public final InterfaceC0329h a() {
        return this.f6212c;
    }
}
