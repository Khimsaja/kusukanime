package androidx.lifecycle;

import android.os.Bundle;
import c.C0743e;
import f1.AbstractC0870c;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class K implements L2.d {
    public final F.w a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10714b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f10715c;

    /* renamed from: d, reason: collision with root package name */
    public final O3.q f10716d;

    public K(F.w wVar, W w7) {
        kotlin.jvm.internal.l.f("savedStateRegistry", wVar);
        this.a = wVar;
        this.f10716d = z1.c.C(new B3.q(9, w7));
    }

    @Override // L2.d
    public final Bundle a() {
        Bundle bundleH = AbstractC0870c.H((O3.l[]) Arrays.copyOf(new O3.l[0], 0));
        Bundle bundle = this.f10715c;
        if (bundle != null) {
            bundleH.putAll(bundle);
        }
        for (Map.Entry entry : ((L) this.f10716d.getValue()).f10717b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((C0743e) ((G) entry.getValue()).f10707b.f322p).a();
            if (!bundleA.isEmpty()) {
                kotlin.jvm.internal.l.f("key", str);
                bundleH.putBundle(str, bundleA);
            }
        }
        this.f10714b = false;
        return bundleH;
    }

    public final void b() {
        if (this.f10714b) {
            return;
        }
        Bundle bundleT = this.a.t("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleH = AbstractC0870c.H((O3.l[]) Arrays.copyOf(new O3.l[0], 0));
        Bundle bundle = this.f10715c;
        if (bundle != null) {
            bundleH.putAll(bundle);
        }
        if (bundleT != null) {
            bundleH.putAll(bundleT);
        }
        this.f10715c = bundleH;
        this.f10714b = true;
    }
}
