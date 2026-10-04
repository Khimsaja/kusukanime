package w0;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: w0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2207z implements InterfaceC2174I {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2174I f16895b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2169D f16896c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2174I f16898e;

    public /* synthetic */ C2207z(InterfaceC2174I interfaceC2174I, C2169D c2169d, int i7, InterfaceC2174I interfaceC2174I2, int i8) {
        this.a = i8;
        this.f16896c = c2169d;
        this.f16897d = i7;
        this.f16898e = interfaceC2174I2;
        this.f16895b = interfaceC2174I;
    }

    @Override // w0.InterfaceC2174I
    public final int e() {
        switch (this.a) {
        }
        return this.f16895b.e();
    }

    @Override // w0.InterfaceC2174I
    public final int l() {
        switch (this.a) {
        }
        return this.f16895b.l();
    }

    @Override // w0.InterfaceC2174I
    public final Map m() {
        switch (this.a) {
        }
        return this.f16895b.m();
    }

    @Override // w0.InterfaceC2174I
    public final void n() {
        boolean z7;
        switch (this.a) {
            case 0:
                C2169D c2169d = this.f16896c;
                c2169d.f16820o = this.f16897d;
                this.f16898e.n();
                Set setEntrySet = c2169d.f16827v.entrySet();
                kotlin.jvm.internal.l.f("<this>", setEntrySet);
                Iterator it = setEntrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Y y7 = (Y) entry.getValue();
                    int iJ = c2169d.f16828w.j(key);
                    if (iJ < 0 || iJ >= c2169d.f16820o) {
                        y7.dispose();
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        it.remove();
                    }
                }
                break;
            default:
                C2169D c2169d2 = this.f16896c;
                c2169d2.f16819n = this.f16897d;
                this.f16898e.n();
                c2169d2.d(c2169d2.f16819n);
                break;
        }
    }

    @Override // w0.InterfaceC2174I
    public final e4.k o() {
        switch (this.a) {
        }
        return this.f16895b.o();
    }
}
